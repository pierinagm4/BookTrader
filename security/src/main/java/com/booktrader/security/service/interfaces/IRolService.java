package com.booktrader.security.service.interfaces;

import com.booktrader.security.model.entities.Rol;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IRolService {

    public Page<Rol> findAll(Pageable page);

}
