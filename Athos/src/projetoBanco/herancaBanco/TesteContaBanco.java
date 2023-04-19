/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoBanco.herancaBanco;

/**
 *
 * @author user
 */
public class TesteContaBanco {
    public static void main(String[] args) {
        ContaBanco c = new ContaBanco();
        ContaCorrenteBanco cc = new ContaCorrenteBanco();
        ContaPoupancaBanco cp = new ContaPoupancaBanco();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        c.atualiza(0.10);
        cc.atualiza(0.10);
        cp.atualiza(0.10);
        System.out.println("Conta "+c.getSaldo());
        System.out.println("Saldo Conta corrente "+cc.getSaldo());
        System.out.println("Saldo Conta Poupanca "+cp.getSaldo());

        }
}

