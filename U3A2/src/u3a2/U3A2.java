/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u3a2;

/**
 *
 * @author WolfGang
 */
public class U3A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carrinho carrinho1 = Carrinho.getInstance();
        carrinho1.adicionarItem("Teclado");
        
        Carrinho carrinho2 = Carrinho.getInstance();
        carrinho2.adicionarItem("Mouse");
        
        System.out.println("Itens no carrinho: " + carrinho1.getItens());
        System.out.println("E o mesmo carrinho? " + (carrinho1 == carrinho2));
    }
    
}

class Carrinho{
    private static Carrinho instancia;
    private String itens = "";
    
    private Carrinho(){}
    
    public static Carrinho getInstance(){
        if(instancia == null){
            instancia = new Carrinho();
            System.out.println("Instancia singleton criada...");
        }
        return instancia;
    }
    public void adicionarItem(String item){
        itens += item + " ";
    }
    
    public String getItens(){
        return itens;
    }
}
