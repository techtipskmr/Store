package com.techkmr.smartStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techkmr.smartStore.models.SUser;
import com.techkmr.smartStore.services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public String userRegistration(@RequestBody SUser user) {
		System.out.println(user+ "     ==== ==========At controller level");
		System.out.println(user.getRoles().toString());
		return userService.register(user);
	} 
	
	
	
	
	public SUser getUser() {
		return null;
	} 

}
