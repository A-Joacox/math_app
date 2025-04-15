package com.joaquin.math_app.controller;

import com.joaquin.math_app.entity.MultiplyEntity;
import com.joaquin.math_app.service.MultiplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplyController {

    @Autowired
    private MultiplyService multiplyService;  // Inject the service, not the controller

    @GetMapping("/multiply/{num1}/{num2}")
    public long getMupltiply(@PathVariable long num1, @PathVariable long num2) {

        MultiplyEntity multiplyEntity = MultiplyService.calculateMultiply(num1, num2);
        return MultiplyEntity.getResult();
    }
}
