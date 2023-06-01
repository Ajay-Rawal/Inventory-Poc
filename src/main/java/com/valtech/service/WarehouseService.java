package com.valtech.service;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.valtech.model.Warehouse;

public interface WarehouseService {

	String listWarehouses(Model model);

	String search(int userId, Model model);

	String showAddWarehouseForm(Model model);

	String addWarehouse(Warehouse warehouse, BindingResult result);

	String showEditWarehouseForm(int id, Model model);

	String editWarehouse(int id, Warehouse warehouse, BindingResult result);

	String deleteWarehouse(int id);

}