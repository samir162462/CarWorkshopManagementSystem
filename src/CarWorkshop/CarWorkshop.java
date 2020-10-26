/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarWorkshop;

/**
 *
 * @author SAM
 */
public class CarWorkshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // intro
        SplashScreen splash = new SplashScreen(2000);
        splash.showSplash();
        //login
        
    
        
        //app
        GUI_Main g = new GUI_Main();
        g.setVisible(true);
    }
    
}
