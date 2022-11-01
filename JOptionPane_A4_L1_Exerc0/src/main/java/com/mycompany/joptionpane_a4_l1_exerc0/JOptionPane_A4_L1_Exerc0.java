
package com.mycompany.joptionpane_a4_l1_exerc0;

import javax.swing.JOptionPane;

public class JOptionPane_A4_L1_Exerc0 {

    public static void main(String[] args) {
        //1- Crie uma Classe com o nome Teste1 que solicite ao usuário o nome
        //as notas de primeiro segundo e terceiro bimestre e de como resultado a seguinte informação :
        //O Aluno (nome) teve como média a nota (média)
        
        //2- Crie uma classe que solicite via teclado,
        //um determinado valor em reais e como resultado mostre 10%  de (valor) é (resultado)
        
        //3- Crie 3 variaveis do tipo String , solicite as informções via teclado e como resultado concactene as 3
        
        //4- Solicite via teclado 2 valores e de como resultado : 
        //(A)+(b)= (C)
        //(A)*(b)=(c)
        //(A)/(b)= (c)
        //(A)-(b)= (c)

        //5- Solicite via teclado um valor de 1 a 9 e mostre na tela a tabuada referente ao valor.
        //Exemplo: Digite a tabuada solicitada 5
        //5 x 1 = 5
        //5 x 2 = 10...
        //5 x 10 = 50
        
         int op = 0;
        do {
            String x = JOptionPane.showInputDialog(null, "Exercícios:\n 1- Média\n 2- 10%\n 3- Juntar Palavras\n 4- Contas Matemáticas\n 5- Tabuada\n 6- Sair");
            op = Integer.parseInt(x);
            
            if (op == 1){
                double media = 0;
                
                String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno:");
                
                String val = JOptionPane.showInputDialog(null, "Digite a nota do primeiro bimestre");
                int n1 = Integer.parseInt(val);
                
                val = JOptionPane.showInputDialog(null, "Digite a nota do segundo bimestre");
                int n2 = Integer.parseInt(val);
                
                val = JOptionPane.showInputDialog(null, "Digite a nota do terceiro bimestre");
                int n3 = Integer.parseInt(val);
                
                media = (n1 + n2 + n3) /3;
                
                JOptionPane.showMessageDialog(null, "A média de " + nome + " é de: " + media);
                
            }else if (op == 2){
                double v1 = 0.0;
                double v2 = 0.0;
                
                String res = JOptionPane.showInputDialog(null, "Digite um valor:");
                v1 = Integer.parseInt(res);
                
                v2 = v1*0.10;
                
                JOptionPane.showMessageDialog(null, "10% de " + v1 + "é: " + v2);
                
            }else if (op == 3){
                String p1 = JOptionPane.showInputDialog(null, "Digite uma palavra:");
                String p2 = JOptionPane.showInputDialog(null, "Digite outr palavra:");
                String p3 = JOptionPane.showInputDialog(null, "Digite mais uma palavra:");
                
                JOptionPane.showMessageDialog(null, p1 + " " + p2 + " " + p3);
                
            }else if (op == 4){
                String val = JOptionPane.showInputDialog(null, "Digite um valor:");
                int n1 = Integer.parseInt(val);
                
                val = JOptionPane.showInputDialog(null, "Digite outro valor:");
                int n2 = Integer.parseInt(val);
                
                JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + (n1+n2) +
                "\n" + n1 + " * " + n2 + " = " + (n1*n2) +
                "\n" + n1 + " % " + n2 + " = " + (n1/n2) +
                "\n" + n1 + " - " + n2 + " = " + (n1-n2));
                
            }else if (op == 5){
                int b1, b2, b3, b4, b5, b6, b7, b8, b9, b10 = 0;
        
                String val = JOptionPane.showInputDialog(null, "Digite um valor de 1 a 9: ");
                int a = Integer.parseInt(val);
        
                b1 = a*1;
                b2 = a*2;
                b3 = a*3;
                b4 = a*4;
                b5 = a*5;
                b6 = a*6;
                b7 = a*7;
                b8 = a*8;
                b9 = a*9;
                b10 = a*10;
        
                JOptionPane.showMessageDialog(null, a + " * 1 = " + b1 + "\n" + a + " * 2 = " + b2 + "\n" + a + " * 3 = " + b3 + "\n" + a + " * 4 = " + b4 + "\n" + a + " * 5 = " + b5 + "\n" + a + " * 6 = " + b6 + "\n" + a + " * 7 = " + b7 + "\n" + a + " * 8 = " + b8 + "\n" + a + " * 9 = " + b9 + "\n" + a + " * 10 = " + b10);
                
            }else if (op == 6) {
                JOptionPane.showMessageDialog(null, "Saindo....... Tchau =) ");
                
            }else {
                JOptionPane.showMessageDialog(null, "Opção inválida", "Erro!!", 0);
            }
        } while (op != 6);
    }
}
