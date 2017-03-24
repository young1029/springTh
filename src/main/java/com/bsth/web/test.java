package com.bsth.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BSTH on 2017/3/24.
 */
@Controller
@RequestMapping("/test")
public class test {
	@RequestMapping(value = "/index")
	public String index(){
		return "index";
	}
	@RequestMapping(value = "/add")
	public String add(){
		return "add";
	}
	@RequestMapping(value = "/update")
	public String update(){
		return "update";
	}

}
