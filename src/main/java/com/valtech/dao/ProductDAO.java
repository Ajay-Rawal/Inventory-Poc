package com.valtech.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.valtech.vm.ProductVm;

public class ProductDAO {
    
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
 
    // CREATE
    public void addProduct(ProductVm product) {
        String sql = "INSERT INTO product (product_name, description, price, Pquantity) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, product.getProduct_name(), product.getDescription(), product.getPrice(), product.getPquantity());
    }
    
	
 // Get all Product
 	public List<ProductVm> getAllProducts(){  
 	    return jdbcTemplate.query("select * from Product where product_id !=11",new RowMapper<ProductVm>(){  
 	        public ProductVm mapRow(ResultSet rs, int row) throws SQLException {  
 	        	ProductVm li=new ProductVm();  
 	            li.setProduct_id(rs.getInt(1));
 	            li.setProduct_name(rs.getString(2));
 	            li.setDescription(rs.getString(3));
 	            li.setPrice(rs.getFloat(4));
 	            li.setPquantity(rs.getInt(5));
 	            li.setCid(rs.getInt(6));
 	           li.setUserId(rs.getInt(7));
 	          
 	            return li;  
 	        }  
 	    });
 	}
 	
 
 	
    // UPDATE
    public void updateProduct(ProductVm product) {
        String sql = "UPDATE product SET product_name=?, description=?, price=?, Pquantity=? WHERE product_id=?";
        jdbcTemplate.update(sql, product.getProduct_name(), product.getDescription(), product.getPrice(), product.getPquantity(), product.getProduct_id());
    }
    
    
    // UPDATE for manager
    public void updateProductForManager(ProductVm product) {
        String sql = "UPDATE product SET product_name=?, description=?, price=?, Pquantity=? ,userId=? WHERE product_id=?";
        jdbcTemplate.update(sql, product.getProduct_name(), product.getDescription(), product.getPrice(), product.getPquantity(),product.getUserId(), product.getProduct_id());
    }
 
            //save method
  	     	public void save(ProductVm product) {
  			String sql = "INSERT INTO product (product_id,product_name, description, price, Pquantity,Cid,userId) VALUES (?,?,?,?,?,?,?)";
  	        jdbcTemplate.update(sql, product.getProduct_id(),product.getProduct_name(), product.getDescription(), product.getPrice(), product.getPquantity(),product.getCid(),product.getUserId());
  	    }
  		
  		
      // DELETE
        public void deleteProduct(int product_id) {
        String sql = "DELETE FROM product WHERE product_id=?";
        jdbcTemplate.update(sql, product_id);
    }
    
    
       //READ
        public ProductVm getProductById(int product_id) {
        String sql = "SELECT * FROM product WHERE product_id=?";
        ProductVm product = jdbcTemplate.queryForObject(sql, new Object[] {product_id}, new BeanPropertyRowMapper<ProductVm>(ProductVm.class));
        return product;
    }
    
        public ProductVm getProductName(String product_name) {
            String sql = "SELECT * FROM product WHERE product_name=?";
            ProductVm product = jdbcTemplate.queryForObject(sql, new Object[] {product_name}, new BeanPropertyRowMapper<ProductVm>(ProductVm.class));
            return product;
        }
    
        public List<ProductVm> getProductByuserId(int userId) {
    	String sql = "SELECT * FROM product WHERE userId = ?";
    	return jdbcTemplate.query(sql, new Object[] { userId }, new ProductRowMapper());
    	}
        
     
 
    	class ProductRowMapper implements RowMapper<ProductVm> {
    	@Override
    	public ProductVm mapRow(ResultSet rs, int rowNum) throws SQLException {
    		ProductVm product = new ProductVm();
    	product.setProduct_id(rs.getInt(1));
    	product.setProduct_name(rs.getString(2));
    	product.setDescription(rs.getString(3));
    	product.setPrice(rs.getFloat(4));
    	product.setUserId(rs.getInt(5));
    	product.setPquantity(rs.getInt(6));
    	product.setCid(rs.getInt(7));
    	return product;
    	}
    	}
    	
    	
    	public List<ProductVm> getAscending() {
     	    String sql="SELECT * FROM Product WHERE product_id != 11 ORDER BY product_name ASC";
     	   return jdbcTemplate.query(sql, new Object[] { }, new ProductRowMapper());
}

    	public List<ProductVm> getDecending() {
     	    String sql="SELECT * FROM Product WHERE product_id != 11 ORDER BY product_name DESC";
     	   return jdbcTemplate.query(sql, new Object[] { }, new ProductRowMapper());
}



}


















//
//	public List<Product> getAllProductlaptop(){  
// 	    return jdbcTemplate.query("select * from Product where Cid=2 ",new RowMapper<Product>(){  
// 	        public Product mapRow(ResultSet rs, int row) throws SQLException {  
// 	        	Product li=new Product();  
// 	            li.setProduct_id(rs.getInt(1));
// 	            li.setProduct_name(rs.getString(2));
// 	            li.setDescription(rs.getString(3));
// 	            li.setPrice(rs.getFloat(4));
// 	            li.setPquantity(rs.getInt(5));
// 	            li.setCid(rs.getInt(6));
// 	           li.setUserId(rs.getInt(7));
// 	          
// 	            return li;  
// 	        }  
// 	    });
// 	}
// 	
// 	public List<Product> getAllProductsphone(){  
// 	    return jdbcTemplate.query("select * from Product where Cid=1",new RowMapper<Product>(){  
// 	        public Product mapRow(ResultSet rs, int row) throws SQLException {  
// 	        	Product li=new Product();  
// 	            li.setProduct_id(rs.getInt(1));
// 	            li.setProduct_name(rs.getString(2));
// 	            li.setDescription(rs.getString(3));
// 	            li.setPrice(rs.getFloat(4));
// 	            li.setPquantity(rs.getInt(5));
// 	            li.setCid(rs.getInt(6));
// 	           li.setUserId(rs.getInt(7));
// 	            
// 	          
// 	            return li;  
// 	        }  
// 	    });
// 	}