package com.idat.remiseria.infrastructure.web.persistence.crud;

import com.idat.remiseria.domain.entitys.StateReservation;
import org.springframework.data.repository.CrudRepository;

public interface IStateReservationCR extends CrudRepository<StateReservation, Integer> {

}
