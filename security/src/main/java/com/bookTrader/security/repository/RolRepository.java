package com.bookTrader.security.repository;

import org.springframework.data.domain.Pageable;
import com.bookTrader.security.model.entities.Rol;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RolRepository extends PagingAndSortingRepository<Rol,Long> {

    List<Rol> findAllByName(String name, Pageable pageable);

}
