/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase_17_05;

public class Prueba {

    public static void main(String[] args) {
        
        Diccionario d = new Diccionario();
        
        d.adicionar("Casa", "House");
        d.adicionar("Celular", "Cellphone");
        d.adicionar("Manzana", "Apple");
        d.adicionar("Hola", "Hello");
        
        d.listar(); //para mostrar la lista
        
        System.out.println("\n");
        d.buscar("Casa");
        
        System.out.println("\n");
        d.eliminar("Manzana");
        d.listar();
        
    }
    
}
