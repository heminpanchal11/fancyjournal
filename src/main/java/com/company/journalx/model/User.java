package com.company.journalx.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int u_id;
	@Column
	private String u_name;
	@Column
	private String u_pass;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int u_id, String u_name, String u_pass) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_pass = u_pass;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_pass() {
		return u_pass;
	}

	public void setU_pass(String u_pass) {
		this.u_pass = u_pass;
	}
	
	
	
	
}
