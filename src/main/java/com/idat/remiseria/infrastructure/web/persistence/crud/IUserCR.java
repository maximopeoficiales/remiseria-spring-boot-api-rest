package com.idat.remiseria.infrastructure.web.persistence.crud;

import com.idat.remiseria.domain.entitys.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IUserCR extends CrudRepository<User, Integer> {
    Optional<User> findByUsername(String username);

    // @Query(value = "SELECT u FROM client where u.username = 1?", nativeQuery = true)
    // Client findByUsername2(String username);

    Optional<User> findByEmail(String email);
}
