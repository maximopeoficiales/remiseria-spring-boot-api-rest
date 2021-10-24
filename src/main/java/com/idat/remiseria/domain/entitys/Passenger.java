package com.idat.remiseria.domain.entitys;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_passenger")
    private Integer idPassenger;

}
