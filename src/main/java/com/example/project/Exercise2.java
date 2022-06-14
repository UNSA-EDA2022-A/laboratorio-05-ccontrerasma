package com.example.project;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.existenDuplicados(s));
        }
    }

    public boolean existenDuplicados(String str) {
    	 MyStack<Character> stack = new LinkedListStack<>(); 
         for (int i = 0; i < str.length(); i++) {
        	
        	 //Solo se verificara cuando haya un cierre
             if (str.charAt(i) == ')') {
                 char ultimo = stack.pop();
                 int cont = 0;
                 //Si no es abierto el contador aumentara y los borrara
                 while (ultimo!='(') {
                     cont++;
                     ultimo = stack.pop();
                 }
                 //Cuando el contador sea 0, significa que entre dos paresentesis hay uno de rreleno
                 if (cont < 1) {
                     return true;
                 }
             }
             //De lo contario solo los guardara en la pila
             else {
                 stack.push(str.charAt(i));
             }
         }

         return false;
    }
}
