/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author poo03alu09
 */
public class Cuadrilatero extends Poligono {
    private int alfa;
    private int beta;
    private float a;
    private float b;
    private float c;
    private float d;
    private float base;
    private float altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(int alfa, int beta, float a, float b, float c, float d, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float perimetro() {
        return a+b+c+d; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public float area() {
        return base*altura; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", base=" + base + ", altura=" + altura + '}';
    }

    
}
