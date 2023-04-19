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
public class ContaCorrenteBanco extends ContaBanco {
     
    @Override
      void atualiza(double taxa) {
        
        super.deposita(this.getSaldo()*(taxa*2));
    }
      @Override
        public void deposita(double saldo){ 
         super.deposita(saldo-1);
      }
}
