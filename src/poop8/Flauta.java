/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author poo03alu09
 */
public class Flauta extends instrumentoDeViento {

    public Flauta() {
    }
    
    public void tocar(){
        System.out.println("Tocando Flauta");
    }
    
    
    @Override
    public String tipodeInstrumento() {
        System.out.println("Flauta");
        return "Flauta";
    }
    
    @Override
    public void afinar() {
        System.out.println("Afinando Flauta");
    } 

    @Override
    public String toString() {
        return "Flauta{" + '}';
    }

}
