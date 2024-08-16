package com.dbmovies.db_movies.domain.entities;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_country",columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private Short idCountry;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String name;

    @Column(name = "last_update",columnDefinition = "timestamp")
    private Timestamp lastUpdate;

    public Country() {
    }

    public Short getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Short idCountry) {
        this.idCountry = idCountry;
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

    


    
}
