package com.tbn.sg3.sms.contoroller.index;

import java.util.Locale;

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
public class IndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private UserService user;

	/**
	 * Simply selects the index.jsp view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		user.all();
		// 表示したいJSPファイルを指定
		return "index";
	}
	
}
