package com.example.demo.FollowersRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Followers;

public interface FollowerRepo extends JpaRepository<Followers,Integer> {
		
//	@Query(value="select * from Followers name like '%?@Param(s)%'",nativeQuery=true)
//	public List<Followers> findName(String s);
}
