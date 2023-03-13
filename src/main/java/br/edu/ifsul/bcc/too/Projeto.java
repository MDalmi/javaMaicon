/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifsul.bcc.too;

import javax.swing.JOptionPane;

import java.util.Scanner;


/**
 *
 * @author 20221PF.CC0003
 */
public class Projeto {
    
    
    // Método é o construtor da classe Teste.
    // Obrigatório (Nome == Classe), possivel ter mais de 1 na mesma classe,
    // Apenas mudando sua assinaturas.
    
    public Projeto(){
        
        
    }

    //definição de método em java
    
    // Float == passagem por parâmetro (derivado)
    
    // float == cópia de valores (primitivo)
    
    public static float funcaoMedia(float v1, float v2){
        
        return (v1 * v2) / 2.0f;
        
    }
    
    public Float funcaoMedia(Float v1, Float v2){
        
        Float resultado = v1 + v2;
        resultado  = resultado / 2f;
        return resultado;
    }
    
    //Método main(primeiro a ser executado)
    public static void main(String args[]){
        
       
         // ======================
         Projeto t = new Projeto();
        // Criação de variável/objeto;
        
        // Chamada da função;
        float res = t.funcaoMedia(10f, 15f);
        
        
        System.out.println("Peguei, Peguei a porra do esquema!!");
        
     
        System.out.print("*********\n");
        
        // Inicialização da função.
        System.out.println("Media = " + res);
        
        // Exercicio: Alterar essa rotina para que o usuário informe os dois valores:
        // Opção 1: Por interface gráfica. (javax.swing.J0ptionPane).
        
        /*
        float valor1 = JOptionPane.showInputDialog("Informe o valor 1: ");
        float valor2 = JOptionPane.showInputDialog("Informe o valor 2: ");
        
        
        float f1 = Float.valueOf(valor1).floatValue();
        float f2 = Float.valueOf(valor2).floatValue();
        */
        
        // Opção 2: Por linha de comando. (java.util.Scanner).
        
        Scanner valo1 = new Scanner(System.in);
            System.out.println("Informe o valor 1: ");
             String valor1_scanner = valo1.nextLine();  
        
        Scanner valo2 = new Scanner(System.in);
              System.out.println("Informe o valor 2:");
              String valor2_scanner = valo2.nextLine();  
              
             /*
        float ress = t.funcaoMedia(valor2_scanner, valor1_scanner); */
        
        
     
        
    }
}
    
    
    
    
        
        
    
    

