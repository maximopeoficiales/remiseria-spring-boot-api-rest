package com.idat.remiseria.infrastructure.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface IVehicleCR extends CrudRepository<Vehicle, Integer> {

}
