package com.example.demo.entities.vehicule;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
//boilerplate codes => data = constructors , ToString, hasMap 
public class Truck extends Transportation {
private int noOfContainers;


}
