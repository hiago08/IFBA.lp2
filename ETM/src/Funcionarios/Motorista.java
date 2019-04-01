/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

import Veiculos.Veiculo;
     

/**
 *
 * @author Hiago
 */
public class Motorista extends Funcionario {
    
    private Veiculo[] veiculosMotorista;
    private int proxPL = 0;

    public Motorista(String nome, String CPF, String CTPS, int cargaHoraria, float salario) {
        super(nome, CPF, CTPS, cargaHoraria, salario);
    }
    
    public void adcionarListaMotorista(Veiculo novo) {
        if (proxPL < veiculosMotorista.length) {  //Se o tamaanho do array suportar, continuar
            veiculosMotorista[proxPL] = novo;
        } else {
            Veiculo[] temp = new Veiculo[veiculosMotorista.length * 2];  //Se o tamanho do array não suportar, dobrar tamanho
            for (int i = 0; i < veiculosMotorista.length; i = i + 1) {
                temp[i] = veiculosMotorista[i]; //Cópia do conteúdo para array temporário
            }
            veiculosMotorista = temp; //Aponte para temporário
            veiculosMotorista[proxPL] = novo;
        }
        proxPL = proxPL + 1;

    }
    
    
}
