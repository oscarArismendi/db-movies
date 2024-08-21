package com.dbmovies.db_movies.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class CategoryMoviesPK {
    @Column(name ="id_movie", columnDefinition="SMALLINT UNSIGNED")
    private Long idMovie;

    @Column(name ="id_category",columnDefinition = "TINYINT UNSIGNED")
    private Long idCategory;

    @Embedded
    Audit audit = new Audit();

    public CategoryMoviesPK() {
    }

    public Long getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Long idMovie) {
        this.idMovie = idMovie;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }



    
}
