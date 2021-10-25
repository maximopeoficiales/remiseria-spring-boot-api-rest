package com.idat.remiseria.infrastructure.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface IPassengerCR extends CrudRepository<Passenger, Integer> {

}
