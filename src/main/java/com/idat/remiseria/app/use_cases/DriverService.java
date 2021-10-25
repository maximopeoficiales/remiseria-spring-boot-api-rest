package com.idat.remiseria.app.use_cases;

import com.idat.remiseria.domain.entitys.Driver;
import com.idat.remiseria.infrastructure.web.persistence.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    private DriverRepository repository;

    public List<Driver> getAll() {
        return repository.getAll();
    }

    public Optional<Driver> findById(int idDriver) {
        return repository.findById(idDriver);
    }

    public Driver save(Driver driver) {
        return repository.save(driver);
    }

    public boolean delete(int idDriver) {
        return this.findById(idDriver).map(driver -> {
            repository.delete(idDriver);
            return true;
        }).orElse(false);
    }
}
