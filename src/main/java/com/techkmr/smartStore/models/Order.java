package com.techkmr.smartStore.models;

import java.util.Date;
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
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
    private UUID orderID;
	@OneToOne
    private SUser suser;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id", referencedColumnName = "cartid")
    private Cart cart;
    private boolean isPaymentConfirmed;
    private enum paymentType{ONLINE,COD,CASH};
    private Address address;
    private String altMobile;
    private Date orderDate;
    private enum orderType{PICKUP,DELIVERY,COURIER}
    private enum orderStatus {PLACED,UNDERPROCESS,INTRANSIT,FULLFILLED};

}
