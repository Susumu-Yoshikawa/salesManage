package com.tbn.sg3.sms.contoroller.select.search;

import java.util.Locale;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tbn.sg3.sms.service.user.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SelectSearchController {
	
	private static final Logger logger = LoggerFactory.getLogger(SelectSearchController.class);

	@Autowired
    private Properties applicationProperties;
	
	@Autowired
	private UserService user;
	
	//public static final String PATH=new Properties().getProperty("path.sel.all");
	
	/**
	 * Simply selects the index.jsp view to render by returning its name.
	 */
	@RequestMapping(value = "/db/select/search")
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		String title = applicationProperties.getProperty("link.sel.sea");
		model.addAttribute("title", title);
		model.addAttribute("test", user.all());
		
		// 表示したいJSPファイルを指定
		return "/db/select/search";
	}
	
}
