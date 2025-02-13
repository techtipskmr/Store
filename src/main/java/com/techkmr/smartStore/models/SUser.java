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
public class SUser {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
    private UUID userID;
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private Date dob;
    private String mobile;
    private enum gender{MALE,FEMALE,NA};
    private enum role{USER,ADMIN,SELLER};
    
    @OneToOne
    private Address address;

    @OneToOne(mappedBy = "suser" ,cascade = CascadeType.ALL)
    private Store store;


    @OneToOne(mappedBy = "suser")
    private Order order;
    
    private boolean isEnabled;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private boolean isAccountNonExpired;




}
