package com.idat.remiseria.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Driver;
import com.idat.remiseria.domain.entitys.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeCR extends CrudRepository<Employee, Integer> {

}
