/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2a1;

/**
 *
 * @author WolfGang
 */
public class Contador implements Runnable{
    
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Contador finalizado... ");
            }    
        }
    }
    
}
