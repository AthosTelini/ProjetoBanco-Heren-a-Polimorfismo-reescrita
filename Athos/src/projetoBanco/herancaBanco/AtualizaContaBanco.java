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
public class AtualizaContaBanco {
    private double saldoTotal = 0;
    private double selic;

    public AtualizaContaBanco(double selic) {
        this.selic = selic;
    }

    public void roda(ContaBanco c) {
        System.out.println("Antigo: " + c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Novo: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return this.saldoTotal;
    }
    
    public static void main(String[] args) {
        ContaBanco c = new ContaBanco();
        ContaBanco cc = new ContaCorrenteBanco();
        ContaBanco cp = new ContaPoupancaBanco();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        AtualizaContaBanco adc = new AtualizaContaBanco(0.10);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        System.out.println("Saldo Total: " + adc.getSaldoTotal());
        
        
}
}
