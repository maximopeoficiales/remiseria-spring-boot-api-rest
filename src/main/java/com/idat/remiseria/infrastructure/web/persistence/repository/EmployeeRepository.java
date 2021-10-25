package com.idat.remiseria.infrastructure.web.persistence.repository;

import com.idat.remiseria.app.contracts.IEmployeeRepository;
import com.idat.remiseria.domain.entitys.Employee;
import com.idat.remiseria.infrastructure.web.persistence.crud.IEmployeeCR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository implements IEmployeeRepository {
    @Autowired
    private IEmployeeCR crud;

    @Override
    public List<Employee> getAll() {
        return (List<Employee>) crud.findAll();
    }

    @Override
    public Optional<Employee> findById(int idEmployee) {
        return crud.findById(idEmployee);
    }

    @Override
    public Employee save(Employee employee) {
        return crud.save(employee);
    }

    @Override
    public void delete(int idEmployee) {
        crud.deleteById(idEmployee);
    }
}
