package com.softtek.test1.modelo;

public class Rectangulo extends Figura{
    private final double ancho;
    private final double alto;

    public Rectangulo(int x, int y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
    @Override
    public  String posicion() {
        return super.posicion();
    }

    public double areaRectangulo(double ancho, double alto){
        return ancho * alto;
    }
}
