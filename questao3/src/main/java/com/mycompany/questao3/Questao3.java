/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questao3;
import javax.swing.JOptionPane;
/**
 *
 * @author labs
 */
public class Questao3 {

    public static void main(String[] args) {
int di,me,an;
        
     
String dia=JOptionPane.showInputDialog("Que dia é esse?");
String mes=JOptionPane.showInputDialog("Que mês é esse?");   
String ano=JOptionPane.showInputDialog("Que ano é esse?");
di = Integer. parseInt(dia);
me = Integer. parseInt(mes);        
an = Integer. parseInt(ano);        
        
pessoa newton = new pessoa();
newton.ajustaDataDeNascimento(4,1,1643);
newton.calculaIdade(di, me, an);

pessoa einstein = new pessoa();
einstein.ajustaDataDeNascimento(14,3,1879);
einstein.calculaIdade(di, me, an);

JOptionPane.showMessageDialog(null,newton.informaNome()+" tem as idades, respectivamente, "+newton.informaIdade()+ " e " + einstein.informaIdade());
}}

    

