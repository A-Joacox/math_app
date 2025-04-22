package com.joaquin.math_app.controller;

import com.joaquin.math_app.entity.DivisionEntity;
import com.joaquin.math_app.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivisionController {

    @Autowired
    private DivisionService divisionService;  // Inject the service

    @GetMapping("/division/{num1}/{num2}")
    public ResponseEntity<Object> getDivision(@PathVariable long num1, @PathVariable long num2) {
        try {
            DivisionEntity divisionEntity = divisionService.calculateDivision(num1, num2);
            return ResponseEntity.ok(divisionEntity.getResult());
        } catch (ArithmeticException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error interno del servidor: " + e.getMessage());
        }
    }
}
