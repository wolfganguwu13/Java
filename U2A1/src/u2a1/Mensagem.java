/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2a1;

/**
 *
 * @author WolfGang
 */
public class Mensagem implements Runnable{
    private String[] mensagens;
    
    public Mensagem(String[] mensagens){
        this.mensagens = mensagens;
    }
    
    @Override
    public void run(){
        for(int i = 0; i < mensagens.length; i++){
            System.out.println(mensagens[i]);
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                System.out.println("Mensagem interrompida...");
            }
        }            
    }
}
