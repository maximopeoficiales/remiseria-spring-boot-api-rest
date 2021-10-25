package com.idat.remiseria.infrastructure.web.persistence.repository;

import com.idat.remiseria.app.contracts.IVehicleRepository;
import com.idat.remiseria.domain.entitys.Vehicle;
import com.idat.remiseria.infrastructure.web.persistence.crud.IVehicleCR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VehicleRepository implements IVehicleRepository {
    @Autowired
    private IVehicleCR crud;


    @Override
    public List<Vehicle> getAll() {
        return (List<Vehicle>) crud.findAll();
    }

    @Override
    public Optional<Vehicle> findById(int idVehicle) {
        return crud.findById(idVehicle);
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return crud.save(vehicle);
    }

    @Override
    public void delete(int idVehicle) {
        crud.deleteById(idVehicle);
    }
}
