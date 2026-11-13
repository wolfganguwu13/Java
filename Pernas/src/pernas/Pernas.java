/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pernas;

import java.util.Scanner;

/**
 *
 * @author WolfGang
 */
public class Pernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas: ");
        int pernas = teclado.nextInt();
        String tipo;
        System.out.print("Isso e um(a) ");
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripe";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6, 8:
                tipo = "Aracnideo";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
    
}
