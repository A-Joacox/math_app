package com.joaquin.math_app.service;

import com.joaquin.math_app.entity.SumEntity;
import org.springframework.stereotype.Service;

@Service
public class SumService {

    public SumEntity calculateSum(int num1, int num2) {
        return new SumEntity(num1, num2); // Creates a new SumEntity with the sum
    }
}
