package com.valtech.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.valtech.dao.ProductDAO;
import com.valtech.dao.UserDao;

import com.valtech.model.User;
import com.valtech.service.ProductService;
import com.valtech.vm.ProductVm;



@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@Autowired
	UserDao userDao;
	
	
	
	// list of All product
	@RequestMapping("/productList")
	public String getAllProducts(Model m) {
		return productService.getAllProducts(m);
		
	
}
	
	// edit the product
		@RequestMapping(value = "/editProduct/{id}")
		public String edit(@PathVariable int id, Model m) {
			return productService.edit(id, m);
		}
		
		
		@RequestMapping(value = "/mlogin/editProductForManager/{id}")
		public String editForManager(@PathVariable int id, Model m) {
			return productService.editForManager(id, m);
		}

		@RequestMapping(value = "/editsaveproduct", method = RequestMethod.POST)
		public String editsave(@ModelAttribute("product") ProductVm product) {
			return productService.editsave(product);
		}
		
		
		@RequestMapping(value = "/mlogin/editProductForManager/editsaveproductForManager", method = RequestMethod.POST)
		public String editsaveForManager(@ModelAttribute("product") ProductVm product) {
			return productService.editsaveForManager(product);
		}
		
		
		 @RequestMapping("/addProduct")  
		    public String showform(Model m){  
		    return productService.showform(m);
		    }  
		 
		 
		 @RequestMapping("mlogin/addProductForManager/{userId}")  
		    public String showformManager(@PathVariable int userId,  Model m){  
		    return productService.showformManager(userId, m); 
		    } 
		
		 

		@RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
		public String save(@ModelAttribute("product") ProductVm product) {
		return productService.save(product);

		}
		
		 	
		@RequestMapping(value = "mlogin/addProductForManager/saveproductForManager", method = RequestMethod.POST)
		public String saveForManager(@ModelAttribute("product") ProductVm product) {
		return productService.saveForManager(product);// will redirect to viewemp request mapping

		}
		
		// deleteing the Products
		@RequestMapping(value = "/deleteproduct/{id}", method = RequestMethod.GET)
		public String delete(@PathVariable int id) {
			return productService.delete(id);
		}
		
		
		@RequestMapping(value = "mlogin/deleteproductForManager/{id}", method = RequestMethod.GET)
		public String deleteForManager(@PathVariable int id, @ModelAttribute("product") ProductVm product) {
			return productService.deleteForManager(id, product);
		}
		
	
//		@RequestMapping(value = "/search", method = RequestMethod.GET)
//		public String search(@RequestParam("product_id") int product_id, Model model) {
//		  // search for the product by ID
//		  Product product = productDAO.getProductById(product_id);
//		  
//		  // add the product to the model
//		  model.addAttribute("product", product);
//		  System.out.println("pList");
//		  return "pList";
//		}
		
		
		@RequestMapping(value = "/search", method = RequestMethod.GET)
		public String search(@RequestParam(value = "searchOption", required = false) String searchOption,
		                     @RequestParam(value = "searchCriteria", required = false) String searchCriteria,
		                     Model model) {
		   return productService.search(searchOption, searchCriteria, model);
		}
		
		
		
		@RequestMapping("/ascending")
		public String getAscending(Model m) {
			return productService.getAscending(m);

	}
		@RequestMapping("/descending")
		public String getDescending(Model m) {
			return productService.getDescending(m);

	}
		
		
		@RequestMapping("/inventory/{userId}")
		public String viewProductUnderUser(@PathVariable int userId, Model model) {
				return productService.viewProductUnderUser(userId, model);

		}
		

		
		@RequestMapping("/mlogin/{userId}")
		public String viewProductUndermanger(@PathVariable int userId, Model model) {
		return productService.viewProductUndermanger(userId, model);
	
		}
		
	
}