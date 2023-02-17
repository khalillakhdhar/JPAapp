package com.example.demo.entities.vehicule;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Car extends Transportation {
private int noOfdoors;
}
