package com.joaquin.math_app.service;

import com.joaquin.math_app.entity.DivisionEntity;
import org.springframework.stereotype.Service;

@Service
public class DivisionService {
    public static DivisionEntity calculateDivision(long num1, long num2) {
        return new DivisionEntity(num1, num2); // Creates a new SubstractEntity with the sum
    }
}
