package com.techkmr.smartStore.models;

import java.util.Date;
import java.util.UUID;

import com.techkmr.smartStore.enums.OrderStatus;
import com.techkmr.smartStore.enums.OrderType;
import com.techkmr.smartStore.enums.PaymentType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderID;
	
	@OneToOne
    @JoinColumn(name = "userid")
    private SUser suser;
	
	@OneToOne
    @JoinColumn(name = "cartid")
    private Cart cart;
    private boolean isPaymentConfirmed;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @OneToOne
    @JoinColumn(name = "addressid")
    private Address address;
    private String altMobile;
    private Date orderDate;
    @Enumerated(EnumType.STRING)
    private OrderType orderType;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus ;

}
