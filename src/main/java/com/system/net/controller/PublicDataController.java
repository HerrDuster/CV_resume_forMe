package com.system.net.controller;

import com.system.net.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PublicDataController {
	
	private final NameService nameService;

	@Autowired
	public PublicDataController(NameService nameService) {
		this.nameService = nameService;
	}

	@RequestMapping(value="/{uid}", method=RequestMethod.GET)
	public String getProfile(@PathVariable("uid") String uid, Model model){
		String fullName = nameService.convertName(uid);
		model.addAttribute("fullName", fullName);
		return "profile";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(){
		return "welcome";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(){
		return "search";
	}

	@RequestMapping(value = "/sing-in", method = RequestMethod.GET)
	public String singIn(){
		return "sing-in";
	}

	@RequestMapping(value = "/sing-up" , method = RequestMethod.GET)
	public String singUp(){
		return "sing-up";
	}

	@RequestMapping(value="/error", method=RequestMethod.GET)
	public String getError(){
		return "error";
	}
}
