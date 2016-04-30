package com.cp.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cp.entity.User;

@Controller
@RequestMapping("/")
public class LoginController {
	private String JSP_PREFIX="/system";
	
	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> login(HttpSession session){
		session.setAttribute("user", new User());
		return null;
	}
	
	@RequestMapping("/index")
	public String index(){
		
		return JSP_PREFIX +"/"+"main";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.removeAttribute("user");
		return "/login";
	}
}
