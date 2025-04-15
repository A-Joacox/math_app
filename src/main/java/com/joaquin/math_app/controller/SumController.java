package com.joaquin.math_app.controller;

import com.joaquin.math_app.entity.SumEntity;
import com.joaquin.math_app.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @Autowired
    private SumService sumService;

    @GetMapping("/sum/{num1}/{num2}")
    public int getSum(@PathVariable int num1, @PathVariable int num3) {

        SumEntity sumEntity = sumService.calculateSum(num1, num3);
        return sumEntity.getResult();
    }
}
