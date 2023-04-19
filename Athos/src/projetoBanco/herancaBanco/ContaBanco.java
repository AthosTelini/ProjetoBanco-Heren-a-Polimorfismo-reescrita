
package projetoBanco.herancaBanco;

import projetoBanco.*;


 
 //* @author user
 
public class ContaBanco {
    ClienteBanco objCliente1 = new ClienteBanco();
    ClienteBanco objCliente2;
    private double saldo;
    private double  limite;
    private int numero;
    private static int totalDeContas;

    public ClienteBanco getObjCliente1() {
        return objCliente1;
    }

    public void setObjCliente1(ClienteBanco objCliente1) {
        this.objCliente1 = objCliente1;
    }

    public ClienteBanco getObjCliente2() {
        return objCliente2;
    }

    public void setObjCliente2(ClienteBanco objCliente2) {
        this.objCliente2 = objCliente2;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    ContaBanco() { 
        System.out.println("Construindo uma conta");
        ContaBanco.totalDeContas = ContaBanco.totalDeContas + 1;
    }
    ContaBanco(double saldo){
        this();
        this.numero=numero;
        
    }
    
    ContaBanco(double saldo,int numero){
        this(saldo); 
        this.numero = numero;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }
    
    public void deposita(double saldo) { 
        this.saldo = this.saldo + saldo;
       }
    public static void setTotalDeContas(int totalDeContas) {
        ContaBanco.totalDeContas = totalDeContas;
    }
    
    
    
    
    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
       }
}
