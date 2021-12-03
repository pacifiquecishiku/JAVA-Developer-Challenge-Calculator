package com.witsoftware.calculator.consumer;

import dtos.OperandosDTO;

public interface IConsumer {

    Double sum(OperandosDTO operandosDTO);

    Double subtraction(OperandosDTO operandosDTO);

    Double multiplication(OperandosDTO operandosDTO);

    Double division(OperandosDTO operandosDTO);
}
