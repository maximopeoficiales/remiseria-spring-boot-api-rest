package com.idat.remiseria.app.contracts;

import com.idat.remiseria.domain.entitys.Tariff;
import com.idat.remiseria.domain.entitys.User;

import java.util.List;
import java.util.Optional;

public interface IUserRepository {
    List<User> getAll();

    Optional<User> findById(int idUser);

    User save(User user);

    void delete(int idUser);
}
