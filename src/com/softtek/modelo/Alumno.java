package com.softtek.modelo;

public class Alumno {
    private String nombreCompleto;
    private int[] notas;

    public Alumno(String nombre, int numNotas) {
        this.nombreCompleto = nombre;
        this.notas = new int[numNotas];
    }

    public double media() {
        double sum = 0;
        for(int nota : this.notas) {
            sum += nota;
        }
        return sum / this.notas.length;
    }

    public void mostrarNotas() {
        for(int nota : this.notas) {
            System.out.println(nota);
        }
    }

    public void setNotas(int[] notas) {
        if(this.notas.length != notas.length) return;
        this.notas = notas;
    }
}
