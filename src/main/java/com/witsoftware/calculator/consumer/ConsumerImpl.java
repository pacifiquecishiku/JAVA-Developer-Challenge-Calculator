package com.witsoftware.calculator.consumer;

import com.witsoftware.calculator.calculator.Calculator;
import dtos.OperandosDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static consts.RabbitMQ.*;

@Component
public class ConsumerImpl implements IConsumer {

    @Override
    @RabbitListener(queues = SUM_QUEUE)
    public Double sum(OperandosDTO operandosDTO) {
        return Calculator.sum(operandosDTO);
    }

    @Override
    @RabbitListener(queues = SUBTRACTION_QUEUE)
    public Double subtraction(OperandosDTO operandosDTO) {
        return Calculator.subtraction(operandosDTO);
    }

    @Override
    @RabbitListener(queues = MULTIPLICATION_QUEUE)
    public Double multiplication(OperandosDTO operandosDTO) {
        return Calculator.multiplication(operandosDTO);
    }

    @Override
    @RabbitListener(queues = DIVISION_QUEUE)
    public Double division(OperandosDTO operandosDTO) {
        return Calculator.division(operandosDTO);
    }
}
