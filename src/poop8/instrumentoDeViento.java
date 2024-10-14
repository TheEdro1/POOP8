/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author poo03alu09
 */
public class instrumentoDeViento extends Object implements instrumentoMusical {

    public instrumentoDeViento() {
    }
    
    

    @Override
    public void tocar() {
        System.out.println("Tocando Instrumento Musical");
    }

    @Override
    public String tipodeInstrumento() {
        System.out.println("Musical");
        return "musical";
    }

    @Override
    public void afinar() {
        System.out.println("Afinado");
    }

    @Override
    public String toString() {
        return "instrumentoDeViento{" + '}';
    }
    
}
