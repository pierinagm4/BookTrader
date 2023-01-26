package com.bookTrader.security.service.implement;

import com.bookTrader.security.model.entities.User;
import com.bookTrader.security.repository.UserRepository;
import com.bookTrader.security.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepo;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepo.findAll();
    }

}
