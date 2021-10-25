package com.idat.remiseria.web.persistence.repository;

import com.idat.remiseria.app.contracts.IPassengerRepository;
import com.idat.remiseria.app.contracts.IPaymentRepository;
import com.idat.remiseria.domain.entitys.Passenger;
import com.idat.remiseria.domain.entitys.Payment;
import com.idat.remiseria.web.persistence.crud.IPassengerCR;
import com.idat.remiseria.web.persistence.crud.IPaymentCR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PaymentRepository implements IPaymentRepository {
    @Autowired
    private IPaymentCR crud;

    @Override
    public List<Payment> getAll() {
        return (List<Payment>) crud.findAll();
    }

    @Override
    public Optional<Payment> findById(int idPayment) {
        return crud.findById(idPayment);
    }

    @Override
    public Payment save(Payment payment) {
        return crud.save(payment);
    }

    @Override
    public void delete(int idPayment) {
        crud.deleteById(idPayment);
    }
}
