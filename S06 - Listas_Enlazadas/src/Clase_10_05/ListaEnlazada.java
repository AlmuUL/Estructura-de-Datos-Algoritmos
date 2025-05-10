/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_10_05;

public class ListaEnlazada {

    // Referencia al primer nodo (cabeza)
    private Nodo head;
    // Número de elementos en la lista
    private int size;

    // Constructor: crea una lista vacía
    public ListaEnlazada() {
        this.head = null; // La lista empieza vacía
        this.size = 0; // Tamaño inicial es cero
    }

    //Getters y Setters
    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //PARA INSERTAR AL INICIO
    public void insertarAlInicio(int clave) {
        Nodo temp = new Nodo(clave); // Crea nuevo nodo
        temp.siguiente = head; // Apunta nuevo nodo al inicio actual
        head = temp; // Actualiza la cabeza de la lista
        size++;
    }

    //ALGORITMO QUE ADICIONA ELEMENTO DE ULTIMA POSICION
    public void add_tail(int key) {
        //Crea nuevo nodo
        Nodo tail = new Nodo(key);

        if (head == null) { //verifica que la lista está vacia
            head = tail;
        } 
        
        else {
            Nodo temp = head;   // Usa una referencia temporal para recorrer la lista desde la cabeza

            //Recorrer la lista hasta el último nodo
            while (temp.siguiente != null) {
                temp = temp.siguiente;
                //Apunta el último nodo al nuevo nodo
            }
            temp.siguiente = tail;

        }

        tail.siguiente = null;
        size = size + 1;
    }

}
