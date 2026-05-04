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
import model.Projeto;

/**
 *
 * @author Discentes
 */
public class ControladorProjeto {
    JTextField jTextFieldId;
    JTextField jTextFieldNome;
    JTextField jTextFieldCpf;
    JTextField jTextFieldTelefone;
    JList<String> jListProjeto;
    ArrayList<Projeto> projetos = new ArrayList<>();
    DefaultListModel defaultListModel = new DefaultListModel();

    public ControladorProjeto(JTextField jTextFieldId, JTextField jTextFieldNome, JTextField jTextFieldCpf, JTextField jTextFieldTelefone, JList<String> jListProjeto) {
        this.jTextFieldId = jTextFieldId;
        this.jTextFieldNome = jTextFieldNome;
        this.jTextFieldCpf = jTextFieldCpf;
        this.jTextFieldTelefone = jTextFieldTelefone;
        this.jListProjeto = jListProjeto;
    }
    public void salvar(){
        int id = Integer.parseInt(jTextFieldId.getText());
        String nome = jTextFieldNome.getText();
        String cpf = jTextFieldCpf.getText();
        String telefone = jTextFieldTelefone.getText();
        Projeto p = new Projeto(id, nome, cpf, telefone);
        projetos.add(p);
    }
    public void CarregarLista(){
        defaultListModel = new DefaultListModel();
        ArrayList<String> listaAtualizada = new ArrayList<>();
        for (Projeto p1 : projetos) {
            listaAtualizada.add(p1.getNome());
        }
        Collections.sort(listaAtualizada);
        defaultListModel.addAll(listaAtualizada);
        jListProjeto.setModel(defaultListModel);
    }
}
