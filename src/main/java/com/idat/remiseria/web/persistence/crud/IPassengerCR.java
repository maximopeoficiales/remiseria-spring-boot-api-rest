package com.idat.remiseria.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Driver;
import com.idat.remiseria.domain.entitys.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface IPassengerCR extends CrudRepository<Passenger, Integer> {

}
