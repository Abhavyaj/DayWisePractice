package com.gal.model;

import jakarta.persistence.Column;

import jakarta.persistence. Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trainer {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long trainerid;

@Column(nullable = false)
String name;

String company;
String specialization;

public Trainer() {}

public Trainer(String name, String company, String specialization) {
    this.name = name;
    this.company = company;
    this.specialization = specialization;
}

@Override
public String toString() {
    return "Trainer{" + name + "}";
}
}
