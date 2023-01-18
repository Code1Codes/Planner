/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author KavitaS
 */
public class CalenarCell extends JButton{
    
    private Date date;
    private boolean title;
    public CalenarCell(){
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);
    }
    public void asTitle(){
        title = true;
    }
    public boolean isTitle(){
        return title;
    }
    public void currentMonth(boolean act){
        if (act){
              setForeground(new Color(226,135,67));
            
        }
        else {
            setForeground(new Color(135,62,35));

        }
    }
        
            
            
}
