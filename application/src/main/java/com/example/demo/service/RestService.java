package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.App;
import com.example.demo.repo.Repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RestService {
	@Autowired
	
	private Repo repo;
	
	public App addAddress(App a) {
		return repo.save(a);
	}
	
	public List<App> getAddress(){
		List<App> arr=new ArrayList<>();
		arr=(List<App>) repo.findAll();
		return arr;
	}
	
//	@SuppressWarnings("deprecation")
	public App getelebyName(String name) {
		return repo.findElementByName(name);
		}
	
	

}

