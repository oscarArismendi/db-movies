package com.dbmovies.db_movies.domain.entities;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_city",columnDefinition = "SMALLINT UNSIGNED",nullable = false)
    private Short idCity;

    @Column(columnDefinition = "VARCHAR(50)",nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_country",nullable = false)
    private Country country;

    @Column(name = "last_update",columnDefinition = "TIMESTAMP")
    private Timestamp lastUpdate;

    public City() {
    }

    public Short getIdCity() {
        return idCity;
    }

    public void setIdCity(Short idCity) {
        this.idCity = idCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    

}
