package com.joaquin.math_app.service;

import com.joaquin.math_app.entity.SubstractEntity;
import org.springframework.stereotype.Service;

@Service
public class SubstractService {

    public SubstractEntity calculateSubstract(int num1, int num2) {
        return new SubstractEntity(num1, num2); // Creates a new SubstractEntity with the sum
    }
}
