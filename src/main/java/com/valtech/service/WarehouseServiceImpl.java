package com.valtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.valtech.dao.ProductDAO;
import com.valtech.dao.UserDao;
import com.valtech.dao.WarehouseDAO;


import com.valtech.vm.UserVm;
import com.valtech.vm.WarehouseVm;

@Service
public class WarehouseServiceImpl implements WarehouseService {
	
	
	
	@Autowired
	WarehouseDAO warehouseDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	UserDao userDao;
	
	
	@Override
	public String listWarehouses(Model model) {
		try {
		List<WarehouseVm> list = warehouseDAO.getAllWarehouses();
		model.addAttribute("list", list);
		return "warehouseList";
		}
		catch (Exception e) {
			return "error";// TODO: handle exception
		}
	}
	

	@Override
	public String search(@RequestParam("userId") int userId, Model model) {
		try {
			UserVm user = userDao.getUserbyUserName(userId);
	  model.addAttribute("user", user);
	  System.out.println("mList");
	  return "mList";
		}
		catch(Exception e){
			return "error";
			
		}
	}
	
	
	@Override
	public String showAddWarehouseForm(Model model) {
		try {
			WarehouseVm warehouse = new WarehouseVm();
		model.addAttribute("warehouse", warehouse);
		return "addWarehouse";
		}
		catch (Exception e) {
			return "error";// TODO: handle exception
		}
	}
	
	
	@Override
	public String addWarehouse(@ModelAttribute("warehouse") WarehouseVm warehouse, BindingResult result) {
		if (result.hasErrors()) {
			return "addWarehouse";
		}
		warehouseDAO.addWarehouse(warehouse);
		return "redirect:/warehouse/list";
	}
	
	
	@Override
	public String showEditWarehouseForm(@PathVariable("id") int id, Model model) {
		WarehouseVm warehouse = warehouseDAO.getWarehouseById(id);
		model.addAttribute("warehouse", warehouse);
		return "editWarehouse";
	}
	
	@Override
	public String editWarehouse(@PathVariable("id") int id, @ModelAttribute("warehouse") WarehouseVm warehouse,
			BindingResult result) {
		if (result.hasErrors()) {
			return "editWarehouse";
		}
		warehouse.setWid(id);
		warehouseDAO.updateWarehouse(warehouse);
		return "redirect:/warehouse/list";
	}
	
	@Override
	public String deleteWarehouse(@PathVariable("id") int id) {
		warehouseDAO.deleteWarehouse(id);
		return "redirect:/warehouse/list";
	}

}
