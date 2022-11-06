/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade_tpi7;
import javax.swing.JOptionPane;
/**
 *
 * @author Nilton
 */
public class Atividade_TPI7 {

 public static void main(String[] args) {
 int escolha;
 conta patinhas = new conta();
 patinhas.taxa(1.56);
 
        while(true)
    {
        String escolh=JOptionPane.showInputDialog("digite:\n 1- para  visualizar o saldo.\n 2- para depositar dinheiro.\n 3- para sacar.\n");    
        escolha = Integer. parseInt(escolh);        

            switch (escolha) {
                case 1:JOptionPane.showMessageDialog(null,"seu saldo é:"+patinhas.getsaldo());break;
                case 2:
                    String deposito=JOptionPane.showInputDialog("quanto você gostaria de depositar?");
                    double depositado = Double.parseDouble(deposito);
                    JOptionPane.showMessageDialog(null,patinhas.deposita(depositado));
                break;
                case 3:
                    String sac=JOptionPane.showInputDialog("quanto você gostaria de sacar?");
                    double saci = Double.parseDouble(sac);
                    JOptionPane.showMessageDialog(null,patinhas.saca(saci));
                break;

                default:
                    JOptionPane.showMessageDialog(null,"por favor digite uma das 3 opções!");

            }
    }
 }
}