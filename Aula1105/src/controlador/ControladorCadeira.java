/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;
import modelo.Cadeira;

/**
 *
 * @author Discentes
 */
public class ControladorCadeira {
    JTextField jTextFieldId, jTextFieldCpf, jTextFieldTelefone, jTextFieldNome;
    JList<String> jListCadeira;
    
    ArrayList<Cadeira> listaDeCadeira = new ArrayList<>();
    
    DefaultListModel defaultListModel = new DefaultListModel();

    public ControladorCadeira(JTextField jTextFieldId, JTextField jTextFieldCpf, JTextField jTextFieldTelefone, JTextField jTextFieldNome, JList<String> jListCadeira) {
        this.jTextFieldId = jTextFieldId;
        this.jTextFieldCpf = jTextFieldCpf;
        this.jTextFieldTelefone = jTextFieldTelefone;
        this.jTextFieldNome = jTextFieldNome;
        this.jListCadeira = jListCadeira;
    }
    
    public void salvar(){
        int id = Integer.parseInt(jTextFieldId.getText());
        String cpf = jTextFieldCpf.getText();
        String telefone = jTextFieldTelefone.getText();
        String nome = jTextFieldNome.getText();
        
        Cadeira cadeira = new Cadeira(id, cpf, telefone, nome);
        listaDeCadeira.add(cadeira);
        carregarJList();
        limpar();
    }
    
    public void carregarJList(){
        defaultListModel = new DefaultListModel();
        ArrayList<String> t = new ArrayList<>();
        for(Cadeira cadeiraT : listaDeCadeira){
            t.add(cadeiraT.getNome() + " - " + cadeiraT.getId());
        }
        Collections.sort(t);
        defaultListModel.addAll(t);
        jListCadeira.setModel(defaultListModel);
    }
    
    public void limpar(){
        jTextFieldId.setText("");
        jTextFieldNome.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldCpf.setText("");
    }
}
