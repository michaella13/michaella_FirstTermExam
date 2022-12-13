package com.termOneExam.simpleCalculator.service;

import com.termOneExam.simpleCalculator.dto.DoMathRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorServiceTests {

    private DoMathRequest doMathRequest=new DoMathRequest(3d, 2d,"+");
    MathOperatorImpl mathOperator=new MathOperatorImpl();
    @Test
    public void performAddition_success(){
    assertEquals(5d,mathOperator.doMath(doMathRequest));
    }

    @Test
    public void performAddition_fail(){
        assertNotEquals(2d,mathOperator.doMath(doMathRequest));
    }
    private DoMathRequest doMathRequest1=new DoMathRequest(3d, 2d,"-");
    @Test
    public void performSubtraction_success(){
        assertEquals(1d,mathOperator.doMath(doMathRequest));
    }
    @Test
    public void performSubtraction_fail(){
        assertEquals(5d,mathOperator.doMath(doMathRequest));
    }

}
