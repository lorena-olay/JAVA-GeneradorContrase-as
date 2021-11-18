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

    //metodo que comprueba que la suma de los 2 numeros sea impar
    public static boolean numeroImpar(int n1, int n4) {
        int suma = n1 + n4;
        int resto = suma % 2;
        boolean impar = resto == 0;
        return impar;
    }

    //método que comprueba que se compruebe q la multiplicacion de los 2 numeros es par
    public static boolean numeroPar(int n2, int n3) {
        int multiplicacion = n2 * n3;
        int resultado = multiplicacion % 2;
        boolean par = resultado != 0;
        return par;
    }

    //método que hace que salga una letra aleatoria del string metido
    public static char letraAleatoria() {
        Random random = new Random();
        String letra = "FGHIJKLMNÑOPQRSTUVWX";
        int randomInt = random.nextInt(letra.length());
        char randomChar = letra.charAt(randomInt);
        return randomChar;
    }

    //método que comprueba q los 4 numeros metidos sean diferentes entre ellos
    public static boolean numerosDiferentes(int n1, int n2, int n3, int n4) {
        boolean okay = false;
        if (!(n1 != n2 && n1 != n3 && n1 != n4
                && n2 != n3 && n2 != n4
                && n3 != n4)) {
            okay = true;
        }

        return okay;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables declaradas e incializadas
        int n1, n2, n3, n4, p1 = 0, p2 = 0, p3 = 0, p4 = 0;
        Random numAleatorio = new Random();
        char letra = letraAleatoria();
        // TODO code application logic here
        //bucle de generar numeros y mostrarlos en pantalla y que cumpla las condiciones
        do {
            n1 = numAleatorio.nextInt(10);
            n2 = numAleatorio.nextInt(10);
            n3 = numAleatorio.nextInt(10);
            n4 = numAleatorio.nextInt(10);
            System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + letra);
        } while ((numeroPar(p2, p3) || numeroImpar(p1, p4)) && numerosDiferentes(n1, n2, n3, n4));
        System.out.println("LA ÚLTIMA CONTRASEÑA ES VÁLIDA");
    }

}
