package com.oppir.test.API_test.models;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
	private int userid;
	private String username;
	private String password;
	private int groupid;
	
	
	public User() {
		super();
	}


	public User(int userid, String username, String password, int groupid) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.groupid = groupid;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getGroupid() {
		return groupid;
	}


	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	
	
}
