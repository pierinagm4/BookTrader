package com.booktrader.security.service.interfaces;


import com.booktrader.security.model.entities.Validation;

import java.util.List;

public interface IValidationService {

    public List<Validation> findAll();

}
