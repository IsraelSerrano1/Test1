package com.softtek.modelo.herencia1;

public class Figura {
    protected int coordenadaX;
    protected int coordenadaY;

    public Figura(int x, int y) {
        coordenadaX = x;
        coordenadaY = y;
    }
    public int getCoordenadaX() {
        return coordenadaX;
    }
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }
    public int getCoordenadaY() {
        return coordenadaY;
    }
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    public String posicion() {
        return "(" + coordenadaX + ", " + coordenadaY + ")";
    }
}
