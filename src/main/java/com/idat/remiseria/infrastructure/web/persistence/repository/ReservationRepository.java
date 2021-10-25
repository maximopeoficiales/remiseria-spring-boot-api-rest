package com.idat.remiseria.infrastructure.web.persistence.repository;

import com.idat.remiseria.app.contracts.IReservationRepository;
import com.idat.remiseria.domain.entitys.Reservation;
import com.idat.remiseria.infrastructure.web.persistence.crud.IReservationCR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository implements IReservationRepository {
    @Autowired
    private IReservationCR crud;

    @Override
    public List<Reservation> getAll() {
        return (List<Reservation>) crud.findAll();
    }

    @Override
    public Optional<Reservation> findById(int idReservation) {
        return crud.findById(idReservation);
    }

    @Override
    public Reservation save(Reservation reservation) {
        return crud.save(reservation);
    }

    @Override
    public void delete(int idReservation) {
        crud.deleteById(idReservation);
    }
}
