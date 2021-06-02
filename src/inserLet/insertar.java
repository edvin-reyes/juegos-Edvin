/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inserLet;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Usuario
 */
public class insertar {

    private String botones;
    private String botones1;
    private String botones2;
    private String botones3;
    private String botones4;

    public insertar(String botones, String botones1, String botones2, String botones3, String botones4) {
        this.botones = botones;
        this.botones1 = botones1;
        this.botones2 = botones2;
        this.botones3 = botones3;
        this.botones4 = botones4;
    }

    public String[] getAll() {
        String[] all = {botones, botones1, botones2, botones3, botones4};
        return all;
    }

    public void escritor(JLabel num, Component[] alter) {
        String[] all = {botones, botones1, botones2, botones3, botones4};
        num.setText(all[0]);
        for (int i = 0; i < 4; i++) {
            if (alter[i].getClass() == JLabel.class) {
                JLabel alterna = (JLabel) alter[i];
                alterna.setText(all[i + 1]);
            } else {
                System.err.println("alguna componente no es JButton");
            }
        }

    }
 
 
}
