package com.valtech.service;

import org.springframework.ui.Model;

import com.valtech.model.Product;

public interface ProductService {

	
	String getAllProducts(Model m);

	String edit(int id, Model m);

	String editForManager(int id, Model m);

	String editsave(Product product);

	String editsaveForManager(Product product);

	String showform(Model m);

	String showformManager(int userId, Model m);

	String save(Product product);

	String saveForManager(Product product);

	String delete(int id);

	String deleteForManager(int id, Product product);

	String search(String searchOption, String searchCriteria, Model model);

	String viewProductUnderUser(int userId, Model model);

	String viewProductUndermanger(int userId, Model model);

	String getAscending(Model m);

	String getDescending(Model m);
	
}