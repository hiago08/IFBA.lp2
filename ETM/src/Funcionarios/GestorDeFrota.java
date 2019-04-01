/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

import Veiculos.Veiculo;
import Veiculos.Brt;
import Veiculos.Metro;
import Veiculos.MicroOnibus;
import Veiculos.Onibus;
import Veiculos.Van;
import Veiculos.Vlt;

/**
 *
 * @author Hiago
 */
public class GestorDeFrota extends Funcionario {
    
    Onibus [] listaOnibus;
    int proxPLOni;
    MicroOnibus [] listaMicroOnibus;
    int proxPLMic;
    Van [] listaVan;
    int proxPLVan;
    Metro [] listaMetro;
    int proxPLMet;
    Brt [] listaBrt;
    int ProxPLBrt;
    Vlt [] listaVlt;
    int proxPLVlt;
    int tamanho = 5;
    

    public GestorDeFrota() {
    }

    public GestorDeFrota(String nome, String CPF, String CTPS, int cargaHoraria, float salario) {
        super(nome, CPF, CTPS, cargaHoraria, salario);
        listaOnibus = new Onibus[tamanho];
        listaMicroOnibus = new MicroOnibus[tamanho];
        listaVan = new Van[tamanho];
        listaMetro = new Metro[tamanho];
        listaBrt = new Brt[tamanho];
        listaVlt = new Vlt[tamanho];
    }
    
    
    
    
    
    
}
