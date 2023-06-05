package com.softtek.test1.modelo;

public class Figura {
    protected static int coordenadaX;
    protected static int coordenadaY;

    public Figura(int x, int y) {
        coordenadaX = x;
        coordenadaY = y;
    }
    public static int getCoordenadaX() {
        return coordenadaX;
    }
    public static void setCoordenadaX(int coordenadaX) {
        Figura.coordenadaX = coordenadaX;
    }
    public static int getCoordenadaY() {
        return coordenadaY;
    }
    public static void setCoordenadaY(int coordenadaY) {
        Figura.coordenadaY = coordenadaY;
    }
    public static String posicion() {
        return "(" + coordenadaX + ", " + coordenadaY + ")";
    }


}
