package com.idat.remiseria.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Driver;
import com.idat.remiseria.domain.entitys.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface IVehicleCR extends CrudRepository<Vehicle, Integer> {

}
