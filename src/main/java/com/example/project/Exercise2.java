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
    	 if(str == null) {//Si es vacio sera false, por que teoricamente no habria duplicados
         	return false;
         }
    	 //	el for es para pasar char por char
         for (int i = 0; i < str.length(); i++) {
        	 //Cuando sea a diferente a cierra se guardara 
        	 if(str.charAt(i) != ')') {
                 stack.push(str.charAt(i));
             }
        	 else {//Cuando sea cierre
        		 if (stack.top() == '(') {//Cuando encuentre '(' retornara true
        			 return true;
        			 }
        		 else {//Si no es asi, eliminara hasta que que encuentre un '('
        			  while (stack.top()!='(') {
        				  stack.pop();
        				  }
        			  //Luego de eliminar a los numeros, eliminara a '(' por que este es el que le corresonde al ')'
        			  stack.pop();	
        			  //Despues de esto si encuentra otro '(' significa que hay duplicado y entrara al if
        			  }
        			
        		 }
        	 }
        	 

         return false;
    }
}
