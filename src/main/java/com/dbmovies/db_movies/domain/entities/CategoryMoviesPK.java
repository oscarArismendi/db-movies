package com.dbmovies.db_movies.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CategoryMoviesPK {
    @Column(name ="id_movie", columnDefinition="SMALLINT UNSIGNED")
    private Short idMovie;

    @Column(name ="id_category",columnDefinition = "TINYINT UNSIGNED")
    private Short idCategory;

    public CategoryMoviesPK() {
    }

    public Short getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Short idMovie) {
        this.idMovie = idMovie;
    }

    public Short getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Short idCategory) {
        this.idCategory = idCategory;
    }



    
}
