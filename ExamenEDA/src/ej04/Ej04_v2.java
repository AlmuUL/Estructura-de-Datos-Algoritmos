/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej04;

import java.util.Scanner;

public class Ej04_v2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int tamaño = 0;

        // Repetir mientras el tamaño no sea válido
        while(true){
            System.out.print("Ingrese el tamano del arreglo: ");
    
            if(sc.hasNextInt()){
                tamaño = sc.nextInt();
                if (tamaño > 0){
                    break; // tamaño válido, salimos del while
                } 
                else{
                    System.out.println("El tamano debe ser mayor que 0");
                }
            } 
            else{
                System.out.println("Debe ingresar un numero entero");
                sc.next(); // limpiar entrada no válida
            }       
        }
        
        System.out.println("\n");
        
        char[] arreglo = new char[tamaño];  //crear arreglo
        for(int i = 0; i < tamaño;){ // NOTA: el incremento está dentro del if
            System.out.print("Ingrese el caracter " + (i + 1) + ": ");
            String cantidad = sc.nextLine();    //almacenar

            if(cantidad.length() == 1){   //verificar que solo hay un caracter y no mas
                arreglo[i] = cantidad.charAt(0);
                i++; // solo avanzamos si está correcto y se incrementa
            } 
            else{
                System.out.println("Debe ingresar solo un caracter");   //solicitar de nuevo
                // no aumentamos i → se vuelve a pedir el mismo
            }
        }

        contarFrecuenciaSimple(arreglo);    //llamar al metodo
        sc.close();
    }

    public static void contarFrecuenciaSimple(char[] arreglo) {
        char[] unicos = new char[arreglo.length];   //arreglo para cada letra
        int[] conteos = new int[arreglo.length];    //arreglo para conteos
        int cantidad = 0;

        for(int i = 0; i < arreglo.length; i++){    //recorrer arreglo
            char actual = arreglo[i];   //actual es el carácter en el que estamos
            boolean yaExiste = false; // saber si ese carácter ya fue contado antes

            for(int j = 0; j < cantidad; j++){  //recorre los caracteres únicos que ya hemos guardado
                if (unicos[j] == actual) {  //si encuentra que el carácter actual ya está en el arreglo unicos[]
                    conteos[j]++;   //incrementar en +1 el conteo
                    yaExiste = true;    
                    break;  //salir del for
                }
            }

            if(!yaExiste){  //si el caracter no existia antes
                unicos[cantidad] = actual; //agregar al arreglo unicos[] en la posición cantidad
                conteos[cantidad] = 1;  //iniciar conteo en 1
                cantidad++; //incrementa la cantidad de caracteres enccontrados
            }
        }
        
        System.out.println("\n");
        
        System.out.println("Frecuencia de caracteres: ");   //mostrar
        for (int i = 0; i < cantidad; i++) {    //recorrer el arreglo unicos[], que contiene todos los caracteres diferentes que encontró el programa - solo llega hasta cantidad, que es el número total de caracteres únicos que se guardaron
            System.out.println(unicos[i] + ": " + conteos[i]);  //
        }
    }
        
}
