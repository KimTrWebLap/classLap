package com.classLap.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.classLap.demo.service.IF_BBSservice;
import com.classLap.demo.vo.BBSVO;

@Controller
public class Test {

	@Autowired
	IF_BBSservice bbsservice;

	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String abc() {
		return "index";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/java")
	public String java() {
		return "java";
	}

	@GetMapping("/bbs")
	public String bbs() {
		return "bbs";
	}

	@GetMapping("/wr")
	public String bbswr() {
		return "majorWrite";
	}

	@GetMapping("/blist")
	public String bbslist(Model model) throws Exception {
		List<BBSVO> blist = bbsservice.selectAll();
		System.out.println(blist.size());
		model.addAttribute("blist", blist);
		return "list";
	}

	@PostMapping("/wraction")
	public String wraction(@ModelAttribute BBSVO bbsvo) throws Exception {
		System.out.println(bbsvo.toString());
		bbsservice.insert(bbsvo);
		return "index";
	}
}
