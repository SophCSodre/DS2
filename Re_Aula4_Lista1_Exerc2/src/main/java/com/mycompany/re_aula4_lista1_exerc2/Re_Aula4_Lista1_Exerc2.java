
package com.mycompany.re_aula4_lista1_exerc2;

import java.util.Scanner;

public class Re_Aula4_Lista1_Exerc2 {

    public static void main(String[] args) {
        //Crie uma classe que solicite via teclado , um determinado valor em reais e como resultado mostre
        //10%  de (valor) é (resultado)
        
        Scanner grava = new Scanner(System.in);
        
        double valor = 0;
        double res = 0;
        
        System.out.println("Digite o valor desejado:");
        valor = grava.nextDouble();
        
        res = valor * 0.10;
        
        System.out.println("10% de " + valor + " é: " + res);
    }
}
