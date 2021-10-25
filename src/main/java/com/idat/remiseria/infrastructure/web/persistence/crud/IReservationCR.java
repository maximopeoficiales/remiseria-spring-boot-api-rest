package com.idat.remiseria.infrastructure.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface IReservationCR extends CrudRepository<Reservation, Integer> {

}
