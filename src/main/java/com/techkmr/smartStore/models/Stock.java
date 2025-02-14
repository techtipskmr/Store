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
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stockID;
	
	@OneToOne
    @JoinColumn(name = "productid")
    private Product product;
	 
	@OneToOne
    @JoinColumn(name = "storeid")
    private Store store;
    private int quantity;
   
    
    private float MRP;
    private float finalPrice;
    private float discount;
    private byte rating;
}
