/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import cadastro.Conta;
import java.util.*;

/**
 *
 * @author rodrigo
 */
public class DB {
    
    private static List<Conta> lista = new ArrayList<>();
    private static int total = 0;
    private static int chaveSequencial = 0;
    
    public void insert(Conta conta){
       conta.setId(++chaveSequencial);
       DB.lista.add(conta);
       total++;        
    }

    public List<Conta> getContas(){
        return DB.lista;
    }
    
    public Conta getContaById(Integer id){
        for (Conta conta : lista) {
            if (conta.getId() == id){
                return conta;
            }            
        }
        
        return null;
    }
    
    public void delete(Integer id){
        Iterator<Conta> it = lista.iterator();
        while (it.hasNext()){
            Conta conta = it.next();
            if (conta.getId() == id){
                it.remove();
            }
        }  
    }
    
    
    public static int getTotal() {
        return total;
    }
    
    
    
}
