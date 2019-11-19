package com.sunwx.managers.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年9月2日上午11:11:41
 * @version 1.0
 */
@Controller
public class PageController {

    @RequestMapping("/test")
    public  void test(){

        System.out.println("working!!!");
    }
	/**
	 * 打开首页
	 */
	@RequestMapping("/1")
	public String showIndex() {
		System.out.println("11111111");
		return "index";
	}
	/**
	 * 展示其他页面
	 * <p>Title: showpage</p>
	 * <p>Description: </p>
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return page;
	}
}
