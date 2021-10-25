package com.idat.remiseria.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Driver;
import com.idat.remiseria.domain.entitys.Tariff;
import org.springframework.data.repository.CrudRepository;

public interface ITariffCR extends CrudRepository<Tariff, Integer> {

}
