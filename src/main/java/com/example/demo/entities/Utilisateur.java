package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;



/*
@NoArgsConstructor // constructeur par défaut
@AllArgsConstructor // constructeur complet
@ToString //toString
*/

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "grade")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false,length = 30)
	@NotBlank
	private String nom,prenom;
	@Column(unique = true)
	@Email
	private String email;
	@Column(nullable = false)
	@Min(value = 18)
	@Max(value = 42)
	private int age;
	
	
}

