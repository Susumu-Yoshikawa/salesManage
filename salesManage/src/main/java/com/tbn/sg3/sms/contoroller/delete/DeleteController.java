package com.tbn.sg3.sms.contoroller.delete;

import java.util.Locale;
import java.util.Properties;

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
@RequestMapping(value = ConstUtil.DELETE_PATH)
public class DeleteController {
	
	//private static final Logger logger = LoggerFactory.getLogger(DeleteController.class);

	@Autowired
    private Properties applicationProperties;
	
	@Autowired
	private UserService userImpl;
	
	// @ModelAttributeのデフォルトの属性名はクラス名の先頭文字を小文字にしたもの。
	// この場合、「user」がdelete.jspの「modelAttribute」のuserと一致
	@ModelAttribute
	public User userForm(){
		return new User();
	}
	
	/**
	 * Simply selects the index.jsp view to render by returning its name.
	 */
	@RequestMapping
	public String index(Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("userall", userImpl.all());
		model.addAttribute("title", applicationProperties.getProperty("link.del"));
		
		// 表示したいJSPファイルを指定
		return ConstUtil.DELETE_PATH;
	}
	
	@RequestMapping(value = "/complete",method=RequestMethod.GET)
	public String delete(User user, Model model) {
		
		userImpl.delete(user);
		
		model.addAttribute("title", applicationProperties.getProperty("link.cmp"));
		model.addAttribute("form",  applicationProperties.getProperty("link.del"));
		model.addAttribute("name",  user.getIds().length+"件");
		
		// 表示したいJSPファイルを指定
		return ConstUtil.COMPLETE_PATH;
	}
	
}
