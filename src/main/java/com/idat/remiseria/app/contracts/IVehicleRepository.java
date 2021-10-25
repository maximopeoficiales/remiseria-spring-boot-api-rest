package com.idat.remiseria.app.contracts;

import com.idat.remiseria.domain.entitys.User;
import com.idat.remiseria.domain.entitys.Vehicle;

import java.util.List;
import java.util.Optional;

public interface IVehicleRepository {
    List<Vehicle> getAll();

    Optional<Vehicle> findById(int idVehicle);

    Vehicle save(Vehicle vehicle);

    void delete(int idVehicle);
}
