package com.idat.remiseria.app.use_cases;

import com.idat.remiseria.domain.entitys.Payment;
import com.idat.remiseria.web.persistence.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public List<Payment> getAll() {
        return repository.getAll();
    }

    public Optional<Payment> findById(int idPayment) {
        return repository.findById(idPayment);
    }

    public Payment save(Payment payment) {
        return repository.save(payment);
    }

    public boolean delete(int idPayment) {
        return this.findById(idPayment).map(driver -> {
            repository.delete(idPayment);
            return true;
        }).orElse(false);
    }
}
