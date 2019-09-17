package com.fs.springmvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fs.service.UserService;
import com.fs.domain.User;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	/*
	@RequestMapping("/login.action")
	public ModelAndView toIndex() {// 从这跳转至主界面index,配置完前后缀
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	*/
	
	@ResponseBody
	@RequestMapping("/ajaxUsername.action")
	public String checkUsername(String username) {
		System.out.println("username: " + username);
		// 根据名字查询
		boolean res = service.checkUserName(username);
		String str = res ? "FFF" : "NNN";
		System.out.println("res: " + res);
		
		return str;
	}
	
	@ResponseBody
	@RequestMapping("/ajaxPassword.action")
	public String checkPassword(User user) {
		User rntUser = service.checkUserLogin(user);
		String str = rntUser != null ? "Yes" : "False";
		return str;
	}
	
	@RequestMapping("/registUser.action")
	public ModelAndView addUser(User user) {
		service.saveUser(user);// 数据库中添加
		//req.setAttribute("username", user.getUsername());// 使user.html显示用户名
		//req.getRequestDispatcher("user.html").forward(req, resp);// 转发
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user.html");
		//modelAndView.addObject("username", user.getUsername());
		
		return modelAndView;
	}
	
	/*
	@RequestMapping("/userLogin.action")
	public ModelAndView userLogin(User user) {// 将传过来的用户名和密码用User进行参数绑定
		System.out.println("user: " + user);
		User rntUser = service.checkUserLogin(user);
		System.out.println("查询后");
		System.out.println("rntUser: " + rntUser);
		String message;
		if (rntUser == null) 
			message = "登录失败";
		else {
			message = "欢迎" + user.getUsername();
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mess", message);
		modelAndView.setViewName("success");
		return modelAndView;
	}
	*/
	
	/*
	@RequestMapping("/toHeader.action")
	public ModelAndView toHeader() {// 跳转至分类页Header
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Header");
		return modelAndView;
	}
	
	@RequestMapping("/toList.action")
	public ModelAndView toList() {// 从这跳转至分类页List
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}
	
	@RequestMapping("/toGoods.action")
	public ModelAndView toGoods() {// 从这跳转至商品详情页
		return null;
	}
	
	@RequestMapping("/toOrderSubmission.action")
	public ModelAndView toOrderSubmission() {// 从这跳转至商品提交页面
		return null;
	}
	
	@RequestMapping("/toOrderSuccess.action")
	public ModelAndView toOrderSuccess() {// 从这跳转至商品提交成功页面
		return null;
	}
	
	@RequestMapping("/toShoppingCart.action")
	public ModelAndView toShoppingCart() {// 从这跳转至购物车
		return null;
	}
	*/
	
}
