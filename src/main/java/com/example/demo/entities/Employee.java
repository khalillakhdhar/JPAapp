package com.example.demo.entities;

import jakarta.persistence.Entity;
import lombok.Data;
@Data
@Entity
public class Employee extends Utilisateur {
private String profession;
private double salaire;
}
