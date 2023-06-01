package com.valtech.inventory.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.valtech.dao.UserDao;

import com.valtech.service.UserService;
import com.valtech.vm.UserVm;

@Controller
public class UserControler {

	@Autowired
	UserDao userDao;
	
	@Autowired
	UserService userService;

	// list of user manager
	@RequestMapping("/managerList")
	public String getAllUsers(Model m) {
		return userService.getAllUsers(m);
	}

	// deleteing the user manager
	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		return userService.delete(id);
	}
	
	
	
	
	  @RequestMapping("/addManager")  
	    public String showform(Model m){  
	    	return userService.showform(m);
	    }  
	
	// edit the manager
	@RequestMapping(value = "/editManager/{id}")
	public String edit(@PathVariable int id, Model m) {
		return userService.edit(id, m);
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("user") UserVm user) {
		return userService.editsave(user);
	}

	

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("user") UserVm user) {
     return  userService.save(user);
 	}
	
}
    
	
	
	
	
