package com.techkmr.smartStore.models;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
    private UUID cartID;
	@OneToMany(mappedBy="cart")
    private List<CartItem> cartItems;
    private float cartAmount;
    @OneToOne(mappedBy = "cart")
    private Order order;
    //to do discount or copuns to be deducted or implemented


}
