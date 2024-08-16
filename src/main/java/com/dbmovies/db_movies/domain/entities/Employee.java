package com.dbmovies.db_movies.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee",columnDefinition = "TINYINT UNSIGNED",nullable = false)
    private Short idEmployee;

    @Column(columnDefinition = "VARCHAR(45)")
    private String firstname;

    @Column(columnDefinition = "VARCHAR(45)")
    private String lastname;

    @ManyToOne
    @JoinColumn(name="id_addres",nullable = false)
    private Address address;
}
