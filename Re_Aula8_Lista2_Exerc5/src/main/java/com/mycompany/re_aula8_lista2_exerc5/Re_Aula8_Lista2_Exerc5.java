
package com.mycompany.re_aula8_lista2_exerc5;

public class Re_Aula8_Lista2_Exerc5 {

    public static void main(String[] args) {
        //Imprimir os mĂșltiplos de 7 menores que 200.
        
        int num = 7 , cont =1 , res;
        
        do{
            res = num * cont;
            cont++;
            System.out.println(res);
            
        }while (res< 190);
    }
}
