package com.tbn.sg3.sms.contoroller.update;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tbn.sg3.sms.beans.User.User;
import com.tbn.sg3.sms.common.ConstUtil;
import com.tbn.sg3.sms.service.user.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = ConstUtil.UPDATE_PATH)
public class UpdateController {
	

	@Autowired
    private Properties applicationProperties;
	
	@Autowired
	private UserService userImpl;
	
	// @ModelAttributeのデフォルトの属性名はクラス名の先頭を小文字にしたもの。
	// この場合、「user」がupdate.jspの「modelAttribute」のuserと一致
	@ModelAttribute
	public User userForm(){
		return new User();
	}
	
	@RequestMapping(value = "/{userId}",method=RequestMethod.GET)
	public String index(@PathVariable("userId") String userId, Model model) {
		
		User us = userImpl.select(userId);
		
		model.addAttribute("title", applicationProperties.getProperty("link.upd"));
		model.addAttribute("userObj", us);
		
		// 表示したいJSPファイルを指定
		return ConstUtil.UPDATE_PATH;
	}
	
	@RequestMapping(value = "/complete",method=RequestMethod.GET)
	public String update(User user, Model model) {
		
		userImpl.update(user);
		
		model.addAttribute("title", applicationProperties.getProperty("link.cmp"));
		model.addAttribute("form", applicationProperties.getProperty("link.upd"));
		model.addAttribute("name", user.getName());
		
		// 表示したいJSPファイルを指定
		return ConstUtil.COMPLETE_PATH;
	}
	
}
