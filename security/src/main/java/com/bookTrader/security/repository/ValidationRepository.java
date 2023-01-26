package com.bookTrader.security.repository;

import com.bookTrader.security.model.entities.Validation;
import org.springframework.data.repository.CrudRepository;

public interface ValidationRepository extends CrudRepository<Validation,Long> {
}
