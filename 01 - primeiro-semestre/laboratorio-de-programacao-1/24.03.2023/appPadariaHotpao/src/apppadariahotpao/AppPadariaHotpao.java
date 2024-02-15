/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppadariahotpao;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
6)- A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade
de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do
dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e
quanto' deve guardar numa conta de poupança (10% do total arrecadado). Você foi
contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um programa
para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.
 */
public class AppPadariaHotpao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double vendaPao,vendaBroa,vendaTotal,guardar,pao,broa;
        
        
        System.out.println("DIGITE O NUMERO DE PÃES VENDIDOS NO DIA:");
        pao = ler.nextFloat();
        System.out.println("DIGITE O NUMERO DE BROA VENDIDOS NO DIA:");
        broa  =ler.nextFloat();
        vendaPao = pao*0.12;
        System.out.println("Vendas de pão = R$ " +vendaPao);
        vendaBroa = broa*1.50;
        System.out.println("Vendas de broa = R$"+vendaBroa);
        vendaTotal = vendaBroa+vendaPao;
        guardar = vendaTotal*0.1;
        System.out.println("Venda total do dia = R$ "+vendaTotal);
        System.out.println(new DecimalFormat("Valor do total das vendas do dia = R$ ###,##0.00").format(guardar));
        
        
        
    }
    
}
