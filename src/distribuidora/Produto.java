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
public class Produto {

    private String codigo;
    private String nome;
    private String lote;
    private String validade;
    
    //Construtores
    public Produto(){
        
    } 
    public Produto(String codigo){
        this.codigo = codigo;
    }
    public Produto(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    public Produto(String codigo, String nome, String lote){
        this.codigo = codigo;
        this.nome = nome;
        this.lote = lote;
    }
    public Produto(String codigo, String nome, String lote, String validade){
        this.codigo = codigo;
        this.nome = nome;
        this.lote = lote;
        this.validade = validade;
    }
    
    //Get e Set Codigo
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    //Get e set nome
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    //Get e set lote
    public String getLote(){
        return lote;
    }
    
    public void setLote(String lote){
        this.lote = lote;
    }
    
    //Get e set validade
    public String getValidade(){
        return validade;
    }
    
    public void setValidade(String validade){
        this.validade = validade;
    }
    
    
}
    
