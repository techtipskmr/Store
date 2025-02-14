package com.techkmr.smartStore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techkmr.smartStore.models.Store;

public interface StoreRepo extends  JpaRepository<Store, Long> {
	

}
