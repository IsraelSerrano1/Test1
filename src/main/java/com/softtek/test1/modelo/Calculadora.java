package com.softtek.test1.modelo;

public class Calculadora {

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public static double dividir(double num1, double num2) throws Exception{
        if(num2 == 0){
            throw new Exception("No se puede poner un 0 en el divisor");
        }
        return num1 / num2;
    }
}
