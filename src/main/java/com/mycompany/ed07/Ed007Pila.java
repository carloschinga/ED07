/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ed07;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Ed007Pila {

    public static void main(String[] args) {
        String formula = "([({})]}";
        Stack<Character> pilaCaracteres = new Stack<>();
        List<Character> listaApertura = new ArrayList<>();
        List<Character> listaCierre = new ArrayList<>();
        listaApertura.add('[');
        listaApertura.add('{');
        listaApertura.add('(');
        listaCierre.add(']');
        listaCierre.add('}');
        listaCierre.add(')');
        for (int i = 0; i < formula.length(); i++) {
            Character c = formula.charAt(i);
            if (c.equals('[') || c.equals('(') || c.equals('{')) {
                pilaCaracteres.push(c);
            } else {
                Character cTemp = pilaCaracteres.peek(); //recupera el ultimo
                int indice = -1;
                for (int j = 0; j < listaApertura.size(); j++) {
                    if (listaApertura.get(j).equals(cTemp)) {
                        indice = j;
                        break;
                    }
                }
                if (indice != -1) { // si encontró
                    if (listaCierre.get(indice).equals(c)) {
                        pilaCaracteres.pop();
                    }
                }
            }
        }
        if (pilaCaracteres.size() != 0) { 
            JOptionPane.showMessageDialog(null, "No balanceado");
        } else {
            JOptionPane.showMessageDialog(null, " balanceado");
        }
    }

}
