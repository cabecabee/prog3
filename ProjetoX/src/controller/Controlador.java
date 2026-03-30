/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Discentes
 */
public class Controlador {
    JButton jButton1;
    JButton jButton2;
    JButton jButton3;
    JButton jButton4;
    JButton jButton5;
    
    JLabel jLabel1, jLabel2, jLabel3, jLabel4;

    public Controlador(JButton jButton1, JButton jButton2, JButton jButton3, JButton jButton4, JButton jButton5, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4) {
        this.jButton1 = jButton1;
        this.jButton2 = jButton2;
        this.jButton3 = jButton3;
        this.jButton4 = jButton4;
        this.jButton5 = jButton5;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
    }
    
    public void actionFeminicidio(){
        jLabel1.setText("<html> <div style = 'width:350px;'>"+
                "Feminicídio é pipipipopo");
        jLabel2.setText("<html> <div style = 'width:350px;'>"+
                "blablablabla");
        jLabel3.setText("<html> <div style = 'width:350px;'>"+
                "tercero paragrafo");
        jLabel4.setText("<html> <div style = 'width:350px;'>"+
                "isso ai");
    }
}
