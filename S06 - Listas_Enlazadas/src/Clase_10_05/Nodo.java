/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_10_05;

public class Nodo {
    
    // Dato almacenado
    int clave; 
    // Referencia al siguiente nodo
    Nodo siguiente; 
    
    // Constructor
    public Nodo(int clave) {
        this.clave = clave;
        this.siguiente = null;
    }
}
