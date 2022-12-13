package com.termOneExam.simpleCalculator.controller;

import com.termOneExam.simpleCalculator.dto.DoMathRequest;
import com.termOneExam.simpleCalculator.service.MathOperator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.http.RequestEntity.post;


import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.mockito.BDDMockito.*;




public class CalculatorControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    public MathOperator mathOperator;

    @Test
    public void givenMathRequestObject_toMakeRequest_thenReturnMathRequest() throws Exception{

        // given - precondition or setup
        DoMathRequest doMathRequest=new DoMathRequest(3d, 2d,"+");
        given(mathOperator.doMath(any(DoMathRequest.class)))
                .willAnswer((invocation)-> invocation.getArgument(0));

        // when - action or behaviour that we are going test
        ResultActions response = mockMvc.perform(post("/calculator")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(doMathRequest)));


        // then - verify the result or output using assert statements
        response.andDo(print()).
                andExpect(status().isCreated())
                .andExpect(jsonPath("$.leftOperand",
                        is(doMathRequest.getLeftOperand())))
                .andExpect(jsonPath("$.rightOperand",
                        is(doMathRequest.getRightOperand())))
                .andExpect(jsonPath("$.operation",
                        is(doMathRequest.getOperation())));


    }
}
