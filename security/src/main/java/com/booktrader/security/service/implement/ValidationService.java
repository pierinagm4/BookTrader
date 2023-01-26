package com.booktrader.security.service.implement;

import com.booktrader.security.model.entities.Validation;
import com.booktrader.security.repository.ValidationRepository;
import com.booktrader.security.service.interfaces.IValidationService;
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
