/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anonascimento;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author WolfGang
 */
public class AnoNascimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Em que ano voce nasceu ? ");
        int ano = teclado.nextInt();
        int atual = LocalDate.now().getYear();
        int result = atual - ano;
        if(result >= 18){
            System.out.println("Voce e de maior");
        }else{
            System.out.println("Voce e de menor");
        }
    }
    
}
