/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.generadorcontrasenas;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author lorena
 */
public class CONTRASEÑAS {

    public static boolean numeroImpar(int n1, int n4) {
        int suma = n1 + n4;
        int resto = suma % 2;
        boolean impar = resto == 0;
        return impar;
    }

    public static boolean numeroPar(int n2, int n3) {
        int multiplicacion = n2 * n3;
        int resultado = multiplicacion % 2;
        boolean par = resultado != 0;
        return par;
    }

    public static char letraAleatoria() {
        Random random = new Random();
        String letra = "FGHIJKLMNÑOPQRSTUVWX";
        int randomInt = random.nextInt(letra.length());
        char randomChar = letra.charAt(randomInt);
        return randomChar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        Random numAleatorio = new Random();
        char letra = letraAleatoria();
        // TODO code application logic here
        do {
            n1 = numAleatorio.nextInt(10);
            n2 = numAleatorio.nextInt(10);
            n3 = numAleatorio.nextInt(10);
            n4 = numAleatorio.nextInt(10);
            System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + letra);

        } while (!(numeroPar(n2, n3) || numeroImpar(n1, n4) 
                || n1 != n2 || n1 != n3 || n1 != n4
                || n2 != n1 ||  n2 != n3 ||  n2 != n4
                || n3 != n1 || n3 != n2 || n3 != n4
                || n4 != n1 || n4 != n2 || n4 != n3));
        System.out.println("LA ÚLTIMA CONTRASEÑA ES VÁLIDA");
    }

}
