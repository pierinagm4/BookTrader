package com.bookTrader.security.service.implement;

import com.bookTrader.security.model.entities.Rol;
import com.bookTrader.security.repository.RolRepository;
import com.bookTrader.security.service.interfaces.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService implements IRolService {

    @Autowired
    RolRepository rolRepo;

    @Override
    public Page<Rol> findAll(Pageable page) {
        return (Page<Rol>) rolRepo.findAll(page);
    }
}
