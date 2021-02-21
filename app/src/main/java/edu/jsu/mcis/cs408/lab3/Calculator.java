package edu.jsu.mcis.cs408.lab3;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.lang.Math;

public class Calculator {
    private AppCompatActivity parent;
    private BigDecimal leftValue;
    private BigDecimal rightValue;
    private double leftDouble;
    private BigDecimal result;
    private String previousOp;
    private StringBuilder inputBuffer = new StringBuilder();
    private StringBuilder displayBuffer = new StringBuilder();

    public Calculator(AppCompatActivity parent){
        this.parent = parent;

    }
    public void process(String button) {
        if (button.equals(parent.getResources().getString(R.string.Clear))) {
            leftValue = null;
            rightValue = null;
            inputBuffer = new StringBuilder();
            displayBuffer = new StringBuilder();
        }

        if (button.equals(parent.getResources().getString(R.string._1))) {
            inputBuffer.append("1");



        }

        if (button.equals(parent.getResources().getString(R.string._2))) {
            inputBuffer.append("2");

        }

        if (button.equals(parent.getResources().getString(R.string._3))) {
            inputBuffer.append("3");

        }

        if (button.equals(parent.getResources().getString(R.string._4))) {
            inputBuffer.append("4");

        }

        if (button.equals(parent.getResources().getString(R.string._5))) {
            inputBuffer.append("5");

        }

        if (button.equals(parent.getResources().getString(R.string._6))) {
            inputBuffer.append("6");

        }

        if (button.equals(parent.getResources().getString(R.string._7))) {
            inputBuffer.append("7");

        }

        if (button.equals(parent.getResources().getString(R.string._8))) {
            inputBuffer.append("8");

        }

        if (button.equals(parent.getResources().getString(R.string._9))) {
            inputBuffer.append("9");

        }

        if (button.equals(parent.getResources().getString(R.string._0))) {
            inputBuffer.append("0");

        }

        if (button.equals(parent.getResources().getString(R.string.Decimal))) {
            if (!inputBuffer.toString().contains(".")) {
                inputBuffer.append(".");

            }
        }
        if (button.equals(parent.getResources().getString(R.string.Addition))) {
            displayBuffer = new StringBuilder();
            if (leftValue == null && !inputBuffer.toString().isEmpty()) {
                leftValue = new BigDecimal(inputBuffer.toString());
                inputBuffer = new StringBuilder();

            }
            else if (leftValue != null && !inputBuffer.toString().isEmpty()) {
                rightValue = new BigDecimal(inputBuffer.toString());
                leftValue = leftValue.add(rightValue);
                rightValue = new BigDecimal("0");
                displayBuffer.append(leftValue);
                inputBuffer = new StringBuilder();
            }
        }
        if (button.equals(parent.getResources().getString(R.string.Subtraction))) {
            displayBuffer = new StringBuilder();
            if (leftValue == null && !inputBuffer.toString().isEmpty()) {
                leftValue = new BigDecimal(inputBuffer.toString());
                inputBuffer = new StringBuilder();
            }
            else if (leftValue != null && !inputBuffer.toString().isEmpty()) {
                rightValue = new BigDecimal(inputBuffer.toString());
                leftValue = leftValue.subtract(rightValue);
                rightValue = new BigDecimal("0");
                displayBuffer.append(leftValue);
                inputBuffer = new StringBuilder();
            }
        }
        if (button.equals(parent.getResources().getString(R.string.multiplication))) {
            displayBuffer = new StringBuilder();
            if (leftValue == null && !inputBuffer.toString().isEmpty()) {
                leftValue = new BigDecimal(inputBuffer.toString());
                inputBuffer = new StringBuilder();
            }
            else if (leftValue != null && !inputBuffer.toString().isEmpty()) {
                rightValue = new BigDecimal(inputBuffer.toString());
                leftValue = leftValue.multiply(rightValue);
                rightValue = new BigDecimal("0");
                displayBuffer.append(leftValue);
                inputBuffer = new StringBuilder();
            }
        }
        if (button.equals(parent.getResources().getString(R.string.division))) {
            displayBuffer = new StringBuilder();
            if (leftValue == null && !inputBuffer.toString().isEmpty()) {
                leftValue = new BigDecimal(inputBuffer.toString());
                inputBuffer = new StringBuilder();
            }
            else if (leftValue != null && !inputBuffer.toString().isEmpty()) {
                rightValue = new BigDecimal(inputBuffer.toString());
                leftValue = leftValue.divide(rightValue);
                rightValue = new BigDecimal("0");
                displayBuffer.append(leftValue);
                inputBuffer = new StringBuilder();
            }
        }
        if (button.equals(parent.getResources().getString(R.string.Modulus))) {
            displayBuffer = new StringBuilder();
            if (leftValue == null && !inputBuffer.toString().isEmpty()) {
                leftValue = new BigDecimal(inputBuffer.toString());
                inputBuffer = new StringBuilder();
            }
            else if (leftValue != null && !inputBuffer.toString().isEmpty()) {
                rightValue = new BigDecimal(inputBuffer.toString());
                leftValue = leftValue.remainder(rightValue);
                rightValue = new BigDecimal("0");
                displayBuffer.append(leftValue);
                inputBuffer = new StringBuilder();
            }
        }
        if (button.equals(parent.getResources().getString(R.string.Sqrt))) {
            displayBuffer = new StringBuilder();
            if (leftValue == null && !inputBuffer.toString().isEmpty()) {
                leftValue = new BigDecimal(inputBuffer.toString());
                leftDouble = leftValue.doubleValue();
                leftDouble = Math.pow(leftDouble,.5);
                leftValue = BigDecimal.valueOf(leftDouble);
                displayBuffer.append(leftValue);
                inputBuffer = new StringBuilder();
            }


        }
        if (button.equals(parent.getResources().getString(R.string.Equals))) {

        }
    }
    public String getDisplay() {
        return displayBuffer.toString();
    }
}
