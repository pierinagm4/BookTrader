package com.bookTrader.security.service.implement;

import com.bookTrader.security.model.entities.User;
import com.bookTrader.security.repository.UserRepository;
import com.bookTrader.security.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepo;

    @Override
    public Page<User> findAll(Pageable page) {
        return userRepo.findAll(page);
    }

}
