package com.idat.remiseria.app.contracts;

import com.idat.remiseria.domain.entitys.Driver;
import com.idat.remiseria.domain.entitys.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeRepository {
    List<Employee> getAll();

    Optional<Employee> findById(int idEmployee);

    Employee save(Employee employee);

    void delete(int idEmployee);
}
