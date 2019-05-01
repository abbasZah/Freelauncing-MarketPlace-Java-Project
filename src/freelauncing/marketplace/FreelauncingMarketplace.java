/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freelauncing.marketplace;

import javax.swing.JFrame;
import java.lang.*;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author Abbas Zaheer
 */
public class FreelauncingMarketplace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //For CursorBlinking
        UIManager.put("TextField.caretForeground",new ColorUIResource(818183));
        
        SignIn signIn = new SignIn(); 
        signIn.setVisible(true); 
        signIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signIn.setResizable(false);
        signIn.setLocation(250, 100);
        signIn.setTitle("Freelaunce Service Marketplace");
        
        
    }
    
}
