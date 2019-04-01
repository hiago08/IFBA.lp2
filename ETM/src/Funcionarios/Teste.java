/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

/**
 *
 * @author Aluno
 */
public class Teste {

    public Teste() {
    }
     public static void main(String[] args) {
         
        GerenteLocal g1 = new GerenteLocal ("Meuca","045.789.555-59", "000.12378.22-7", 44, 7500);
        Motorista m1 = new Motorista("Cuca", "045.789.666-69","000.12345.22-7", 40, 2500);
        g1.adcionarMotorista(m1);
        
        g1.imprimirListaMotoristas();
         
    }
    
    
    
}
