package com.valtech.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import com.valtech.model.Product;
import com.valtech.model.User;
import com.valtech.model.Warehouse;

@Controller
public class WarehouseController {
	
	@Autowired
	WarehouseDAO warehouseDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/warehouseList")
	public String listWarehouses(Model model) {
		List<Warehouse> list = warehouseDAO.getAllWarehouses();
		model.addAttribute("list", list);
		return "warehouseList";
	}
	

	@RequestMapping(value = "/searchManager", method = RequestMethod.GET)
	public String search(@RequestParam("userId") int userId, Model model) {
		try {
	  User user = userDao.getUserbyUserName(userId);
	  model.addAttribute("user", user);
	  System.out.println("mList");
	  return "mList";
		}
		catch(Exception e){
			return "error";
			
		}
	}
	
	@GetMapping("/warehouse/add")
	public String showAddWarehouseForm(Model model) {
		Warehouse warehouse = new Warehouse();
		model.addAttribute("warehouse", warehouse);
		return "addWarehouse";
	}
	
	@PostMapping("/warehouse/add")
	public String addWarehouse(@ModelAttribute("warehouse") Warehouse warehouse, BindingResult result) {
		if (result.hasErrors()) {
			return "addWarehouse";
		}
		warehouseDAO.addWarehouse(warehouse);
		return "redirect:/warehouse/list";
	}
	
	@GetMapping("/warehouse/edit/{id}")
	public String showEditWarehouseForm(@PathVariable("id") int id, Model model) {
		Warehouse warehouse = warehouseDAO.getWarehouseById(id);
		model.addAttribute("warehouse", warehouse);
		return "editWarehouse";
	}
	
	@PostMapping("/warehouse/edit/{id}")
	public String editWarehouse(@PathVariable("id") int id, @ModelAttribute("warehouse") Warehouse warehouse,
			BindingResult result) {
		if (result.hasErrors()) {
			return "editWarehouse";
		}
		warehouse.setWid(id);
		warehouseDAO.updateWarehouse(warehouse);
		return "redirect:/warehouse/list";
	}
	
	@GetMapping("/warehouse/delete/{id}")
	public String deleteWarehouse(@PathVariable("id") int id) {
		warehouseDAO.deleteWarehouse(id);
		return "redirect:/warehouse/list";
	}

	
}






















//
//
//
//@RequestMapping("/phoneList/{userId}")
//public String getAllProductsphone(@PathVariable int userId,  Model m) {
//	User user=userDao.getUserbyUser(userId);
//	List<Product> product = (List<Product>)productDAO.getAllProductsphone();	
//	m.addAttribute("user", user);
//	m.addAttribute("product", product);
//	System.out.println("list of Product displayed");
//	return "phoneList";
//
//}
//
//
//@RequestMapping("/laptopList/{userId}")
//public String getAllProductlaptop(Model m) {
//	List<Product> list = productDAO.getAllProductlaptop();
//	m.addAttribute("list", list);
//	System.out.println("list of Product displayed");
//	return "laptopList";		
//
//}