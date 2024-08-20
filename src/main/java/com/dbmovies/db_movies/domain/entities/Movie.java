package com.dbmovies.db_movies.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private Short idMovie;

    @Column(columnDefinition = "VARCHAR(255)")
    private String title;

    public Movie() {
    }

    public Short getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Short idMovie) {
        this.idMovie = idMovie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    
}
