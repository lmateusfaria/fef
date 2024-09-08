/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manutencaolista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeffe
 */
public class ManutencaoLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("jefferson");
        pessoa01.setTelefone("11111111");
        
        Pessoa pessoa02 = new Pessoa("teste01","2222222");
        Pessoa pessoa03 = new Pessoa("teste02", "3333333");
        
        pessoas.add(pessoa01);
        pessoas.add(pessoa02);
        pessoas.add(pessoa03);
        
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.toString());
        }
        
        String nome = "teste01";
        //remover teste01
        for(Pessoa pessoa : pessoas){
            if (pessoa.getNome().equals(nome)){
                pessoas.remove(pessoa);
            }
        }
        
        System.out.println("-------------------------------------------------------------");
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.toString());
        }
        
    }
        
}
