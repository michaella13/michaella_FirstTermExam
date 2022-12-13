package com.termOneExam.simpleCalculator.dto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorDTOTests {
  DoMathRequest doMathRequest=new DoMathRequest(3d, 2d,"+");

  @Test
    public void getMathRequestLeftOperand_Success(){
      assertEquals(3,doMathRequest.getLeftOperand());
  }
    @Test
    public void getMathRequestLeftOperand_Fail(){
        assertNotEquals(7,doMathRequest.getLeftOperand());
    }
    @Test
    public void getMathRequestRightOperand_Success(){
        assertEquals(2,doMathRequest.getRightOperand());
    }
    @Test
    public void getMathRequestRightOperand_Fail(){
        assertNotEquals(7,doMathRequest.getRightOperand());
    }
}
