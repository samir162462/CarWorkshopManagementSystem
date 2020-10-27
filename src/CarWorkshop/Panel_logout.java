/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarWorkshop;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SAM
 */
public class Panel_logout extends WindowAdapter {

    JFrame f;

    Panel_logout(JFrame f) {
        this.f = f;
        f.addWindowListener(this);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(f, "Are you sure you want to logout?");
        if (a == JOptionPane.YES_OPTION) {
            GUI_login g = new GUI_login();
            g.setVisible(true);
        }
    }
}
