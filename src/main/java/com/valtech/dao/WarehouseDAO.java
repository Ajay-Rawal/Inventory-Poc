package com.valtech.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.valtech.vm.WarehouseVm;




public class WarehouseDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<WarehouseVm> getAllWarehouses() {
		String sql = "SELECT * FROM warehouse";
		List<WarehouseVm> warehouses = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(WarehouseVm.class));
		return warehouses;
	}
	

		
	
	
	public WarehouseVm getWarehouseById(int id) {
		String sql = "SELECT * FROM warehouse WHERE Wid=?";
		WarehouseVm warehouse = jdbcTemplate.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<>(WarehouseVm.class));
		return warehouse;
	}

	public void addWarehouse(WarehouseVm warehouse) {
		String sql = "INSERT INTO warehouse (Wid, Wname, Waddress, product_id, inventory_id) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, warehouse.getWid(), warehouse.getWname(), warehouse.getWaddress(),
				warehouse.getProduct_id(), warehouse.getInventory_id());
	}

	public void updateWarehouse(WarehouseVm warehouse) {
		String sql = "UPDATE warehouse SET Wname=?, Waddress=?, product_id=?, inventory_id=? WHERE Wid=?";
		jdbcTemplate.update(sql, warehouse.getWname(), warehouse.getWaddress(), warehouse.getProduct_id(),
				warehouse.getInventory_id(), warehouse.getWid());
	}

	public void deleteWarehouse(int id) {
		String sql = "DELETE FROM warehouse WHERE Wid=?";
		jdbcTemplate.update(sql, id);
	}
}

