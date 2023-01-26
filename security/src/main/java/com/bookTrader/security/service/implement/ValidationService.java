package com.bookTrader.security.service.implement;

import com.bookTrader.security.model.entities.Validation;
import com.bookTrader.security.repository.ValidationRepository;
import com.bookTrader.security.service.interfaces.IValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidationService implements IValidationService {

    @Autowired
    ValidationRepository validationRepo;

    @Override
    public List<Validation> findAll() {
        return (List<Validation>) validationRepo.findAll();
    }

}
