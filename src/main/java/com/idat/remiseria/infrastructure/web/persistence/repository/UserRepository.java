package com.idat.remiseria.infrastructure.web.persistence.repository;

import com.idat.remiseria.app.contracts.IUserRepository;
import com.idat.remiseria.domain.entitys.User;
import com.idat.remiseria.infrastructure.web.persistence.crud.IUserCR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements IUserRepository {
    @Autowired
    private IUserCR crud;

    @Override
    public List<User> getAll() {
        return (List<User>) crud.findAll();
    }

    @Override
    public Optional<User> findById(int idUser) {
        return crud.findById(idUser);
    }

    @Override
    public User save(User user) {
        return crud.save(user);
    }

    @Override
    public void delete(int idUser) {
        crud.deleteById(idUser);
    }
}
