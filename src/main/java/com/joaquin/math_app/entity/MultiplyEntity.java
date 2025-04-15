package com.joaquin.math_app.entity;

public class MultiplyEntity {
    private long num1;
    private long num2;
    private static long result;

    // Constructor
    public MultiplyEntity(long num1, long num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = num1 * num2;
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

    public static long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }
}
