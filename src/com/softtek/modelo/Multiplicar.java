package com.softtek.modelo;

public class Multiplicar {
    private int n;

    public Multiplicar(int n) {
        this.n = n;
    }

    public void muestraTabla() {
        for(int i=1;i<=10;i++) {
            System.out.println(this.n + " x " + i + " = " + (this.n * i));
        }
    }
}
