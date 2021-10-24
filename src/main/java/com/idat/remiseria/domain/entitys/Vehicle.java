package com.idat.remiseria.domain.entitys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehicle")
    private Integer idVehicle;

    @Column(length = 150)
    private String description;

    @Column(name = "id_driver")
    private Integer idDriver;


    @Column(length = 150)
    private String type;

    @Column(length = 150)
    private String plaque;

    @Column(length = 150)
    private String model;

    @Column(length = 150)
    private String mark;


    @JsonIgnore
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_driver", insertable = false, updatable = false)
    private Driver driver;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "date_updated")
    @UpdateTimestamp
    private Date dateUpdated;


}
