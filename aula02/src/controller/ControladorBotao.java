package controller;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Discentes
 */
public class ControladorBotao {
    JButton jButtonHoffmann;
    JLabel jLabelSaida;
    int contador = 0;

    public ControladorBotao(JButton jButtonHoffmann, JLabel jLabelSaida) {
        this.jButtonHoffmann = jButtonHoffmann;
        this.jLabelSaida = jLabelSaida;
    }
    
    public void apertaMe(){
        jLabelSaida.setText(contador + "");
        if(contador % 2 == 0){
            jButtonHoffmann.setBackground(Color.CYAN);
        }
        else jButtonHoffmann.setBackground(Color.BLUE);
        contador++; // DALHE GREMIO
    }
}
