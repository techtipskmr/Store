package com.techkmr.smartStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techkmr.smartStore.models.Store;
import com.techkmr.smartStore.services.StoreService;

@RestController
public class StoreController {
	@Autowired
	StoreService storeService;
	
	@PostMapping("/createStore")
	public String createStore(@RequestBody Store store) {
		System.out.println(store);
		
		storeService.saveStore(store);
		
		
		return null;
		
	}

}
