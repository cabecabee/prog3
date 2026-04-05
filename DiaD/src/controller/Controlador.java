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
                "Feminicídio é o homicídio contra a mulher por razões da condição de sexo feminino (Lei 13104 de 2015)");
        jLabel2.setText("<html> <div style = 'width:350px;'>"+
                "Considera-se que há razões de condição de sexo feminino quando o crime envolve:");
        jLabel3.setText("<html> <div style = 'width:350px;'>"+
                "I - violência doméstica e familiar;");
        jLabel4.setText("<html> <div style = 'width:350px;'>"+
                "II - menosprezo ou discriminação à condição de mulher.");
    }
    public void actionViolenciaDomestica(){
        jLabel1.setText("<html> <div style = 'width:350px;'>"+
                "De acordo com o artigo 5o da Lei Maria da Penha (Lei nº 11.340/2006),");
        jLabel2.setText("<html> <div style = 'width:350px;'>"+
                "Violência doméstica e familiar contra a mulher é");
        jLabel3.setText("<html> <div style = 'width:350px;'>"+
                "“qualquer ação ou omissão baseada no gênero que lhe cause morte, lesão,");
        jLabel4.setText("<html> <div style = 'width:350px;'>"+
                "sofrimento físico, sexual ou psicológico e dano moral ou patrimonial”.");
    }
    public void actionCulturaMachismo(){
        jLabel1.setText("<html> <div style = 'width:350px;'>"+
                "A cultura do machismo consiste em valores que colocam o homem em posição de superioridade.");
        jLabel2.setText("<html> <div style = 'width:350px;'>"+
                "Naturaliza comportamentos de controle e violência contra mulheres.");
        jLabel3.setText("<html> <div style = 'width:350px;'>"+
                "Está presente em atitudes, linguagem e até estruturas sociais.");
        jLabel4.setText("<html> <div style = 'width:350px;'>"+
                "Contribui diretamente para a perpetuação da violência de gênero.");
    }
    public void actionDesigualdadeGenero(){
        jLabel1.setText("<html> <div style = 'width:400px;'>"+
                "Desigualdade de gênero refere-se, normalmente, às diferenças de direitos e oportunidades entre homens e mulheres.");
        jLabel2.setText("<html> <div style = 'width:350px;'>"+
                "Esta pode ser observada no mercado de trabalho, na política e na vida social.");
        jLabel3.setText("<html> <div style = 'width:350px;'>"+
                "É uma das bases estruturais da violência contra a mulher.");
        jLabel4.setText("<html> <div style = 'width:350px;'>"+
                "Limita a autonomia e vida da mulher.");
    }
    public void actionPoliticasPublicas(){
        jLabel1.setText("<html> <div style = 'width:350px;'>"+
                "Políticas públicas são ações do Estado para prevenir e combater a violência contra mulheres.");
        jLabel2.setText("<html> <div style = 'width:350px;'>"+
                "Incluem leis, delegacias especializadas e campanhas de conscientização.");
        jLabel3.setText("<html> <div style = 'width:400px;'>"+
                "Entre estas está, por exemplo, o PL 3880/2024, de Laura Carneiro, Maria do Rosário e Fernanda Melchionna.");
        jLabel4.setText("<html> <div style = 'width:450px;'>"+
                "Esse PL altera a Lei nº 11.340 (Lei Maria da Penha), para incluir a violência vicária dentre as definições de violência doméstica e familiar.");
    }
}
