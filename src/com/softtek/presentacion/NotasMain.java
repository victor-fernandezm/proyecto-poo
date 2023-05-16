package com.softtek.presentacion;

import com.softtek.modelo.Alumno;

public class NotasMain {
    public static void main(String[] args) {
        Alumno pepe = new Alumno("Pepe", 3);
        pepe.setNotas(new int[] {2,8,5});
        pepe.mostrarNotas();
        System.out.println("Media: " + pepe.media());
    }
}
