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

import com.valtech.vm.UserVm;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserDao userDao;
	
	@Override
	public String getAllUsers(Model m) {
		try {
		List<UserVm> list = userDao.getUsers();
		m.addAttribute("list", list);
		System.out.println("list of roles displayed");
		return "managerList";
		}
		catch(Exception e) {
			return "error";
		}
	}

	// deleteing the user manager
	@Override
	public String delete(@PathVariable int id) {
		try {
		userDao.deleteUser(id);
		return "redirect:/managerList";
		}
		catch (Exception e) {
			
			return "error";
		}
	}
	
	
	
	
	    @Override
	    public String showform(Model m){  
	    	try {
	    	m.addAttribute("command", new UserVm());
	    	return "addManager"; 
	    	}
	    	catch(Exception e) {
	    		return "error";
	    	}
	    }  
	
	// edit the manager
	@Override
	public String edit(@PathVariable int id, Model m) {
		try {
			UserVm user = userDao.getUserbyUser(id);
		m.addAttribute("command", user);
		return "editManager";
		}
		catch (Exception e) {
			return "error";// TODO: handle exception
		}
	}

	@Override
	public String editsave(@ModelAttribute("user") UserVm user) {
		try {
		userDao.updateUser(user);
		return "redirect:/managerList";
		}catch (Exception e) {
			return "error";
					// TODO: handle exception
		}
	}

	

	@Override
	public String save(@ModelAttribute("user") UserVm user) {
		try {
		userDao.save(user);
		return "redirect:/managerList";// will redirect to viewemp request mapping
		}
		catch (Exception e) {
			return "error";// TODO: handle exception
		}
	}

}
