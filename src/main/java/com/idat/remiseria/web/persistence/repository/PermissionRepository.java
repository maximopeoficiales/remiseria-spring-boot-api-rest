package com.idat.remiseria.web.persistence.repository;

import com.idat.remiseria.app.contracts.IPaymentRepository;
import com.idat.remiseria.app.contracts.IPermissionRepository;
import com.idat.remiseria.domain.entitys.Payment;
import com.idat.remiseria.domain.entitys.Permission;
import com.idat.remiseria.web.persistence.crud.IPaymentCR;
import com.idat.remiseria.web.persistence.crud.IPermissionCR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PermissionRepository implements IPermissionRepository {
    @Autowired
    private IPermissionCR crud;

    @Override
    public List<Permission> getAll() {
        return (List<Permission>) crud.findAll();
    }

    @Override
    public Optional<Permission> findById(int idPermission) {
        return crud.findById(idPermission);
    }

    @Override
    public Permission save(Permission permission) {
        return crud.save(permission);
    }

    @Override
    public void delete(int idPermission) {
        crud.deleteById(idPermission);
    }
}
