package com.witsoftware.calculator.calculator;

import dtos.OperandosDTO;

import static java.lang.Double.valueOf;

public class Calculator {

    static public Double sum(OperandosDTO operandos) {
        Double a = valueOf(operandos.getA());
        Double b = valueOf(operandos.getB());

        return a + b;
    }

    static public Double subtraction(OperandosDTO operandos) {
        Double a = valueOf(operandos.getA());
        Double b = valueOf(operandos.getB());

        return a - b;
    }

    static public Double multiplication(OperandosDTO operandos) {
        Double a = valueOf(operandos.getA());
        Double b = valueOf(operandos.getB());

        return a * b;
    }

    static public Double division(OperandosDTO operandos) {
        Double a = valueOf(operandos.getA());
        Double b = valueOf(operandos.getB());

        return a / b;
    }
}
