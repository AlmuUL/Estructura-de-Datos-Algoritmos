/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_17_05;

public class Diccionario {
    
    NodoPalabra head;   //la palabra es lo que va a estar moviendose
    int size;

    public Diccionario() {
        
        head = null;
        
    }
    
    public void buscar(String palabra){
        
        NodoPalabra temp = head;
        while(temp != null){
            if(temp.original.equals(palabra)){
                System.out.println("Significado: " + temp.traduccion);
                //break;
            }
            temp = temp.siguiente;
        }
        
    }
    
    public void adicionar(String palabra1, String palabra2){
        
        
        //VERSION 1: EXTENSA
        /*
        if(head == null){   //para siempre poner primero
           NodoPalabra temp = new NodoPalabra(palabra1, palabra2); // Crea nuevo nodo
           temp.siguiente = head;
           head = temp; 
        }
        else{
            NodoPalabra temp = head;
            while(temp.siguiente != null){
                temp = temp.siguiente;
            }
            NodoPalabra temp2 = new NodoPalabra(palabra1, palabra2);
            temp.siguiente = temp2;
            temp2.siguiente = null;
        }
        */
        
        //VERSION 2: ABREVIADA
        NodoPalabra temp = new NodoPalabra(palabra1, palabra2);
        if(head == null){
            head = temp;
        }
        else{
            NodoPalabra temp2 = head;
            while(temp2.siguiente != null){
                temp2 = temp2.siguiente;
            }
            temp2.siguiente = temp;
        }
          
    }
    
    public void eliminar(String palabra){
        
        //el primer nodo se llamara temporal y es la cabeza
        NodoPalabra temp = head;
        //crear variables para hallar el que quiero eliminar
        NodoPalabra A;
        NodoPalabra B;
        while(temp.siguiente != null){  //el original es la palabra
            if(temp.siguiente.original.equals(palabra)){    //se pone asi porque 
                A = temp.siguiente; //es el nodo dsp del temporal
                B = temp.siguiente.siguiente;   //el nodo dsp del A
                temp.siguiente = B; //cambio el valor del B por el que sigue
                break;  //para que quiero que continue si ya encontro
            }
            //break no se pone xq sino no se repite
            temp = temp.siguiente;
        }
        
    }
    
    public void listar(){
        
        NodoPalabra temp = head;    //el temporal sera la cabeza
        while(temp != null){    //cuando el temporal no sea nulo
            System.out.println(temp.original + " " + temp.traduccion);  //mostrar la palabra original y su traduccion
            temp = temp.siguiente;
        }
        
    }

}
