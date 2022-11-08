/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastro;

import database.DB;
import java.util.List;

/**
 *
 * @author rodrigo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumero(123);
        c1.setSaldo(100);
        
        Conta c2 = new Conta();
        c2.setNumero(456);
        c2.setSaldo(250);
        
        Conta c3 = new Conta();
        c3.setNumero(555);
        c3.setSaldo(500);
        
        DB banco = new DB();
        banco.insert(c1);
        banco.insert(c2);
        banco.insert(c3);
        
        List<Conta> lista;
        System.out.println(banco.getTotal());        
        
        lista = banco.getContas();
        for (Conta conta : lista) {
            System.out.println(conta);
        }
        
        System.out.println("\n ##### Pesquisando por codigo ####");
        System.out.println(banco.getContaById(2));  
    
        Conta contaUpdate = banco.getContaById(2);
        if (contaUpdate != null){
           contaUpdate.setSaldo(1000); 
        }
    
        System.out.println("\n ##### Imprimindo ####");
        lista = banco.getContas();
        for (Conta conta : lista) {
            System.out.println(conta);
        }
        
        System.out.println("\n ##### Deletando Registro ####");
        banco.delete(2);
        banco.delete(3);
        lista = banco.getContas();
        for (Conta conta : lista) {
            System.out.println(conta);
        }
           
    }
    
}
