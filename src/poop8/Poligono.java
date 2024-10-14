/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author poo03alu09
 */
public abstract class Poligono {
    public Poligono(){  
    }
    /*
    public float area(){
        return 0.0f;
    }
    
    public float perimetro(){
        return 0.0f;
    }
*/
    public abstract float area();
    public abstract float perimetro();
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
