package com.idat.remiseria.app.contracts;

import com.idat.remiseria.domain.entitys.Payment;
import com.idat.remiseria.domain.entitys.Role;
import com.idat.remiseria.domain.entitys.StateReservation;

import java.util.List;
import java.util.Optional;

public interface IStateReservationRepository {
    List<StateReservation> getAll();

    Optional<StateReservation> findById(int idStateReservation);

    StateReservation save(StateReservation stateReservation);

    void delete(int idStateReservation);
}
