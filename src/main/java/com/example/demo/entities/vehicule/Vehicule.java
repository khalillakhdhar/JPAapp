package com.example.demo.entities.vehicule;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicule {
	@Id
private int idVehicule;

private String manifacturer;


}
