package com.bookTrader.security.service.interfaces;


import com.bookTrader.security.model.entities.Validation;

import java.util.List;

public interface IValidationService {

    public List<Validation> findAll();

}
