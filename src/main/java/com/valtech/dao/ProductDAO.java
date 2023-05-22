package com.valtech.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.valtech.model.Product;

public class ProductDAO {
    
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    // CREATE
    public void addProduct(Product product) {
        String sql = "INSERT INTO product (product_name, description, price, Pquantity) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, product.getProduct_name(), product.getDescription(), product.getPrice(), product.getPquantity());
    }
    
	
 // Get all Product
 	public List<Product> getAllProducts(){  
 	    return jdbcTemplate.query("select * from Product where product_id !=11",new RowMapper<Product>(){  
 	        public Product mapRow(ResultSet rs, int row) throws SQLException {  
 	        	Product li=new Product();  
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
    public void updateProduct(Product product) {
        String sql = "UPDATE product SET product_name=?, description=?, price=?, Pquantity=? WHERE product_id=?";
        jdbcTemplate.update(sql, product.getProduct_name(), product.getDescription(), product.getPrice(), product.getPquantity(), product.getProduct_id());
    }
    
    
    // UPDATE for manager
    public void updateProductForManager(Product product) {
        String sql = "UPDATE product SET product_name=?, description=?, price=?, Pquantity=? ,userId=? WHERE product_id=?";
        jdbcTemplate.update(sql, product.getProduct_name(), product.getDescription(), product.getPrice(), product.getPquantity(),product.getUserId(), product.getProduct_id());
    }
 
            //save method
  	     	public void save(Product product) {
  			String sql = "INSERT INTO product (product_id,product_name, description, price, Pquantity,Cid,userId) VALUES (?,?,?,?,?,?,?)";
  	        jdbcTemplate.update(sql, product.getProduct_id(),product.getProduct_name(), product.getDescription(), product.getPrice(), product.getPquantity(),product.getCid(),product.getUserId());
  	    }
  		
  		
      // DELETE
        public void deleteProduct(int product_id) {
        String sql = "DELETE FROM product WHERE product_id=?";
        jdbcTemplate.update(sql, product_id);
    }
    
    
       //READ
        public Product getProductById(int product_id) {
        String sql = "SELECT * FROM product WHERE product_id=?";
        Product product = jdbcTemplate.queryForObject(sql, new Object[] {product_id}, new BeanPropertyRowMapper<Product>(Product.class));
        return product;
    }
    
        public Product getProductName(String product_name) {
            String sql = "SELECT * FROM product WHERE product_name=?";
            Product product = jdbcTemplate.queryForObject(sql, new Object[] {product_name}, new BeanPropertyRowMapper<Product>(Product.class));
            return product;
        }
    
        public List<Product> getProductByuserId(int userId) {
    	String sql = "SELECT * FROM product WHERE userId = ?";
    	return jdbcTemplate.query(sql, new Object[] { userId }, new ProductRowMapper());
    	}
    
    
 
    	class ProductRowMapper implements RowMapper<Product> {
    	@Override
    	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
    	Product product = new Product();
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