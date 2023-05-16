package com.softtek.modelo;

public class Campos {
    private int x;
    public Campos(int x) {
        this.x = x;
    }

    public void muestra() {
        System.out.println(this.x);
    }

    public void incrementa() {
        this.x++;
    }
}
