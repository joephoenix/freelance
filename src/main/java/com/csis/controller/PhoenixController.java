package com.csis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PhoenixController {
	@RequestMapping("phoenix")
	public String view() {
		return "phoenix";
	}

	@ResponseBody
	@RequestMapping("pl")
	public List<String> forgo() {
		List<String> rlist = new ArrayList<String>();
		rlist.add("111");
		rlist.add("222");
		rlist.add("333");
		rlist.add("444");
		rlist.add("555");
		return rlist;
	}

	@ResponseBody
	@RequestMapping(value = "user/{id}")
	public List<String> showuser(@PathVariable String id) {
		List<String> userinfo = new ArrayList<String>();
		if (id.equals("chen")) {
			userinfo.add("chenxx");
			userinfo.add("35");
			userinfo.add("170");
			userinfo.add("140");
		} else {
			userinfo.add("admin");
			userinfo.add("25");
			userinfo.add("175");
			userinfo.add("145");
		}
		return userinfo;
	}

	@RequestMapping(value = "user/new")
	public ModelAndView _new(String userInfo) throws Exception {
		return new ModelAndView("/usernew", "userInfo", userInfo);
	}

}
