package com.techkmr.smartStore.models;

import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Locality {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
    private UUID localityID;
    private String locality;
    private String district;
    private String state;
    private String pincode;
    @OneToOne(mappedBy = "locality" ,cascade = CascadeType.ALL)
    private Address address;
}
