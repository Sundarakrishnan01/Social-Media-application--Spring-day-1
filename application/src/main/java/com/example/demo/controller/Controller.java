package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.App;
import com.example.demo.service.RestService;

@RestController
@CrossOrigin(origins="*")
public class Controller {
	
	@Autowired
	private RestService ser;
	
	@PostMapping("/add")
	public App adding(@RequestBody App a) {
		return ser.addAddress(a);
	}
	
	@GetMapping("/show")
	public List<App> getting(){
		return ser.getAddress();
	}
	
	@GetMapping("/get/{name}")
	public App getbyName(@PathVariable String s) {
		return ser.getelebyName(s);
	}
	
	
}
