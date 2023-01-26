package com.bookTrader.security.service.implement;

import com.bookTrader.security.model.entities.Rol;
import com.bookTrader.security.repository.RolRepository;
import com.bookTrader.security.service.interfaces.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService implements IRolService {

    @Autowired
    RolRepository rolRepo;

    @Override
    public List<Rol> findAll() {
        return (List<Rol>) rolRepo.findAll();
    }
}
