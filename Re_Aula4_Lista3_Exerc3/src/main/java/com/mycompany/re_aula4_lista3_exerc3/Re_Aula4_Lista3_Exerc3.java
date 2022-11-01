
package com.mycompany.re_aula4_lista3_exerc3;

import java.util.Scanner;

public class Re_Aula4_Lista3_Exerc3 {

    public static void main(String[] args) {
        //Crie uma classe chamada Informação e faça a seguinte operação :
        //Solicite o nome do usuário , peça a sua idade e forneça a seguinte informação :
        //Quantos dias ela viveu.
        //Quantas horas ela viveu.
        Scanner grava = new Scanner(System.in);
        
        String nome = "";
        int idade = 0;
        double dia = 0, hr = 0;
        
        System.out.println("Digite seu nome e idade:");
        nome = grava.next();
        idade = grava.nextInt();
        
        dia = idade * 365;
        hr = idade * 24;
        
        System.out.println("Você viveu " + dia + " dias e " + hr + " horas.");
    }
}
