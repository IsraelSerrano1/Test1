package com.softtek.test1.modelo;

public class Rectangulo extends Figura{
    private double ancho;
    private double alto;

    public Rectangulo(int x, int y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public static String posicion() {
        return Figura.posicion();
    }

    public static double areaRectangulo(double ancho, double alto){
        return ancho * alto;
    }
}
