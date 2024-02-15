/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjavamediacombustivel;

import java.util.Scanner;

/**
@luis.mateus
 */
public class AppJavaMediaCombustivel {

    public static void main(String[] args) {
    /**
        Dada uma distância percorrida (em quilômetros), bem
        como o total de combustível gasto (em litros), informe o
        consumo médio do veículo.
     */
    Scanner ler = new Scanner(System.in);
     
    float km,comb, media;
    
    System.out.println("digite a distancia percorrida = ");
    km = ler.nextFloat();
    System.out.println("digite a quantidade total de combustível gasto = ");
    comb  = ler.nextFloat();
    
    media = km/comb;
    
    System.out.println("a media do consumo do veiculo é = " + media +"km por litro");
    
    if(media > 30){
        System.out.println("Media MAiOIR QUE 30");
    }
    
        
        
        
        
        
    }
    
}
