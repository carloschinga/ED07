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
        Stack<Operadores> pilaOperadores= new Stack<Operadores>();
        
        String formula="[({})]";
        String caracteresApertura="[({";
        
        
        Operadores op1= new Operadores();
        op1.setCodigo(1);
        op1.setNombre("[");
        
        Operadores op2= new Operadores();
        op2.setCodigo(2);
        op2.setNombre("(");
        
        Operadores op3= new Operadores();
        op3.setCodigo(3);
        op3.setNombre("{");
        
        pilaOperadores.push(op1);
        pilaOperadores.push(op2);
        pilaOperadores.push(op3);
        
        System.out.println(pilaOperadores.peek().getNombre());
        pilaOperadores.pop();
        System.out.println(pilaOperadores.peek().getNombre());
        pilaOperadores.pop();
        System.out.println(pilaOperadores.peek().getNombre());
        
    }
}
