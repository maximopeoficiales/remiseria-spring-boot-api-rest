package com.idat.remiseria.app.contracts;

import com.idat.remiseria.domain.entitys.Employee;
import com.idat.remiseria.domain.entitys.Passenger;

import java.util.List;
import java.util.Optional;

public interface IPassengerRepository {
    List<Passenger> getAll();

    Optional<Passenger> findById(int idPassenger);

    Passenger save(Passenger passenger);

    void delete(int idPassenger);
}
