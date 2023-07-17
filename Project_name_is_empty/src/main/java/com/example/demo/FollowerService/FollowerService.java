package com.example.demo.FollowerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.FollowersRepository.FollowerRepo;
import com.example.demo.entity.Followers;

@Service
public class FollowerService {
	@Autowired
	
	private FollowerRepo repo;
	
	public List<Followers> showFollower() {
		List<Followers> arr=new ArrayList<>();
		arr =(List<Followers>) repo.findAll();
		return arr;
	}
	
	public Optional<Followers> showById(int id) {
		return repo.findById(id);
	}
	
	public String deletebyId(int id) {	
		 repo.deleteById(id);
		 return "Successfully deleted";
	}
	
//	public List<Followers> showByName(String s){
//		List<Followers> arr=new ArrayList<>();
//		arr=(List<Followers>) repo.findName(s);
//		return arr;	
//	}
	
	
}
