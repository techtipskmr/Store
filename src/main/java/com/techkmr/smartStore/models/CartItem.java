package com.techkmr.smartStore.models;

import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
    private UUID cartItemID;
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "stock_id", referencedColumnName = "stockid")
    private Stock stock;
	
	
	@ManyToOne
	 @JoinColumn(name="cart_id")
	    private Cart cart;
    private float unitPrice;
    private short noOfUnits;
}
