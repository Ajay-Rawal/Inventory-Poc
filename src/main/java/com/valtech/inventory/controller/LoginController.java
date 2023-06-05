package com.valtech.inventory.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.valtech.dao.UserDao;
import com.valtech.service.LoginService;
import com.valtech.vm.UserVm;


@Controller
public class LoginController{

	@Autowired
	UserDao userDao;
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String init(Model model) {
	return loginService.init(model);

	}
	


	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public String loginUser(@Validated @ModelAttribute("user") UserVm user,
	                        BindingResult result,
	                        ModelMap m,
	                        HttpSession httpSession) {
	   return loginService.loginUser(user, result, m, httpSession);
	}
	


}
	


  
 

