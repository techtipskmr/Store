package com.techkmr.smartStore.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techkmr.smartStore.models.SUser;
import com.techkmr.smartStore.models.Store;
import com.techkmr.smartStore.repos.StoreRepo;
import com.techkmr.smartStore.repos.UserRepo;
@Service
public class StoreService {
	@Autowired
	StoreRepo storeRepo; 
	@Autowired
	UserRepo userRepo;
	
	public String saveStore(Store store) {
		long userID=store.getSuser().getUserID();
		
		if(userID != 0) {
//			Optional<SUser> user = userRepo.findById(userID);
//			System.out.println("user id =  "+ userID);
//			
//			store.setSuser(user.get());
			try {
				storeRepo.save(store);
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
			return "Store Create Successfully";
		}
		
		System.out.println("Condition Failed");
		return null;
		
	}

}
