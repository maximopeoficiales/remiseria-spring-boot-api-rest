package com.idat.remiseria.web.persistence.repository;

import com.idat.remiseria.app.contracts.IStateReservationRepository;
import com.idat.remiseria.app.contracts.ITariffRepository;
import com.idat.remiseria.domain.entitys.Role;
import com.idat.remiseria.domain.entitys.StateReservation;
import com.idat.remiseria.domain.entitys.Tariff;
import com.idat.remiseria.web.persistence.crud.IStateReservationCR;
import com.idat.remiseria.web.persistence.crud.ITariffCR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TariffRepository implements ITariffRepository {
    @Autowired
    private ITariffCR crud;

    @Override
    public List<Tariff> getAll() {
        return (List<Tariff>) crud.findAll();
    }

    @Override
    public Optional<Tariff> findById(int idTariff) {
        return crud.findById(idTariff);
    }

    @Override
    public Tariff save(Tariff tariff) {
        return crud.save(tariff);
    }

    @Override
    public void delete(int idTariff) {
        crud.deleteById(idTariff);
    }
}
