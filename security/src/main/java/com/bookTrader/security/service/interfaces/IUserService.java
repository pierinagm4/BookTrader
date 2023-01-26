package com.bookTrader.security.service.interfaces;


import com.bookTrader.security.model.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {

    Page<User> findAll(Pageable page);

}
