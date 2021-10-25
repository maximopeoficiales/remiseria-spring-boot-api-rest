package com.idat.remiseria.infrastructure.web.persistence.repository;

import com.idat.remiseria.app.contracts.IDriverRepository;
import com.idat.remiseria.domain.entitys.Driver;
import com.idat.remiseria.infrastructure.web.persistence.crud.IDriverCR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DriverRepository implements IDriverRepository {
    @Autowired
    private IDriverCR crud;

    @Override
    public List<Driver> getAll() {
        return (List<Driver>) crud.findAll();
    }

    @Override
    public Optional<Driver> findById(int idDriver) {
        return crud.findById(idDriver);
    }

    @Override
    public Driver save(Driver driver) {
        return crud.save(driver);
    }

    @Override
    public void delete(int idDriver) {
        crud.deleteById(idDriver);
    }
}
