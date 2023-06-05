package com.softtek.modelo.herencia1;

public class Rectangulo extends Figura{
    private double ancho;
    private double alto;

    public Rectangulo(int x, int y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }
    @Override
    public String posicion() {
        return super.posicion();
    }
}
