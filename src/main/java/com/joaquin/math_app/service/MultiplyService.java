package com.joaquin.math_app.service;

import com.joaquin.math_app.entity.MultiplyEntity;
import org.springframework.stereotype.Service;

@Service
public class MultiplyService {
    public static MultiplyEntity calculateMultiply(long num1, long num2) {
        return new MultiplyEntity(num1, num2); // Creates a new SubstractEntity with the sum
    }
}
