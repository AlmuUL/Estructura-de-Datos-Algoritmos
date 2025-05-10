/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej04;

import java.util.*;

public class Ejercicio_04 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamaño = 0;

        while (true) {
            System.out.print("Ingrese el tamano del arreglo: ");
            if (scanner.hasNextInt()) {
                tamaño = scanner.nextInt();
                if (tamaño > 0) break;
                else System.out.println("Debe ser mayor que 0");
            } else {
                System.out.println("Debe ingresar un numero");
                scanner.next();
            }
        }

        char[] arreglo = new char[tamaño];
        scanner.nextLine(); // limpiar buffer

        for (int i = 0; i < tamaño; i++) {
            while (true) {
                System.out.print("Ingrese el caracter " + (i + 1) + ": ");
                String input = scanner.nextLine();
                if (input.length() == 1) {
                    arreglo[i] = input.charAt(0);
                    break;
                } else {
                    System.out.println("Debe ingresar solo un caracter.");
                }
            }
        }

        contarFrecuencia(arreglo);
        scanner.close();
    }
    
        public static void contarFrecuencia(char[] arreglo) {
            
            LinkedHashMap<Character, Integer> frecuencia = new LinkedHashMap<>();

        for (int i = 0; i < arreglo.length; i++) {
            char c = arreglo[i];
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
        }

        System.out.println("Frecuencia de caracteres:");
        for (Map.Entry<Character, Integer> entrada : frecuencia.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
        
}
