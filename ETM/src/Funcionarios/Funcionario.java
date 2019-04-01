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
    private short cargaHoraria;
    private float salario;

    public Funcionario(String nome, String CPF, String CTPS, short cargaHoraria, float salario) {
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

    public short getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(short cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
