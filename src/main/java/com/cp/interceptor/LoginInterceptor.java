package com.cp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.cp.entity.User;


public class LoginInterceptor extends HandlerInterceptorAdapter {
	private static final String[] IGNORE_URI = {"/login.jsp", "/login"};
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		 boolean flag = false;
	        String url = request.getRequestURL().toString();
	        for (String s : IGNORE_URI) {
	            if (url.contains(s)) {
	                flag = true;
	                break;
	            }
	        }
	       
	        if (!flag) {
	           User user = (User)request.getSession().getAttribute("user");
	           if(null == user){
	        	   response.sendRedirect(request.getContextPath()+"/login.jsp");
	        	   return false;
	           }else{
	        	   return true;
	           }
	        }
	        return flag;
		
	}

}
