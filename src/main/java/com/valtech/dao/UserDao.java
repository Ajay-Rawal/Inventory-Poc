package com.valtech.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.valtech.vm.UserVm;




public class UserDao {
	

	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	
	// Create a new user
	public void createUser(UserVm user) {
		String sql = "INSERT INTO user (username, password, email, role) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getRole());
	}

	
	// Get a user by ID
		public UserVm getUserbyUser(int userId) {
			String sql = "SELECT * FROM user WHERE userId = ?";
			UserVm user = jdbcTemplate.queryForObject(sql, new Object[] { userId }, new BeanPropertyRowMapper<UserVm>(UserVm.class));
			return user;
		}
	
		
		public UserVm getUserbyUserName(int userId) {
			String sql = "SELECT * FROM user WHERE userId = ?";
			UserVm user = jdbcTemplate.queryForObject(sql, new Object[] { userId }, new BeanPropertyRowMapper<UserVm>(UserVm.class));
			return user;
		}
		
		
		
		//save method
		public int save(UserVm user) {
			String sql = "INSERT INTO user (username, password, email, role) VALUES (?, ?, ?, ?)";
			return jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getRole());
		}

	// Get all users
	public List<UserVm> getUsers(){  
	    return jdbcTemplate.query("select * from user",new RowMapper<UserVm>(){  
	        public UserVm mapRow(ResultSet rs, int row) throws SQLException {  
	        	UserVm li=new UserVm();  
	            li.setUserId(rs.getInt(1));
	            li.setUsername(rs.getString(2));
	            li.setPassword(rs.getString(3));
	            li.setEmail(rs.getString(4));
	            li.setRole(rs.getString(5));
	          
	            return li;  
	        }  
	    });  
	
	}
		
		
		
//		public List<UserVm> getUsers(){  
//		    return jdbcTemplate.query("select * from user where userName=?",new RowMapper<UserVm>(){  
//		        public UserVm mapRow(ResultSet rs, int row) throws SQLException {  
//		        	UserVm li=new UserVm();  
//		            li.setUserId(rs.getInt(1));
//		            li.setUsername(rs.getString(2));
//		            li.setPassword(rs.getString(3));
//		            li.setEmail(rs.getString(4));
//		            li.setRole(rs.getString(5));
//		          
//		            return li;  
//		        }  
//		    });  
//		
//		}
		
		
		
//		public List<UserVm> getUsers() {
//			String sql="select * from user where userId > 1";
//		    return jdbcTemplate.query("select * from user where userId > 1", (rs, rowNum) -> {
//		        UserVm user = new UserVm();
//		        user.setUserId(rs.getInt(1));
//		        user.setUsername(rs.getString(2));
//		        user.setPassword(rs.getString(3));
//		        user.setEmail(rs.getString(4));
//		        user.setRole(rs.getString(5));
//		        return user;
//		    });
//		}

		
		
		
		
		
	// Update a user
	public void updateUser(UserVm user) {
		String sql = "UPDATE user SET username = ?, password = ?, email = ?, role = ? WHERE userId = ?";
		jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getRole(), user.getUserId());
	}

	// Delete a user by ID
	public void deleteUser(int userId) {
		String sql = "DELETE FROM user WHERE userId = ?";
		jdbcTemplate.update(sql, userId);
	}
	
	 public UserVm findByEmail(String email) {
         String sql = "SELECT * FROM User WHERE email = ?";
         RowMapper<UserVm> rowMapper = new BeanPropertyRowMapper<UserVm>(UserVm.class);
         return jdbcTemplate.queryForObject(sql, rowMapper, email);
     }

		
		  public UserVm findByEmailAndPassword(String email, String password) {
		  String sql = "SELECT * FROM User WHERE email = ? AND password = ?"; 
		  RowMapper<UserVm>rowMapper = new BeanPropertyRowMapper<UserVm>(UserVm.class);
		  return jdbcTemplate.queryForObject(sql, rowMapper, email, password); 
		  }
		 
     
         public UserVm findByNameAndPassword(String username, String password) {
         String sql = "SELECT * FROM User WHERE username = ? AND password = ?";
         RowMapper<UserVm> rowMapper = new BeanPropertyRowMapper<UserVm>(UserVm.class);
         return jdbcTemplate.queryForObject(sql, rowMapper, username, password);
     }
         
}
		/*
		 * public User validateUser(Login login) { String sql
		 * ="select * from User where username='"+login.getUsername()+"'and password'"
		 * +login.getpassword()"'"; List<User> users=jdbcTemplate.query(sql,new User());
		 * return users.size()>0?users.get(0):null;
		 * 
		 * }
		 */
