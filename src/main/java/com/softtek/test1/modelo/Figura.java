package com.softtek.test1.modelo;

public class Figura {
    protected static int coordenadaX;
    protected static int coordenadaY;

    public Figura(int x, int y) {
        coordenadaX = x;
        coordenadaY = y;
    }
    public int getCoordenadaX() {
        return coordenadaX;
    }
    public void setCoordenadaX(int coordenadaX) {
        Figura.coordenadaX = coordenadaX;
    }
    public int getCoordenadaY() {
        return coordenadaY;
    }
    public void setCoordenadaY(int coordenadaY) {
        Figura.coordenadaY = coordenadaY;
    }
    public String posicion() {
        return "(" + coordenadaX + ", " + coordenadaY + ")";
    }


}
