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
public class GerenteLocal extends Funcionario{
    
    Motorista [] listaMotorista;
    private int proxPLMot;
    Cobrador [] listaCobrador;
    private int proxPLCob;
    GestorDeFrota [] listaGestorDeFrota;
    private int proxPLGes;
    int tamanho = 5;
    public GerenteLocal( ) {
        
    }

    public GerenteLocal(String nome, String CPF, String CTPS, int cargaHoraria, float salario) {
        super(nome, CPF, CTPS, cargaHoraria, salario);
        listaMotorista = new Motorista[tamanho];
        listaCobrador = new Cobrador[tamanho];
        listaGestorDeFrota = new GestorDeFrota [tamanho];
    }
    
    
    //Adições
    public void adcionarMotorista(Motorista novo) {
        if (proxPLMot < listaMotorista.length) {  //Se o tamaanho do array suportar, continuar
            listaMotorista[proxPLMot] = novo;
        } else {
            Motorista [] temp = new Motorista[listaMotorista.length * 2];  //Se o tamanho do array não suportar, dobrar tamanho
            for (int i = 0; i < listaMotorista.length; i = i + 1) {
                temp[i] = listaMotorista[i]; //Cópia do conteúdo para array temporário
            }
            listaMotorista = temp; //Aponte para temporário
            listaMotorista[proxPLMot] = novo;
        }
        proxPLMot = proxPLMot + 1;
    }
    
    public void adcionarCobrador(Cobrador novo) {
        if (proxPLCob < listaCobrador.length) {  
            listaCobrador[proxPLCob] = novo;
        } else {
            Cobrador [] temp = new Cobrador [listaCobrador.length * 2]; 
            for (int i = 0; i < listaCobrador.length; i = i + 1) {
                temp[i] = listaCobrador[i]; 
            }
            listaCobrador = temp;
            listaCobrador[proxPLCob] = novo;
        }
        proxPLCob = proxPLCob + 1;
    }
    
    
    public void adcionarGestorDeFrota(GestorDeFrota novo) {
        if (proxPLGes < listaGestorDeFrota.length) {  
            listaGestorDeFrota[proxPLCob] = novo;
        } else {
            GestorDeFrota [] temp = new GestorDeFrota [listaGestorDeFrota.length * 2]; 
            for (int i = 0; i < listaGestorDeFrota.length; i = i + 1) {
                temp[i] = listaGestorDeFrota[i]; 
            }
            listaGestorDeFrota = temp;
            listaGestorDeFrota[proxPLGes] = novo;
        }
        proxPLGes = proxPLGes + 1;
    }
    
    //Remoções
    
    public void removerMotorista(Motorista motRem) {
        boolean achei = false;  
        int p = 0; 
        while (!achei && p < proxPLMot) { 
            if (motRem.equals(listaMotorista[p])) {
                achei = true;
                for (int i = p; i < proxPLMot; i = i + 1) { 
                    listaMotorista[i] = listaMotorista[i + 1];
                }
                proxPLMot = proxPLMot - 1;
            }
            p = p + 1;
        }
    }
    
    public void removerCobrador(Cobrador cobRem) {
        boolean achei = false;  
        int p = 0; 
        while (!achei && p < proxPLCob) { 
            if (cobRem.equals(listaCobrador[p])) {
                achei = true;
                for (int i = p; i < proxPLMot; i = i + 1) { 
                    listaCobrador[i] = listaCobrador[i + 1];
                }
                proxPLCob = proxPLCob - 1;
            }
            p = p + 1;
        }
    }
    
    public void removerGestorDeFrota(GestorDeFrota gesRem) {
        boolean achei = false;  
        int p = 0; 
        while (!achei && p < proxPLGes) { 
            if (gesRem.equals(listaGestorDeFrota[p])) {
                achei = true;
                for (int i = p; i < proxPLMot; i = i + 1) { 
                    listaGestorDeFrota[i] = listaGestorDeFrota[i + 1];
                }
                proxPLGes = proxPLGes - 1;
            }
            p = p + 1;
        }
    }
    
    //Buscas
    public Motorista buscarMotorista(String CPF) {
        int p = 0;
        while (p < proxPLMot) {
            if (listaMotorista[p].getCPF().equals(CPF)) {
                return listaMotorista[p]; 
            }
            p = p + 1;
        }
        return null;
    }
    
    public Cobrador buscarCobrador(String CPF) {
        int p = 0;
        while (p < proxPLCob) {
            if (listaCobrador[p].getCPF().equals(CPF)) {
                return listaCobrador[p]; 
            }
            p = p + 1;
        }
        return null;
    }
    
    public GestorDeFrota buscarGestorDeFrota(String CPF) {
        int p = 0;
        while (p < proxPLGes) {
            if (listaGestorDeFrota[p].getCPF().equals(CPF)) {
                return listaGestorDeFrota[p]; 
            }
            p = p + 1;
        }
        return null;
    }
    
    //Atualizações
    public void atualizarMotorista (Motorista motAtu){
        int p =0;
        boolean atualizei = false;
        while (!atualizei &&  p < proxPLMot){
            if (listaMotorista[p].equals(motAtu)){
                listaMotorista[p] = motAtu;
            }
            p =  p +1;
        }
    }
    
    public void atualizarCobrador (Cobrador cobAtu){
        int p =0;
        boolean atualizei = false;
        while (!atualizei &&  p < proxPLCob){
            if (listaCobrador[p].equals(cobAtu)){
                listaCobrador[p] = cobAtu;
            }
            p =  p +1;
        }
    }
    
    public void atualizarGestorDeFrota (GestorDeFrota gesAtu){
        int p =0;
        boolean atualizei = false;
        while (!atualizei &&  p < proxPLGes){
            if (listaGestorDeFrota[p].equals(gesAtu)){
                listaGestorDeFrota[p] = gesAtu;
            }
            p =  p +1;
        }
    }
    
    //Relatórios
    public void imprimirListaMotoristas(){
        System.out.print(" [ ");
        for (int i = 0; i< proxPLMot; i = i + 1) {
            System.out.print(listaMotorista[i]);
            if(i!= (proxPLMot-1)){
                System.out.print(" , ");
            }
        }
        System.out.print(" ] ");
    }
    
    public void imprimirListaCobradores(){
        System.out.print("[ ");
        for (int i = 0; i< proxPLCob; i = i + 1) {
            System.out.print(listaCobrador[i]);
            if(i!= (proxPLCob-1)){
                System.out.print(" , ");
            }
        }
        System.out.print(" ] ");
    }
    
    public void imprimirListaGestoresDeFrota(){
        System.out.print("[ ");
        for (int i = 0; i< proxPLGes; i = i + 1) {
            System.out.print(listaGestorDeFrota[i]);
            if(i!= (proxPLGes-1)){
                System.out.print(" , ");
            }
        }
        System.out.print(" ] ");
    }
    
    
    
}
