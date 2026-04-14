/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author Discentes
 */
public class ControladorPayscoa {
    JTextField jTextFieldQuantidade, jTextFieldValor, jTextFieldPagamento;
    JLabel jLabelTotal, jLabelTroco, jLabelRelatorio;
    JTextArea jTextAreaRelatorio;
    ArrayList<String> relatorio = new ArrayList<>();

    public ControladorPayscoa(JTextField jTextFieldQuantidade, JTextField jTextFieldValor, JTextField jTextFieldPagamento, JLabel jLabelTotal, JLabel jLabelTroco, JLabel jLabelRelatorio, JTextArea jTextAreaRelatorio) {
        this.jTextFieldQuantidade = jTextFieldQuantidade;
        this.jTextFieldValor = jTextFieldValor;
        this.jTextFieldPagamento = jTextFieldPagamento;
        this.jLabelTotal = jLabelTotal;
        this.jLabelTroco = jLabelTroco;
        this.jLabelRelatorio = jLabelRelatorio;
        this.jTextAreaRelatorio = jTextAreaRelatorio;
    }
    
    public void calcular(){
        int qtd = Integer.parseInt(jTextFieldQuantidade.getText());
        float valor = Float.parseFloat(jTextFieldValor.getText());
        float total = qtd * valor;
        jLabelTotal.setText("R$ " + total);
    }
    
    public void finalizar(){
        int qtd = Integer.parseInt(jTextFieldQuantidade.getText());
        float valor = Float.parseFloat(jTextFieldValor.getText());
        float pag = Integer.parseInt(jTextFieldPagamento.getText());
        float total = qtd * valor;
        float troco = pag - total;
        if(troco >= 0){
            jLabelTroco.setText("R$ " + troco);
            
            String compra = "Qtd: " + qtd + 
                ", Valor: R$ " + valor + 
                ", Total: R$ " + total +
                ", Troco: R$ " + troco;
            
            relatorio.add(compra);
        }
        else{
            jLabelTroco.setText("Faltam R$ " + Math.abs(troco));
            
            String compra = "Qtd: " + qtd + 
                ", Valor: R$ " + valor + 
                ", Total: R$ " + total +
                ", Troco: faltaram R$ " + Math.abs(troco);
            
            relatorio.add(compra);
        }
    }
    
    public void relatorioSaida(){
        String saida = "";
        for(String compra : relatorio){
            saida += compra + "\n";
        }
        jTextAreaRelatorio.setText(saida);
    }
}
