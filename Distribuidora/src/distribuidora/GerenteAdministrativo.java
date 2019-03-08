/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidora;

/**
 *
 * @author Aluno
 */
public class GerenteAdministrativo {
    
    private String nome;
    private String cpf;
    private String funcao;
    private float salario;
    
    //Construtores
    public GerenteAdministrativo () {
    
    }
    public GerenteAdministrativo (String nome) {
        this.nome = nome;
    }
    public GerenteAdministrativo (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public GerenteAdministrativo (String nome, String cpf, String funcao) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
    }
    public GerenteAdministrativo (String nome, String cpf, String funcao, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.salario = salario;
    }
    
    //Get e Set nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    //Get e Set cpf
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    //Get e set funcao
    public String getFuncao(){
        return funcao;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    
    //Get e set salario
    public float getSalario(){
        return salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    
}
