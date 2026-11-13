/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2a1;

/**
 *
 * @author WolfGang
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] mensagens = {
            "Sistema iniciado!!!",
            "Processando dados...",
            "Sistema online!!!",
            "Aguarde...",
            "Processo concluido."
        };
        
        Contador tarefaContador = new Contador();
        Mensagem tarefaMensagem = new Mensagem(mensagens);
        
        Thread threadNumeros = new Thread(tarefaContador);
        Thread threadMensagens = new Thread(tarefaMensagem);
        
        threadNumeros.start();
        threadMensagens.start();
    }
    
}
