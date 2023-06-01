package com.valtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.valtech.dao.UserDao;
import com.valtech.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserDao userDao;
	
	@Override
	public String getAllUsers(Model m) {
		List<User> list = userDao.getUsers();
		m.addAttribute("list", list);
		System.out.println("list of roles displayed");
		return "managerList";
	}

	// deleteing the user manager
	@Override
	public String delete(@PathVariable int id) {
		userDao.deleteUser(id);
		return "redirect:/managerList";
	}
	
	
	
	
	    @Override
	    public String showform(Model m){  
	    	m.addAttribute("command", new User());
	    	return "addManager"; 
	    }  
	
	// edit the manager
	@Override
	public String edit(@PathVariable int id, Model m) {
		User user = userDao.getUserbyUser(id);
		m.addAttribute("command", user);
		return "editManager";
	}

	@Override
	public String editsave(@ModelAttribute("user") User user) {
		userDao.updateUser(user);
		return "redirect:/managerList";
	}

	

	@Override
	public String save(@ModelAttribute("user") User user) {
		userDao.save(user);
		return "redirect:/managerList";// will redirect to viewemp request mapping

	}

}
