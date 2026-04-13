/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import view.Tela1;
import view.Tela2;
import view.Tela3;

/**
 *
 * @author Discentes
 */
public class ControladorTelas {
    JDesktopPane jDesktopPane;

    public ControladorTelas(JDesktopPane jDesktopPane) {
        this.jDesktopPane = jDesktopPane;
    }
    
    public void carregarTela1(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        Dimension resolucao = jDesktopPane.getSize();
        Tela1 tela1 = new Tela1();
        tela1.setSize(resolucao);
        tela1.setLocation(0, 0);
        jDesktopPane.add(tela1);
        jDesktopPane.setVisible(true);
    }
    
    public void carregarTela2(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        Dimension resolucao = jDesktopPane.getSize();
        Tela2 tela2 = new Tela2();
        tela2.setSize(resolucao);
        tela2.setLocation(0, 0);
        jDesktopPane.add(tela2);
        jDesktopPane.setVisible(true);
    }
    
    public void carregarTela3(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        Dimension resolucao = jDesktopPane.getSize();
        Tela3 tela3 = new Tela3();
        tela3.setSize(resolucao);
        tela3.setLocation(0, 0);
        jDesktopPane.add(tela3);
        jDesktopPane.setVisible(true);
    }    
    
}
