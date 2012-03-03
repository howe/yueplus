package com.yueplus.commcon.bean;

import org.nutz.dao.entity.annotation.*;

/**
* @tableName yp_common_user
* @author howe
*/
@Table("yp_common_user")
public class User {

	/**
	 * 
	 */
	@Id
	@Column("id")
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * 
	 */
	@Column("username")
	private String username;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * 
	 */
	@Column("password")
	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}