package com.idat.remiseria.infrastructure.web.persistence.repository;

import com.idat.remiseria.app.contracts.IPassengerRepository;
import com.idat.remiseria.domain.entitys.Passenger;
import com.idat.remiseria.infrastructure.web.persistence.crud.IPassengerCR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PassengerRepository implements IPassengerRepository {
    @Autowired
    private IPassengerCR crud;

    @Override
    public List<Passenger> getAll() {
        return (List<Passenger>) crud.findAll();
    }

    @Override
    public Optional<Passenger> findById(int idPassenger) {
        return crud.findById(idPassenger);
    }

    @Override
    public Passenger save(Passenger passenger) {
        return crud.save(passenger);
    }

    @Override
    public void delete(int idPassenger) {
        crud.deleteById(idPassenger);
    }
}
