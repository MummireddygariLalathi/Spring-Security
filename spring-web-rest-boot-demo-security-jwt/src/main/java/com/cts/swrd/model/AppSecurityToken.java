package com.cts.swrd.model;

import java.io.Serializable;

public class AppSecurityToken implements Serializable{
	private static final long serialVersionUID=-4589665556556556L;
	private final String jwttoken;
	
	public AppSecurityToken(String jwttoken) {
		this.jwttoken=jwttoken;
		
		
	}
	public String getToken() {
		return this.jwttoken;
	}
}
