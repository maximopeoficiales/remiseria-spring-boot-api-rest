package com.idat.remiseria.app.use_cases;

import com.idat.remiseria.domain.entitys.Reservation;
import com.idat.remiseria.infrastructure.web.persistence.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    public List<Reservation> getAll() {
        return repository.getAll();
    }

    public Optional<Reservation> findById(int idReservation) {
        return repository.findById(idReservation);
    }

    public Reservation save(Reservation reservation) {
        return repository.save(reservation);
    }

    public boolean delete(int idReservation) {
        return this.findById(idReservation).map(driver -> {
            repository.delete(idReservation);
            return true;
        }).orElse(false);
    }
}
