package com.valtech.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.valtech.model.Product;
import com.valtech.model.User;
import com.valtech.model.Warehouse;


public class WarehouseDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Warehouse> getAllWarehouses() {
		String sql = "SELECT * FROM warehouse";
		List<Warehouse> warehouses = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Warehouse.class));
		return warehouses;
	}
	

		
	
	
	public Warehouse getWarehouseById(int id) {
		String sql = "SELECT * FROM warehouse WHERE Wid=?";
		Warehouse warehouse = jdbcTemplate.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<>(Warehouse.class));
		return warehouse;
	}

	public void addWarehouse(Warehouse warehouse) {
		String sql = "INSERT INTO warehouse (Wid, Wname, Waddress, product_id, inventory_id) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, warehouse.getWid(), warehouse.getWname(), warehouse.getWaddress(),
				warehouse.getProduct_id(), warehouse.getInventory_id());
	}

	public void updateWarehouse(Warehouse warehouse) {
		String sql = "UPDATE warehouse SET Wname=?, Waddress=?, product_id=?, inventory_id=? WHERE Wid=?";
		jdbcTemplate.update(sql, warehouse.getWname(), warehouse.getWaddress(), warehouse.getProduct_id(),
				warehouse.getInventory_id(), warehouse.getWid());
	}

	public void deleteWarehouse(int id) {
		String sql = "DELETE FROM warehouse WHERE Wid=?";
		jdbcTemplate.update(sql, id);
	}
}

