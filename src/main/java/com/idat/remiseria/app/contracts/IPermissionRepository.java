package com.idat.remiseria.app.contracts;

import com.idat.remiseria.domain.entitys.Payment;
import com.idat.remiseria.domain.entitys.Permission;

import java.util.List;
import java.util.Optional;

public interface IPermissionRepository {
    List<Permission> getAll();

    Optional<Permission> findById(int idPermission);

    Permission save(Permission permission);

    void delete(int idPermission);
}
