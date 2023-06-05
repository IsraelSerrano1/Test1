package com.softtek.test1.modelo;

import static java.lang.Math.PI;

public class Circulo extends Figura{
    private final double radio;
    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String posicion() {
        return super.posicion();
    }

    public double areaCirculo(double radio){
        return PI * Math.pow(radio, 2);
    }
}
