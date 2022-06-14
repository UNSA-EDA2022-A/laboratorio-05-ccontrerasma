package com.example.project;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.esBalanceado(s));
        }
    }

    public boolean esBalanceado(String s) {
    	 MyStack<Character> stack = new LinkedListStack<>();
    	  if (s == null) {
             return true;
         }
    	  if((s.length()%2)!=0) {//Si es impar no hay necesidad de verificar si tien su pareja
     		 return false;
     	 }
         else {//Si es par s.length
             for (int i = 0; i < s.length(); i++) {
            	 //Si el primero fuera cerrado ya no continua por que de por si ya es false
            	 if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            		 return false;
            	 }
                 if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {// si empieza en abierto
                     stack.push(s.charAt(i));
                 } 
//                 Si es que el siguiente es cerrado
                 else {
                    if (s.charAt(i) == ')') {
                    	//al hacer el pop verifo si su pareja sale si no es asi ya es false
                         if (stack.pop() != '(') {
                             return false;
                         }
                     } 
                    else {
                         if (s.charAt(i) == ']') {
                             if (stack.pop() != '[') {
                                 return false;
                             }
                         } 
                         else {
                             if (s.charAt(i) == '}') {
                                 if (stack.pop() != '{') {
                                     return false;
                                 }
                             }
                         }
                     }
                 }
             }
         }
    	  // retornara true cuando se haya eliminado todo
    	  // de lo contrario sera false
         return stack.size() == 0;
    }
}
