package com.softtek.modelo.herencia1;

public class Circulo extends Figura{
    private double radio;
    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }
    @Override
    public String posicion() {
        return super.posicion();
    }
}
