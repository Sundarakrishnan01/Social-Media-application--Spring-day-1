package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Followers {
	@Id
	
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	
	
	public Followers() {
	}

	public Followers(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		
		
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
