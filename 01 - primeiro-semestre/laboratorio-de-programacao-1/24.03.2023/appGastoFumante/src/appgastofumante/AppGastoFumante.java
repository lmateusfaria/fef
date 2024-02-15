/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgastofumante;

import java.util.Scanner;

/**
    5)-Calcular a quantidade dinheiro gasta por um fumante. Dados: o número de anos que
    ele fuma, o no de cigarros fumados por dia e o preço de uma carteira (maço). Sabe-se
    que em cada maço existem 12 cigarros. Imagine que um ano possua 360 dias.
 */
public class AppGastoFumante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float anosFumando,precoMaco,gasto,macoDia,maco=12;
        int cigarrosDia,ano=360;
        
        System.out.println("Informe o numero de anos fumando:");
        anosFumando = ler.nextFloat();
        System.out.println("Informe o numero de cigarros fumados por dia:");
        cigarrosDia = ler.nextInt();
        System.out.println("Informe o preco de uma carteira de cigarros:");
        precoMaco = ler.nextFloat();
        macoDia = (cigarrosDia/maco);
        
        System.out.println("Dias fumando = "+ (anosFumando*ano));
        System.out.println("Maços fumados por dia = "+ macoDia);
        
        gasto = (macoDia*(anosFumando*ano))*precoMaco;
        
        System.out.println("O valor gasto em "+ anosFumando +" anos fumando, "+cigarrosDia+" cigarros por dia é = R$ "+ gasto);
        
    }
    
}
