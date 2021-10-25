package com.idat.remiseria.app.contracts;

import com.idat.remiseria.domain.entitys.Role;
import com.idat.remiseria.domain.entitys.StateReservation;
import com.idat.remiseria.domain.entitys.Tariff;

import java.util.List;
import java.util.Optional;

public interface ITariffRepository {
    List<Tariff> getAll();

    Optional<Tariff> findById(int idTariff);

    Tariff save(Tariff tariff);

    void delete(int idTariff);
}
