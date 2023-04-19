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
public  class FuncionarioBanco {
    private String nomeFuncionario, departamento, dataEntrada, Rg;
    private double salario;
    private boolean statusEmpresa;

     public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return Rg;
    }

    public void setRG(String RG) {
        this.Rg = RG;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void bonifica(double aumento) {
        this.salario = this.salario + aumento;
        //this.salario+=aumento;
    }

    public void demite() {
        this.statusEmpresa = false;
    }

 

    public void mostra() {
        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Data entrada: " + dataEntrada);
        System.out.println("RG: " + Rg);
        System.out.println("Salário: " + salario);
        System.out.println("Status: " + (statusEmpresa == true ? "Ativo" : "Inativo"));
    }
}