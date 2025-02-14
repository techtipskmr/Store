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
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressID;
    private String address;
    private String city;
    
    private String landmark;
    
  
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "loclityid")
    private Locality locality;
    private String phone;
    private String phone2;
    private String remarks;
    
}
