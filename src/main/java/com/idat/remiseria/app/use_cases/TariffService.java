package com.idat.remiseria.app.use_cases;

import com.idat.remiseria.domain.entitys.Tariff;
import com.idat.remiseria.web.persistence.repository.TariffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TariffService {

    @Autowired
    private TariffRepository repository;

    public List<Tariff> getAll() {
        return repository.getAll();
    }

    public Optional<Tariff> findById(int idTariff) {
        return repository.findById(idTariff);
    }

    public Tariff save(Tariff tariff) {
        return repository.save(tariff);
    }

    public boolean delete(int idTariff) {
        return this.findById(idTariff).map(driver -> {
            repository.delete(idTariff);
            return true;
        }).orElse(false);
    }
}
