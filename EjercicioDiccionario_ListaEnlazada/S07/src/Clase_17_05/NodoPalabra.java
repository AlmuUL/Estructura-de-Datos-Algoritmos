/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_17_05;

public class NodoPalabra {
    
    String original;
    String traduccion;
    NodoPalabra siguiente;

    public NodoPalabra() {
    }

    public NodoPalabra(String original, String traduccion) {
        this.original = original;
        this.traduccion = traduccion;
        this.siguiente = null;  //el siguiente apunta a null
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }

    
}
