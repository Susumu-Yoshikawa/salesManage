package com.tbn.sg3.sms.contoroller.select.url;

import java.util.Locale;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tbn.sg3.sms.common.ConstUtil;
import com.tbn.sg3.sms.service.user.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SelectUrlController {
	
	private static final Logger logger = LoggerFactory.getLogger(SelectUrlController.class);

	@Autowired
    private Properties applicationProperties;
	
	@Autowired
	private UserService user;
	
	
	/**
	 * Simply selects the index.jsp view to render by returning its name.
	 */
	@RequestMapping(value = ConstUtil.SELECT_URL_PATH+"/{userId}")
	public String index(@PathVariable("userId") int userId, Model model) {
		
		logger.info("AccessUrl"+ConstUtil.SELECT_URL_PATH+"/{"+userId+"}");
		
		String title = applicationProperties.getProperty("link.sel.all");
		model.addAttribute("title", title);
		model.addAttribute("test", user.select(userId));
		
		// 表示したいJSPファイルを指定
		return ConstUtil.SELECT_URL_PATH;
	}
	
}
