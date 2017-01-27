/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylistfutbol;

import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Xogador {
    private String nome;
    private int dorsal;
    
    public String pedirNome(){
        nome = JOptionPane.showInputDialog("Indica el nombre");
        return nome;
    }
    
    public int pedirDorsal(){
        dorsal= Integer.parseInt(JOptionPane.showInputDialog("Indica el dorsal"));
        return dorsal;
    }
}
