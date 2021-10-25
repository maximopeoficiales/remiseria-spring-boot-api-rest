package com.idat.remiseria.app.use_cases;

import com.idat.remiseria.domain.entitys.Passenger;
import com.idat.remiseria.infrastructure.web.persistence.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository repository;

    public List<Passenger> getAll() {
        return repository.getAll();
    }

    public Optional<Passenger> findById(int idPassenger) {
        return repository.findById(idPassenger);
    }

    public Passenger save(Passenger passenger) {
        return repository.save(passenger);
    }

    public boolean delete(int idPassenger) {
        return this.findById(idPassenger).map(driver -> {
            repository.delete(idPassenger);
            return true;
        }).orElse(false);
    }
}
