package com.example.demo.entities.vehicule;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class Passenger extends Vehicule {
int noOfPassenger;

}
