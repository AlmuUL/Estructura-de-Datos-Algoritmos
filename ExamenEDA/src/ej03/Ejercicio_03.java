/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej03;

import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // TAMAÑO DEL ARREGLO
        int tamaño = 0;
        while (true) {
            System.out.print("Ingrese el tamano del arreglo: ");
            if (sc.hasNextInt()) {  //solo aceptar enteros
                tamaño = sc.nextInt();  //almacenar
                if (tamaño > 0) {   //verificar que el tamaño del arreglo sea mayor a 0
                    break;
                } else {    //de lo contrario avisar que el numero no puede ser negativo ni 0
                    System.out.println("El tamaño debe ser mayor que 0");
                }
            } else {    //de lo contrario solicitar de nuevo
                System.out.println("Por favor, ingrese un número entero valido");
                sc.next(); // limpiar entrada inválida
            }
        }

        
        // PEDIR CADA NUMERO PARA EL ARREGLO
        int[] arreglo = new int[tamaño];    //definiendo el arreglo
        for (int i = 0; i < tamaño; i++) {  //recorrer el arreglo
            while (true) {  //para solicitar
                System.out.print("Ingrese el numero " + (i + 1) + ": ");
                if (sc.hasNextInt()) {  //validar que sea entero
                    arreglo[i] = sc.nextInt();  //almacenar numero
                    break;
                } else {    //es un numero invalido
                    System.out.println("Entrada inválida. Ingrese un numero entero: ");
                    sc.next(); // limpiar entrada inválida
                }
            }
        }

        int resultado = calcularDiferencia(arreglo);    //llamar al metodo
        System.out.println("La diferencia entre la suma de pares e impares es: " + resultado);  //imprimirlo

        sc.close();
    }
    
    //METODO PARA CALCULAR LA DIFERENCIA (PARES - IMPARES)
    public static int calcularDiferencia(int[] numeros) {
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {  //si es par
                sumaPares += numeros[i];    //sumar pares y almacenar nuevo valor
            } else {    //si no es par
                sumaImpares += numeros[i];  //sumar impares y almacenar nuevo valor
            }
        }

        return sumaPares - sumaImpares; //lo que se mostrara cuando se llame al metodo
    }
 
}