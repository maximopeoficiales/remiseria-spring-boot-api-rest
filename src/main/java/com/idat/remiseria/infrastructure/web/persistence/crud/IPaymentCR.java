package com.idat.remiseria.infrastructure.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Payment;
import org.springframework.data.repository.CrudRepository;

public interface IPaymentCR extends CrudRepository<Payment, Integer> {

}
