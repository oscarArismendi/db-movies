package com.dbmovies.db_movies.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="warehouse")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_warehouse",columnDefinition = "TINYINT UNSIGNED",nullable = false)
    private Long idWarehouse;

    @ManyToOne
    @JoinColumn(name="id_boss",nullable = false)
    private Employee bossEmployee;

    @ManyToOne
    @JoinColumn(name = "id_address", nullable = false)
    private Address address;


    // @JoinColumn(columnDefinition = "TIMESTAMP")
    // private Timestamp last_update;

    @Embedded
    Audit audit = new Audit();

    public Warehouse() {
    }

    public Long getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(Long idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public Employee getBossEmployee() {
        return bossEmployee;
    }

    public void setBossEmployee(Employee bossEmployee) {
        this.bossEmployee = bossEmployee;
    }

}
