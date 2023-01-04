package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
	
	private String id;
	private String user_token;
	private String user_name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_token() {
		return user_token;
	}
	public void setUser_token(String user_token) {
		this.user_token = user_token;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", user_token=" + user_token + ", user_name=" + user_name + "]";
	}
	
	
}
