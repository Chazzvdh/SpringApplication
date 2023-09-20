package com.example.springapplication.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String middle_name;
    private String last_name;

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", firstName='" + first_name + '\'' +
                ", middleName='" + middle_name + '\'' +
                ", lastName='" + last_name + '\'' +
                '}';
    }

}
