package com.termOneExam.simpleCalculator.contoller;

import com.termOneExam.simpleCalculator.dto.DoMathRequest;
import com.termOneExam.simpleCalculator.service.MathOperator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/calculator")
public class MathController {


    private MathOperator mathOperator;

        public MathController(MathOperator mathOperator) {
            this.mathOperator = mathOperator;
        }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
public Integer doMath(@RequestBody DoMathRequest doMathRequest){
return mathOperator.doMath(doMathRequest);

    }

}

