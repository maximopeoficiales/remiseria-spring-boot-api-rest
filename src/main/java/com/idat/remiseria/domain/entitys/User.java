package com.idat.remiseria.domain.entitys;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idClient;

    @Column(length = 30)
    private String username;

    @Column(length = 100, name = "_password")
    private String password;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(length = 150)
    private String address;

    @Column(length = 9)
    private String phone;

    @Column(length = 45)
    private String email;

    private Boolean active;

    @Column(name = "id_rol")
    private Integer idRol;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_rol", insertable = false, updatable = false)
    private Role role;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "date_updated")
    @UpdateTimestamp
    private Date dateUpdated;

    /* ciclo de vida de persistance */
    // @PrePersist
    // void prePersist() {
    // // antes de guardar se hara esto
    // password = EncriptarPassword.encriptarPassword(password);
    // }
}
