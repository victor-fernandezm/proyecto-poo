package com.softtek.presentacion;

import com.softtek.modelo.Campos;

public class CamposMain {
    public static void main(String[] args) {
        Campos c = new Campos(5);

        c.muestra();
        c.incrementa();
        c.incrementa();
        c.incrementa();
        c.muestra();
    }
}
