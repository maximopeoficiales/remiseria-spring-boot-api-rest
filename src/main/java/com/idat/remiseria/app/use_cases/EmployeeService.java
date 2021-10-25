package com.idat.remiseria.app.use_cases;

import com.idat.remiseria.domain.entitys.Employee;
import com.idat.remiseria.infrastructure.web.persistence.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAll() {
        return repository.getAll();
    }

    public Optional<Employee> findById(int idEmployee) {
        return repository.findById(idEmployee);
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public boolean delete(int idEmployee) {
        return this.findById(idEmployee).map(driver -> {
            repository.delete(idEmployee);
            return true;
        }).orElse(false);
    }
}
