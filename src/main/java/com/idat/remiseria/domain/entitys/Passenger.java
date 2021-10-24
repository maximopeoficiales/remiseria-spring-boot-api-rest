package com.idat.remiseria.domain.entitys;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "passengers")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_passenger")
    private Integer idPassenger;

    @Column(name = "id_user")
    private Integer idUser;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "date_updated")
    @UpdateTimestamp
    private Date dateUpdated;


}
