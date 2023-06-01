package com.valtech.service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.valtech.model.User;

public interface UserService {

	String getAllUsers(Model m);

	// deleteing the user manager
	String delete(int id);

	String showform(Model m);

	// edit the manager
	String edit(int id, Model m);

	String editsave(User user);

	String save(User user);

}