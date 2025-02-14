package com.techkmr.smartStore.models;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.hibernate.mapping.Array;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.techkmr.smartStore.enums.Gender;
import com.techkmr.smartStore.enums.MyRoles;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class SUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private Date dob;
    private String mobile;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String userProfile;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private MyRoles roles;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressid")
    private Address address;

   
    
    private boolean enabled;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean accountNonExpired;
	



}
