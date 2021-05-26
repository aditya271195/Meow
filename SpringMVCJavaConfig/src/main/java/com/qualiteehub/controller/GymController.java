package com.qualiteehub.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qualiteehub.entity.Member;
import com.qualiteehub.service.IGymService;
@Controller
public class GymController {
	
	@Autowired
	private IGymService gymsevice;
	
	
	@RequestMapping("/")
	public ModelAndView getIndexPage() {
		ModelAndView mv = new ModelAndView();
		
		/*
		 * Member member = new Member(); Map<String, String> map = new
		 * LinkedHashMap<>(); map.put("1", "Raj"); map.put("2", "Yash");
		 * map.put("3","Anu"); mv.addObject("command",member );
		 * mv.addObject("memberValues", map);
		 */
		mv.setViewName("index");
		return mv;
	}
	
	
	@PostMapping("/register")
	public ModelAndView registerMember(@ModelAttribute("memberObj") Member member) {
		ModelAndView mv = new ModelAndView();
		int i = gymsevice.registerMember(member);
		mv.setViewName("index");
		return mv;
	}
}
