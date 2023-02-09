package com.hyungso.root;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value ="/login")
	public String login() {
		
		
		return "login";
	}
	
	@RequestMapping(value = "/loginOk")
	public ModelAndView loginOk(HttpServletRequest request, Model model) {
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		System.out.println(mid + " " + mpw + " ");
		ModelAndView m = new ModelAndView();
		
		m.addObject("mid", mid);
		m.addObject("mpw", mpw);
		m.setViewName("confirmId");

		return m;
	}
	@RequestMapping(value = "/loginOk2")
	public String loginOk2(@RequestParam("mid") String mid, @RequestParam("mpw") String mpw, Model model) {
//		String mid = request.getParameter("mid");
//		String mpw = request.getParameter("mpw");
		System.out.println(mid + " " + mpw + " ");
		
		model.addAttribute("mid", mid);
		model.addAttribute("mpw", mpw);
		return "confirmId";
	}
	@RequestMapping(value = "/join")
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "/joinOk")
	public String joinOk(MemberDto memberDto) {
		
		System.out.println(memberDto);

		return "joinOk";
	}
	
//	@RequestMapping(value = "/joinOk")
//	public String joinOk(@ModelAttribute("dto") MemberDto memberDto) {
//		
//		System.out.println(memberDto);
//
//		return "joinOk";
//	}
	
	@RequestMapping(value = "/point/{memberPoint}")
	public String memberPoint (@PathVariable String memberPoint, Model model) {
		
		model.addAttribute("memberpoint", memberPoint);
		return "pointOutput";
	}
}
