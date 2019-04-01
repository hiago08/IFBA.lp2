/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

/**
 *
 * @author Hiago
 */
public class Funcionario {
    
    private String nome;
    private String CPF;
    private String CTPS;
    private int cargaHoraria;
    private float salario;

    public Funcionario() {
    }
    

    public Funcionario(String nome, String CPF, String CTPS, int cargaHoraria, float salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.CTPS = CTPS;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Funcionario) {
                if (((Funcionario) obj).CPF.equals(this.CPF)) {
                        return true;
                }
            }
            else if(obj.equals((CPF))){
                return true;
            }
            return false;
        }
        return false;

    }
    
    @Override
    public String toString(){
        return ("Nome: " +  nome + " CPF: " + CPF + " CTPS: " + CTPS + " Carga Horária: " + cargaHoraria + " Salário:" + salario);
    }
    
}
