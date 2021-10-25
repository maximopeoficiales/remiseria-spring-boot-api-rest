package com.idat.remiseria.app.contracts;

import com.idat.remiseria.domain.entitys.Payment;
import com.idat.remiseria.domain.entitys.Permission;
import com.idat.remiseria.domain.entitys.Reservation;

import java.util.List;
import java.util.Optional;

public interface IReservationRepository {
    List<Reservation> getAll();

    Optional<Reservation> findById(int idReservation);

    Reservation save(Reservation reservation);

    void delete(int idReservation);
}
