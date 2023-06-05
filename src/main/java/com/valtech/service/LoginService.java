package com.valtech.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.valtech.vm.UserVm;

public interface LoginService {

	String init(Model model);

	String loginUser(UserVm user, BindingResult result, ModelMap m, HttpSession httpSession);

}