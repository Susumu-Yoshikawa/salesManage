package com.tbn.sales;

import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sales.Automobile.Automobile;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws IOException 
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws IOException {
		logger.info("Welcome home! The client locale is!! {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSession session = new SqlSessionFactoryBuilder().build(reader).openSession();
        Automobile sample1 = (Automobile)session.selectOne("select", 12);
        System.out.println(sample1);
        // List
        List<Automobile> sample2 = (List<Automobile>)session.selectList("select_all");
        for (Automobile a : sample2) {
            System.out.println("a = [" + a + "]");
        }
        // Insert
        Automobile insert_data = new Automobile(12,"bbb" , "foo" , 19790114);
        session.insert("insert", insert_data);

        session.commit();
		
		return "home";
	}
	
}
