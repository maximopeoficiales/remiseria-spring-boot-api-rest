package com.idat.remiseria.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Driver;
import com.idat.remiseria.domain.entitys.Permission;
import org.springframework.data.repository.CrudRepository;

public interface IPermissionCR extends CrudRepository<Permission, Integer> {

}