package com.idat.remiseria.app.use_cases;

import com.idat.remiseria.domain.entitys.User;
import com.idat.remiseria.infrastructure.shared.EncryptPassword;
import com.idat.remiseria.infrastructure.web.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getAll() {
        return repository.getAll();
    }

    public Optional<User> findById(int idUser) {
        return repository.findById(idUser);
    }

    public Optional<User> findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public User save(User user) {
        user.setActive(true);
        user.setPassword(EncryptPassword.encrypt(user.getPassword()));
        return repository.save(user);
    }

    public boolean delete(int idUser) {
        return this.findById(idUser).map(driver -> {
            repository.delete(idUser);
            return true;
        }).orElse(false);
    }
}
