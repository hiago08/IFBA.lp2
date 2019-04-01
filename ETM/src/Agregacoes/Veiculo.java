/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregacoes;

/**
 *
 * @author Hiago
 */
public class Veiculo {
    
    private String tipo;
    private String codigo;
    private short capacidade; 
    private String combustivel;
    private String tipoRota;
    private String tipoCobranca;
    private short numeroTrajetos; //número de trajetos diários
    private float custoKm; //Custo por quilometro rodado

    public Veiculo(String tipo, String codigo, short capacidade, String combustivel, String tipoRota, String tipoCobranca, short numeroTrajetos, float custoKm) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.capacidade = capacidade;
        this.combustivel = combustivel;
        this.tipoRota = tipoRota;
        this.tipoCobranca = tipoCobranca;
        this.numeroTrajetos = numeroTrajetos;
        this.custoKm = custoKm;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public short getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(short capacidade) {
        this.capacidade = capacidade;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getTipoRota() {
        return tipoRota;
    }

    public void setTipoRota(String tipoRota) {
        this.tipoRota = tipoRota;
    }

    public String getTipoCobranca() {
        return tipoCobranca;
    }

    public void setTipoCobranca(String tipoCobranca) {
        this.tipoCobranca = tipoCobranca;
    }

    public short getNumeroTrajetos() {
        return numeroTrajetos;
    }

    public void setNumeroTrajetos(short numeroTrajetos) {
        this.numeroTrajetos = numeroTrajetos;
    }

    public float getCustoKm() {
        return custoKm;
    }

    public void setCustoKm(float custoKm) {
        this.custoKm = custoKm;
    }
    
    
    
}
