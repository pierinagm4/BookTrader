package com.bookTrader.security.repository;

import com.bookTrader.security.model.entities.Rol;
import com.bookTrader.security.model.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
