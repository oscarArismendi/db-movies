package com.dbmovies.db_movies.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
    private Long idCountry;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String name;

    // @Column(name = "last_update",columnDefinition = "timestamp")
    // private Timestamp lastUpdate;

    @Embedded
    Audit audit = new Audit();

    public Country() {
    }

    public Long getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
