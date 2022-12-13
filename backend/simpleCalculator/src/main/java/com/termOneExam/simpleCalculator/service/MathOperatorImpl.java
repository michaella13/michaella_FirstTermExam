package com.termOneExam.simpleCalculator.service;

import com.termOneExam.simpleCalculator.dto.DoMathRequest;

public class MathOperatorImpl implements MathOperator {
    DoMathRequest equation;

    @Override
    public DoMathRequest doMath(DoMathRequest doMathRequest) {
        String operation=doMathRequest.getOperation();
         Double left=doMathRequest.getLeftOperand();
            Double right=doMathRequest.getRightOperand();

            switch(operation){
                case "+":
                    equation = new DoMathRequest(left, right, left + right);
                    return equation;
                case "-":
                    equation = new DoMathRequest(left, right, left - right);
                    return equation;
                case "/":
                    equation = new DoMathRequest(left, right, left / right);
                    return equation;
                case "*":
                    equation = new DoMathRequest(left, right, left * right);
                    return equation;
            }
        return equation;
//

    }
//
//    @Override
//    public DoMathRequest add(Double left, Double right, String operation) {
//        equation = new DoMathRequest(left, right, left+right);
//        return equation;
//    }
//
//    @Override
//    public DoMathRequest subtract(Double left, Double right, String operation) {
//        equation = new DoMathRequest(left, right, left-right);
//        return equation;
//    }
//
//    @Override
//    public DoMathRequest multiply(Double left, Double right, String operation) {
//        equation = new DoMathRequest(left, right, left*right);
//        return equation;
//    }
//
//    @Override
//    public DoMathRequest divide(Double left, Double right, String operation) {
//        equation = new DoMathRequest(left, right, left/right);
//        return equation;
//    }




//    @Override
//    public DoMathRequest doMath(Double left, Double right, String operation) {
//
//        switch (operation) {
//            case "add":
//                equation = new DoMathRequest(left, right, left+right);
//                return equation;
//            case "subtract":
//                equation = new DoMathRequest(left, right, left - right);
//                return equation;
//            case "divide":
//                equation = new DoMathRequest(left, right, left / right);
//                return equation;
//            case "multipy":
//                equation = new DoMathRequest(left, right, left * right);
//                return equation;
//        }
//        return equation;
//    }


}
