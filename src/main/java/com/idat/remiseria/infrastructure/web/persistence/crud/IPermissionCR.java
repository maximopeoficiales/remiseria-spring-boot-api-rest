package com.idat.remiseria.infrastructure.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Permission;
import org.springframework.data.repository.CrudRepository;

public interface IPermissionCR extends CrudRepository<Permission, Integer> {

}
