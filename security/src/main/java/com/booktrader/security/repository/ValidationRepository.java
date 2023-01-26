package com.booktrader.security.repository;

import com.booktrader.security.model.entities.Validation;
import org.springframework.data.repository.CrudRepository;

public interface ValidationRepository extends CrudRepository<Validation,Long> {
}
