/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoBanco;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class TesteFuncionarioBanco {
     public static void main(String[] args) {
        FuncionarioBanco objFuncionario = new FuncionarioBanco();
        
         Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        objFuncionario.setNomeFuncionario(entrada.nextLine());
        System.out.println("Digite a data de entrada:");
        objFuncionario.setDataEntrada(entrada.next());
        objFuncionario.setDepartamento("RH");
        objFuncionario.setRG("mg12.369.741");
        objFuncionario.setSalario(1400);
        System.out.println("Digite a bonificação:");
        double bonificacao = Double.parseDouble(entrada.next());
        objFuncionario.bonifica(bonificacao);
        objFuncionario.demite();
        objFuncionario.mostra();
        
        
        
        
    }
    
    
}
