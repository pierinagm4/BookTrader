package com.bookTrader.security.service.interfaces;


import com.bookTrader.security.model.entities.User;

import java.util.List;

public interface IUserService {

    public List<User> findAll();

}
