package com.booktrader.security.repository;

import org.springframework.data.domain.Pageable;
import com.booktrader.security.model.entities.Rol;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RolRepository extends PagingAndSortingRepository<Rol,Long> {

    List<Rol> findAllByName(String name, Pageable pageable);

}
