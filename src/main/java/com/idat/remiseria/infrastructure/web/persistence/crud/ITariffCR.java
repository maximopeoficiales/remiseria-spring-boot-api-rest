package com.idat.remiseria.infrastructure.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Tariff;
import org.springframework.data.repository.CrudRepository;

public interface ITariffCR extends CrudRepository<Tariff, Integer> {

}
