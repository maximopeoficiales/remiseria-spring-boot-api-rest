package com.idat.remiseria.app.contracts;

import com.idat.remiseria.domain.entitys.Payment;
import com.idat.remiseria.domain.entitys.Reservation;
import com.idat.remiseria.domain.entitys.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleRepository {
    List<Role> getAll();

    Optional<Role> findById(int idRole);

    Role save(Role role);

    void delete(int idRole);
}
