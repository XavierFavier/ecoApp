package org.example.ecoapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Annonce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String name;
    private String city;
    private String phone;

    public Annonce(AnnonceDTO annonce) {
        this.description = annonce.getDescription();
        this.name = annonce.getName();
        this.city = annonce.getCity();
        this.phone = annonce.getPhone();
    }

    public Annonce() {

    }
}
