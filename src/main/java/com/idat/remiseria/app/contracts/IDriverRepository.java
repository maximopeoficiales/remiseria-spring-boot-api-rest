package com.idat.remiseria.app.contracts;

import com.idat.remiseria.domain.entitys.Driver;

import java.util.List;
import java.util.Optional;

public interface IDriverRepository {
    List<Driver> getAll();

    Optional<Driver> findById(int idDriver);

    Driver save(Driver driver);

    void delete(int idDriver);
}
