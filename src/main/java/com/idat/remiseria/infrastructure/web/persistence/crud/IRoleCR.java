package com.idat.remiseria.infrastructure.web.persistence.crud;

import com.idat.remiseria.domain.entitys.Role;
import org.springframework.data.repository.CrudRepository;

public interface IRoleCR extends CrudRepository<Role, Integer> {
}
