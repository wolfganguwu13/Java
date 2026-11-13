
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        int larg = (int) size.getWidth();
        int alt = (int) size.getHeight();
        
        System.out.println("Dimensoes: " + larg + " X " + alt);
    }
    
}
