package com.fs.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemController {
	
	@RequestMapping("/toIndex.action")
	public ModelAndView toIndex() {// 从这跳转至主界面index,配置完前后缀
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
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
	
}
