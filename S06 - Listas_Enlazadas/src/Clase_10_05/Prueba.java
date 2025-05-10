/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase_10_05;

public class Prueba {

    public static void main(String[] args) {

        ListaEnlazada L = new ListaEnlazada();
        L.insertarAlInicio(7);
        L.add_tail(5);
        L.add_tail(3);
        L.add_tail(9);

        Nodo temp = L.getHead();
 
        while (temp != null) {
            System.out.println(temp.clave);
            temp = temp.siguiente;
        }
        System.out.println("");
    }

}
