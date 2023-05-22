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
import com.valtech.model.User;

@Controller
public class UserControler {

	@Autowired
	private UserDao userDao;

	// list of user manager
	@RequestMapping("/managerList")
	public String getAllUsers(Model m) {
		List<User> list = userDao.getUsers();
		m.addAttribute("list", list);
		System.out.println("list of roles displayed");
		return "managerList";
	}

	// deleteing the user manager
	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		userDao.deleteUser(id);
		return "redirect:/managerList";
	}
	
	
	
	
	  @RequestMapping("/addManager")  
	    public String showform(Model m){  
	    	m.addAttribute("command", new User());
	    	return "addManager"; 
	    }  
	
	// edit the manager
	@RequestMapping(value = "/editManager/{id}")
	public String edit(@PathVariable int id, Model m) {
		User user = userDao.getUserbyUser(id);
		m.addAttribute("command", user);
		return "editManager";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("user") User user) {
		userDao.updateUser(user);
		return "redirect:/managerList";
	}

	

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("user") User user) {
		userDao.save(user);
		return "redirect:/managerList";// will redirect to viewemp request mapping

	}
	
}
    
	
	
	
	
