package com.idat.remiseria.domain.entitys;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_driver")
    private Integer idDriver;

    @Column(name = "id_user")
    private Integer idUser;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;

    @OneToMany(mappedBy = "driver", cascade = {CascadeType.ALL})
    private List<Vehicle> vehicles;


    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "date_updated")
    @UpdateTimestamp
    private Date dateUpdated;


}
