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
import com.valtech.service.WarehouseService;

@Controller
public class WarehouseController {
	
	@Autowired
	WarehouseDAO warehouseDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	WarehouseService warehouseService;
	
	@RequestMapping("/warehouseList")
	public String listWarehouses(Model model) {
		return warehouseService.listWarehouses(model);
	}
	

	@RequestMapping(value = "/searchManager", method = RequestMethod.GET)
	public String search(@RequestParam("userId") int userId, Model model) {
		return warehouseService.search(userId, model);
	}
	
	@GetMapping("/warehouse/add")
	public String showAddWarehouseForm(Model model) {
		return warehouseService.showAddWarehouseForm(model);
	}
	
	@PostMapping("/warehouse/add")
	public String addWarehouse(@ModelAttribute("warehouse") Warehouse warehouse, BindingResult result) {
		return warehouseService.addWarehouse(warehouse, result);
	}
	
	@GetMapping("/warehouse/edit/{id}")
	public String showEditWarehouseForm(@PathVariable("id") int id, Model model) {
		return warehouseService.showEditWarehouseForm(id, model);
	}
	
	@PostMapping("/warehouse/edit/{id}")
	public String editWarehouse(@PathVariable("id") int id, @ModelAttribute("warehouse") Warehouse warehouse,
			BindingResult result) {
		return warehouseService.editWarehouse(id, warehouse, result);
	}
	
	@GetMapping("/warehouse/delete/{id}")
	public String deleteWarehouse(@PathVariable("id") int id) {
		return warehouseService.deleteWarehouse(id);
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