package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.App;

public interface Repo extends JpaRepository<App,Integer> {
	@Query(value="select name,password from App where name=?1",nativeQuery=true)
	public App findElementByName(String name);
	
	
}
