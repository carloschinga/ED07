/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ed07;

import dto.Operadores;
import java.util.Stack;

/**
 *
 * @author USER
 */
public class ED07 {

    public static void main(String[] args) {
        String formula="[({})]";
        String caracteresApertura="[({";
        
        Stack<Character> pilaCaracteres = new Stack<>();
        
        for (int i = 0; i < formula.length(); i++) {
            Character c = formula.charAt(i);
            if (c.equals("[") || c.equals("(") || c.equals("{")) {
                pilaCaracteres.push(c);
            }
        }
        for (int i = 0; i < 10; i++) {
            Character  complemento = 'a';
            switch (pilaCaracteres.pop()) {
                case '{': complemento = '}';
                case '[': complemento = ']';
                case '(': complemento = ')';
                default: System.out.println("no hay");
            }
//            Character c = formula.charAt(i);
//            if (c.equals(complemento)) {
//                pilaCaracteres.pop();
//            }
            System.out.println(complemento);
        }
    }
}
