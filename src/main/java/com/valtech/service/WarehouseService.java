package com.valtech.service;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.valtech.model.Warehouse;
import com.valtech.vm.WarehouseVm;

public interface WarehouseService {

	String listWarehouses(Model model);

	String search(int userId, Model model);

	String showAddWarehouseForm(Model model);



	String showEditWarehouseForm(int id, Model model);


	String deleteWarehouse(int id);

	String editWarehouse(int id, WarehouseVm warehouse, BindingResult result);

	String addWarehouse(WarehouseVm warehouse, BindingResult result);

}