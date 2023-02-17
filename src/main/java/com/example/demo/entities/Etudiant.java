package com.example.demo.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Etudiant extends Utilisateur {
private String niveau;
private String classe;

}
