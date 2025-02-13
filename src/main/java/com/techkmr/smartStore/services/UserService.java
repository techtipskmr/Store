package com.techkmr.smartStore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techkmr.smartStore.models.SUser;
import com.techkmr.smartStore.repos.UserRepo;

@Service
public class UserService {
	
	
	@Autowired
	public UserRepo userRepo;

	public String register(SUser user) {
		if(userRepo.save(user) == null)
			return "Error While Saving data";
		else
		return "User created";
		
		
	}

}
