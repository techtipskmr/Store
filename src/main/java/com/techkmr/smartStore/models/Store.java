package com.techkmr.smartStore.models;

import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
    private UUID storeID;
    private String storeName;
    //refers to user id with roles as seller
    @OneToOne    
    private SUser suser;//changed to suser from ownerId
    private String phone;
    
    @OneToOne()
    private Address address;
    private String lat;
    private String lont;
    private String mapURL;
    
    private String ownerPhoto;
    //url blob
    private String regDocs;
    
    //todo add variable for shop photos and above media a to new table and refer here 
}
