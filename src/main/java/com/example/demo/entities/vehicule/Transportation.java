package com.example.demo.entities.vehicule;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class Transportation extends Vehicule {
int loadCapacity;

}
