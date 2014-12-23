package com.tbn.sg3.sms.contoroller.insert;

import java.util.Locale;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tbn.sg3.sms.beans.User.User;
import com.tbn.sg3.sms.common.ConstUtil;
import com.tbn.sg3.sms.service.user.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = ConstUtil.INSERT_PATH)
public class InsertController {
	
	private static final Logger logger = LoggerFactory.getLogger(InsertController.class);

	@Autowired
    private Properties applicationProperties;
	
	@Autowired
	private UserService userImpl;
	
	// @ModelAttributeのデフォルトの属性名はクラス名の先頭を小文字にしたもの。
	// この場合、「user」がinsert.jspの「modelAttribute」のuserと一致
	@ModelAttribute
	public User userForm(){
		return new User();
	}
	/**
	 * Simply selects the index.jsp view to render by returning its name.
	 */
	@RequestMapping
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("title", applicationProperties.getProperty("link.ins"));
		
		// 表示したいJSPファイルを指定
		return ConstUtil.INSERT_PATH;
	}
	
	@RequestMapping(value = "/insert",method=RequestMethod.GET)
	public String insert(User user, Model model) {
		
		model.addAttribute("title", applicationProperties.getProperty("link.ins"));
		model.addAttribute("name", user.getName());
		
		userImpl.insert(user);
		
		// 表示したいJSPファイルを指定
		return ConstUtil.INSERT_PATH;
	}
	
}
