package com.idat.remiseria.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Driver;
import com.idat.remiseria.domain.entitys.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface IReservationCR extends CrudRepository<Reservation, Integer> {

}
