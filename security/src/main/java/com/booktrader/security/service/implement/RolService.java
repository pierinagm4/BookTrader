package com.booktrader.security.service.implement;

import com.booktrader.security.model.entities.Rol;
import com.booktrader.security.repository.RolRepository;
import com.booktrader.security.service.interfaces.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RolService implements IRolService {

    @Autowired
    RolRepository rolRepo;

    @Override
    public Page<Rol> findAll(Pageable page) {
        return (Page<Rol>) rolRepo.findAll(page);
    }
}
