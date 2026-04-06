/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Discentes
 */
public class ControladorPayscoa {
    JTextField jTextFieldQuantidade, jTextFieldValor, jTextFieldPagamento;
    JLabel jLabelTotal, jLabelTroco, jLabelRelatorio;

    public ControladorPayscoa(JTextField jTextFieldQuantidade, JTextField jTextFieldValor, JTextField jTextFieldPagamento, JLabel jLabelTotal, JLabel jLabelTroco, JLabel jLabelRelatorio) {
        this.jTextFieldQuantidade = jTextFieldQuantidade;
        this.jTextFieldValor = jTextFieldValor;
        this.jTextFieldPagamento = jTextFieldPagamento;
        this.jLabelTotal = jLabelTotal;
        this.jLabelTroco = jLabelTroco;
        this.jLabelRelatorio = jLabelRelatorio;
    }
    
    public void calcular(){
        int qtd = Integer.parseInt(jTextFieldQuantidade.getText());
        float valor = Float.parseFloat(jTextFieldValor.getText());
        float total = qtd * valor;
        jLabelTotal.setText("R$ " + total);
    }
    
}
