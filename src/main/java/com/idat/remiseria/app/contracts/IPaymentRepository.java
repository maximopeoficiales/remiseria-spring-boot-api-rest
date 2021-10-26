package com.idat.remiseria.app.contracts;

import com.idat.remiseria.domain.entitys.Payment;

import java.util.List;
import java.util.Optional;

public interface IPaymentRepository {
    List<Payment> getAll();

    Optional<Payment> findById(int idPayment);

    Payment save(Payment payment);

    void delete(int idPayment);
}
