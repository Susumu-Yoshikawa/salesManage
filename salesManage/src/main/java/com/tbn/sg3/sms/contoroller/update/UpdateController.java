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
 * 更新コントローラー
 * @author TEST
 * @version 2015/01/11
 */
@Controller
@RequestMapping(value = ConstUtil.UPDATE_PATH)
public class UpdateController {
	

	/** プロパティクラス */
	@Autowired
    private Properties applicationProperties;
	
	/** UserServiceImplementsクラス */
	@Autowired
	private UserService userImpl;
	
	// @ModelAttributeのデフォルトの属性名はクラス名の先頭を小文字にしたもの。
	// この場合、「user」がupdate.jspの「modelAttribute」のuserと一致
	/**
	 * ビューからコントローラーにデータを送るための処理
	 * 
	 * @return ユーザークラス
	 */
	@ModelAttribute
	public User userForm(){
		return new User();
	}
	
	/**
	 * 更新画面初期表示
	 * 
	 * @param userId
	 * @param model
	 * @return update.jsp(更新画面)
	 */
	@RequestMapping(value = "/{userId}",method=RequestMethod.GET)
	public String index(@PathVariable("userId") int userId, Model model) {
		
		// 引数をもとにテーブルからデータ取得
		User us = userImpl.select(userId);
		
		// モデルにセット
		model.addAttribute("title", applicationProperties.getProperty("link.upd"));
		model.addAttribute("userObj", us);
		
		// 表示したいJSPファイルを指定
		return ConstUtil.UPDATE_PATH;
	}
	
	/**
	 * 更新処理後表示<br>
	 * 改行改行
	 * 
	 * @param user
	 * @param model
	 * @return complete.jsp
	 */
	@RequestMapping(value = "/complete",method=RequestMethod.GET)
	public String update(User user, Model model) {
		
		/* ユーザIDをキーに
		 * 名前の更新処理
		 */
		userImpl.update(user);
		
		// モデルにセット
		model.addAttribute("title", applicationProperties.getProperty("link.cmp"));
		model.addAttribute("form", applicationProperties.getProperty("link.upd"));
		model.addAttribute("name", user.getName());
		
		// 表示したいJSPファイルを指定
		return ConstUtil.COMPLETE_PATH;
	}
	
}
