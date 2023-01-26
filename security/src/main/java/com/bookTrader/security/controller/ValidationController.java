package com.bookTrader.security.controller;

import com.bookTrader.security.model.entities.Validation;
import com.bookTrader.security.service.interfaces.IValidationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ValidationController {

    @Autowired
    IValidationService validationService;

    @GetMapping("validation/FindAll")
    public ResponseEntity<?> findAll(){
        try{
            List<Validation> responseList = validationService.findAll();
            return new ResponseEntity<>(responseList, HttpStatus.OK);
        }catch (Exception e){
            log.error(e.getMessage(), e);
            return new ResponseEntity<>("Error al listar validaciones", HttpStatus.BAD_REQUEST);
        }
    }


}
