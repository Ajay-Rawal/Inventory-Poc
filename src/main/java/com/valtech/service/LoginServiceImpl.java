package com.valtech.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.valtech.dao.UserDao;
import com.valtech.vm.UserVm;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	UserDao userDao;
	

	@Override
	public String init(Model model) {
		model.addAttribute("User", "user");
		return "login";

		}
	
	
	
	@Override
	public String loginUser(@Validated @ModelAttribute("user") UserVm user,
	                        BindingResult result,
	                        ModelMap m,
	                        HttpSession httpSession) {
	    String UserEmail = user.getEmail();
	    String UserPassword = user.getPassword();

	    try {
	    	UserVm loggedInUser = userDao.findByEmail(UserEmail);

	        if (loggedInUser != null && loggedInUser.getPassword().equals(UserPassword)) {
	            httpSession.setAttribute("user", loggedInUser);

	            if (loggedInUser.getRole().equals("MANAGER")) {
	                return "redirect:/mlogin/"+loggedInUser.getUserId();
	                
//	                if (loggedInUser.getRole().equals("MANAGER")) {
//		                return "redirect:/productList";
//	                
	            } else if (loggedInUser.getRole().equals("ADMIN")) {
	                return "redirect:/managerList";
	            } else {
	                m.addAttribute("error", "Invalid Email or Password");
	                return "login";
	            }
	        } else {
	            m.addAttribute("error", "Invalid Email or Password");
	            return "login";
	        }
	    } catch (EmptyResultDataAccessException ex) {
	        m.addAttribute("error", "Invalid Email or Password");
	        return "login";
	    }
	}
	

}
