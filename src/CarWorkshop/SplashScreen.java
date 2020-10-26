package CarWorkshop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAM
 */
public class SplashScreen extends JWindow {
     
    private int duration;
     
    public SplashScreen(int d) {
        duration = d;
    }
     
    // A simple little method to show a title screen in the center
    // of the screen for the amount of time given in the constructor
    public void showSplash() {
         
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.white);
         
        // Set the window's bounds, centering the window
        int width = 500;
        int height =350;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
         
        // Build the splash screen
        Image splashScreen = Toolkit.getDefaultToolkit().getImage("src\\CarWorkshop\\img\\logo_app.png");
        JLabel label = new JLabel(new ImageIcon(splashScreen));
        JLabel copyrt = new JLabel
                ("Copyright 2020, The Job Coders", JLabel.CENTER);
        copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        Color oraRed = new Color(78, 78, 120);
        content.setBorder(BorderFactory.createLineBorder(oraRed, 4));
         
        // Display it
        setVisible(true);
         
        // Wait a little while, maybe while loading resources
        try { Thread.sleep(duration); } catch (Exception e) {}
         
        setVisible(false);
         
    }
     

     
 
}

