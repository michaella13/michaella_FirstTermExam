package com.termOneExam.simpleCalculator.dto;

public class DoMathRequest {
    private Double leftOperand;
    private Double rightOperand;
     private Double result;
    private String operation;

    public DoMathRequest(Double leftOperand, Double rightOperand, String operation) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operation = operation;
    }
    public DoMathRequest(String operation) {
        this(0.0d, 0.0d, 0.0d);
    }

    public DoMathRequest(Double leftOperand, Double rightOperand, Double result) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.result = result;

    }




    public Double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(Double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public Double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(Double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

//    @Override
//    public String toString() {
//        return "Equation [leftOperand=" + leftOperand + ", rightOperand=" + rightOperand + ", result=" + result
//                + ", operation=" + operation + "]";
//    }
}
