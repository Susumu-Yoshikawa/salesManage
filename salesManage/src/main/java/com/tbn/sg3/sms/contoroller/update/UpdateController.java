package com.tbn.sg3.sms.contoroller.update;

import java.util.Locale;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tbn.sg3.sms.common.ConstUtil;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UpdateController {
	
	private static final Logger logger = LoggerFactory.getLogger(UpdateController.class);

	@Autowired
    private Properties applicationProperties;
	
	
	/**
	 * Simply selects the index.jsp view to render by returning its name.
	 */
	@RequestMapping(value = ConstUtil.UPDATE_PATH)
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("title", applicationProperties.getProperty("link.upd"));
		
		// 表示したいJSPファイルを指定
		return ConstUtil.UPDATE_PATH;
	}
	
}
