/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoBanco;

/**
 *
 * @author user
 */
public class ContaBanco {
    ClienteBanco objCliente1 = new ClienteBanco();
    ClienteBanco objCliente2;
    private double saldo;
    private double  limite;
    private int numero;
    private static int totalDeContas;
    
    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
       }
}
