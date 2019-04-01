/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veiculos;

/**
 *
 * @author Hiago
 */
public class Veiculo {
    
    private String tipo;
    private String codigo;
    private int capacidade; 
    private String tipoCombustivel;
    private String tipoRota;
    private String tipoCobranca;
    private int numeroTrajetos; //número de trajetos diários
    private float custoKm; //Custo por quilometro rodado

    public Veiculo() {
    }
    
    
    public Veiculo(String tipo, String codigo, int capacidade, String combustivel, String tipoRota, String tipoCobranca, int numeroTrajetos, float custoKm) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.capacidade = capacidade;
        this.tipoCombustivel = combustivel;
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(short capacidade) {
        this.capacidade = capacidade;
    }

    public String getCombustivel() {
        return tipoCombustivel;
    }

    public void setCombustivel(String combustivel) {
        this.tipoCombustivel = combustivel;
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

    public int getNumeroTrajetos() {
        return numeroTrajetos;
    }

    public void setNumeroTrajetos(int numeroTrajetos) {
        this.numeroTrajetos = numeroTrajetos;
    }

    public float getCustoKm() {
        return custoKm;
    }

    public void setCustoKm(float custoKm) {
        this.custoKm = custoKm;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Veiculo) {
                if (((Veiculo) obj).codigo.equals(this.codigo)) {
                        return true;
                }
            }
            else if(obj.equals((codigo))){
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return ("Tipo: " + tipo + " Código: " + codigo + " capacidade " + capacidade + " Tipo de cobustivel " + tipoCombustivel +  " Tipo de Rota " + tipoRota + " Tipo de cobrança " + tipoCobranca + " Números de Trajetos Diários " + numeroTrajetos + " Custo por KM: " +  custoKm);
    }
    
    
    
}
