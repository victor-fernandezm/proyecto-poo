package com.softtek.modelo;

public class Dado {
    private int caras;


    public Dado() {
        this.caras = 6;
    }

    public Dado(int caras) {
        this.caras = caras;
    }
/*
+---------+
| *     * |
|    *    |
| *     * |
+---------+
 */

    private void print1() {
        System.out.println("+---------+\n|         |\n|    *    |\n|         |\n+---------+");
    }
    private void print2() {
        System.out.println("+---------+\n|       * |\n|         |\n| *       |\n+---------+");
    }
    private void print3() {
        System.out.println("+---------+\n|       * |\n|    *    |\n| *       |\n+---------+");
    }
    private void print4() {
        System.out.println("+---------+\n| *     * |\n|         |\n| *     * |\n+---------+");
    }

    private void print5() {
        System.out.println("+---------+\n| *     * |\n|    *    |\n| *     * |\n+---------+");
    }

    private void print6() {
        System.out.println("+---------+\n| *     * |\n| *     * |\n| *     * |\n+---------+");
    }

    public void lanzar() {
        int roll = (int)(Math.random() * (this.caras - 1) + 1);
        System.out.println("Rolling 1d" + this.caras + "...");
        if(this.caras == 6) {
            if(roll == 1) this.print1();
            if(roll == 2) this.print2();
            if(roll == 3) this.print3();
            if(roll == 4) this.print4();
            if(roll == 5) this.print5();
            if(roll == 6) this.print6();
        }else {
            if(this.caras == 20) {
                if(roll == 1) System.out.println("Result: " + roll + ". FAIL");
                else if(roll == 20) System.out.println("Result: " + roll + ". CRITICAL HIT");
                else System.out.println("Result: " + roll);
            }else {
                System.out.println("Result: " + roll);
            }
        }
    }
}
