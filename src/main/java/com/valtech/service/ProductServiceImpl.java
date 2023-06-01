package com.valtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.valtech.dao.ProductDAO;
import com.valtech.dao.UserDao;
import com.valtech.model.Product;
import com.valtech.model.User;

@Service
public class ProductServiceImpl implements ProductService {
	
@Autowired
ProductDAO productDAO;

@Autowired
UserDao userDao;

	@Override
	public String getAllProducts(Model m) {
		try {
		List<Product> list = productDAO.getAllProducts();
		m.addAttribute("list", list);
		System.out.println("list of Product displayed");
		return "productList";
		}
		catch(Exception e) {
			return "error";
		}
	}
	
	
	@Override
	public String getAscending(Model m) {
		try {
		List<Product> list = productDAO.getAscending();
		m.addAttribute("list", list);
		System.out.println("list of Product displayed");
		return "productList";
		}
		catch(Exception e) {
			return "error";
		}
	}
	
	@Override
	public String getDescending(Model m) {
		try {
		List<Product> list = productDAO.getDecending();
		m.addAttribute("list", list);
		System.out.println("list of Product displayed");
		return "productList";
		}
		catch(Exception e) {
			return "error";
		}
	}
	
	
	@Override
	public String edit(@PathVariable int id, Model m) {
		try {
		Product product = productDAO.getProductById(id);
		return "editProduct";
		}
		catch(Exception e) {
			return "error";
		}
	}
	
	@Override
	public String editForManager(@PathVariable int id, Model m) {
		try {
		Product product = productDAO.getProductById(id);
		m.addAttribute("command", product);
		return "editProductForManager";
		}
		catch(Exception e) {
			return "error";
		}
	}
	
	@Override
	public String editsave(@ModelAttribute("product") Product product) {
		try {
		productDAO.updateProduct(product);
		return "redirect:/productList";
		}
		catch(Exception e)
		{
			return "error";
		}
	}
	
	@Override
	public String editsaveForManager(@ModelAttribute("product") Product product) {
		try {
		Product product2 =productDAO.getProductById(product.getProduct_id());
		productDAO.updateProduct(product);			
		return "redirect:/mlogin/"+product2.getUserId();
		}
		catch(Exception e) {
			return "error";
		}
	}
	
	    @Override
	    public String showform(Model m){  
	    	try {
	    	m.addAttribute("command", new Product());
	    	return "addProduct"; 
	    	}
	    	catch(Exception e) {
	    		return "error";
	    	}
	    }  
	 
	    @Override
	    public String showformManager(@PathVariable int userId,  Model m){  
	    	try {
	    	m.addAttribute("command", new Product());
	    	m.addAttribute("userId", userId);
	    	return "addProductForManager"; 
	    	}
	    	catch(Exception e) {
	    		return "error";
	    	}
	    } 
	
	 
	@Override    
	public String save(@ModelAttribute("product") Product product) {
		try {
		productDAO.save(product);
		return "redirect:/productList";// will redirect to viewemp request mapping
		}
		catch(Exception e) {
			return "error";
		}
	}
	
	@Override 	
	public String saveForManager(@ModelAttribute("product") Product product) {
		try {
		productDAO.save(product);
		return "redirect:/mlogin/"+product.getUserId();// will redirect to viewemp request mapping
		}
		catch(Exception e){
			return "error";
		}
	}
	
	// deleteing the Products
	@Override
	public String delete(@PathVariable int id) {
		try {
		productDAO.deleteProduct(id);
		return "redirect:/productList";
		}
		catch(Exception e) {
			return "error";
		}
	}
	
	@Override
	public String deleteForManager(@PathVariable int id, @ModelAttribute("product") Product product) {
		try {
		Product p= productDAO.getProductById(id);
		productDAO.deleteProduct(id);
		return "redirect:/mlogin/"+p.getUserId();
		}
		catch(Exception e) {
			return "error";
		}
	}
	

//	@RequestMapping(value = "/search", method = RequestMethod.GET)
//	public String search(@RequestParam("product_id") int product_id, Model model) {
//	  // search for the product by ID
//	  Product product = productDAO.getProductById(product_id);
//	  
//	  // add the product to the model
//	  model.addAttribute("product", product);
//	  System.out.println("pList");
//	  return "pList";
//	}
	
	@Override
	public String search(@RequestParam(value = "searchOption", required = false) String searchOption,
	                     @RequestParam(value = "searchCriteria", required = false) String searchCriteria,
	                     Model model) {
	    try {
	        if (searchOption != null && searchCriteria != null) {
	            if (searchOption.equals("product_id")) {
	                int product_id = Integer.parseInt(searchCriteria);
	                Product product = productDAO.getProductById(product_id);
	                model.addAttribute("product", product);
	                return "pList";
	            } else if (searchOption.equals("product_name")) {
	                Product product = productDAO.getProductName(searchCriteria);
	                model.addAttribute("product", product);
	                return "pList";
	            }
	            
	        }
	        model.addAttribute("error", "Invalid search option");
	        return "error";
	    } catch (Exception e) {
	        return "error";
	    }
	}
	
	
	@Override
	public String viewProductUnderUser(@PathVariable int userId, Model model) {
		try {
	User user = userDao.getUserbyUser(userId);
	System.out.println(userId);
	List<Product> product = (List<Product>) productDAO.getProductByuserId(userId);
	model.addAttribute("user", user);
	model.addAttribute("product", product);
	return "inventory";
		}
		catch (Exception e) {
			return "error";
		}

	}
	

	@Override
	public String viewProductUndermanger(@PathVariable int userId, Model model) {
		try {
	User user = userDao.getUserbyUser(userId);
	System.out.println(userId);
	List<Product> product = (List<Product>) productDAO.getProductByuserId(userId);
	model.addAttribute("user", user);
	model.addAttribute("userId", userId);
	model.addAttribute("product", product);
	return "mlogin";
		}
		catch(Exception e) {
			return "error";
		}
	}
}
