package com.tbn.sg3.sms.contoroller.select;

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
public class selectController {
	
	private static final Logger logger = LoggerFactory.getLogger(selectController.class);

	@Autowired
    private Properties applicationProperties;
	
	@Autowired
	private UserService user;
	
	/**
	 * Simply selects the index.jsp view to render by returning its name.
	 */
	@RequestMapping(value = "/db/select")
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		String title = applicationProperties.getProperty("link.sel");
		String url = applicationProperties.getProperty("path.sel.all");
		model.addAttribute("title", title);
		model.addAttribute("url",url);
		//model.addAttribute("test", user.all());
		
		// 表示したいJSPファイルを指定
		return "/db/select";
	}
	
}
