package com.joaquin.math_app.controller;

import com.joaquin.math_app.entity.SubstractEntity;
import com.joaquin.math_app.service.SubstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Para los status codes

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class SubstractController {

    @Autowired
    private SubstractService substractService;

    @GetMapping("/substract/{num1}/{num2}")
    public ResponseEntity<String> getSubstract(@PathVariable int num1, @PathVariable int num2) {
        if (num1 < num2) {
            return new ResponseEntity<>("Error 400: 'a' no puede ser menor que 'b'", HttpStatus.BAD_REQUEST);        }

        if (num1 == num2) {
            return new ResponseEntity<>("Error 400: 'a' no puede ser igual a 'b'", HttpStatus.BAD_REQUEST);        }

        SubstractEntity substractEntity = substractService.calculateSubstract(num1, num2);
        return new ResponseEntity<>("Resultado: " + substractEntity.getResult(), HttpStatus.OK);    }
}

