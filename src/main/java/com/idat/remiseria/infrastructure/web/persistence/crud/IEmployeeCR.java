package com.idat.remiseria.infrastructure.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeCR extends CrudRepository<Employee, Integer> {

}
