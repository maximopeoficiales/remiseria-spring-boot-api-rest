package com.idat.remiseria.infrastructure.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Driver;
import org.springframework.data.repository.CrudRepository;

public interface IDriverCR extends CrudRepository<Driver, Integer> {

}
