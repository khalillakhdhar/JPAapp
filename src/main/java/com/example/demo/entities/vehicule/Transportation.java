package com.example.demo.entities.vehicule;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Min;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class Transportation extends Vehicule {
@Min(value = 1)
private int loadCapacity;

}
