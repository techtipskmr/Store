package com.techkmr.smartStore.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Tracking {
	
	private enum trackingStatus{DISPACHED,INTRANSINT,DELIVERED}
}
