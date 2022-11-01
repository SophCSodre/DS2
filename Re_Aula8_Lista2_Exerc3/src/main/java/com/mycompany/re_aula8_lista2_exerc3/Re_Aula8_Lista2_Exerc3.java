

package com.mycompany.re_aula8_lista2_exerc3;

public class Re_Aula8_Lista2_Exerc3 {

    public static void main(String[] args) {
        //Imprima todos os múltiplos de 3, entre 1 e 100;
        
        int num = 3 , cont =1 , res;
        
        do{
            res = num * cont;
            cont++;
            System.out.println(res);
            
        }while (res<100);
    }
}
