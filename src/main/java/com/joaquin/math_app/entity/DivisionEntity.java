package com.joaquin.math_app.entity;

public class DivisionEntity {
    private long num1;
    private long num2;
    private long result;  // Cambiar a instancia en lugar de estático

    // Constructor
    public DivisionEntity(long num1, long num2) {
        this.num1 = num1;
        this.num2 = num2;
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        this.result = num1 / num2;  // Calcular el resultado de la división
    }

    // Getters and setters
    public long getNum1() {
        return num1;
    }

    public void setNum1(long num1) {
        this.num1 = num1;
    }

    public long getNum2() {
        return num2;
    }

    public void setNum2(long num2) {
        this.num2 = num2;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }
}
