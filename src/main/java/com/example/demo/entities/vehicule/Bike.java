package com.example.demo.entities.vehicule;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Bike extends Passenger {
private int saddleheight;


}
