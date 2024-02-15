/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10;
import java.util.Scanner;
/**
    10)-Você foi encarregado da informatização do RH de uma determinada empresa.
    Assim guarda-se do funcionário: seu código, valor da hora, número de horas
    trabalhadas, número de dependente menores de 18 anos e o número de horas extra. Para
    calcular o salário do funcionário leva-se em conta que o valor da hora extra é 45,38 e
    deve ser descontado 8% de INSS e para cada filho menor têm-se um auxílio de 13,89. O
    programa deverá exibir o salário bruto (sem desconto) e o salário líquido (com
    desconto). @author FEF
 */
public class Atividade10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int codigoFunc,qtdFilhos;
        double valorHora,nHoras,nHorasExtras,salarioBruto,salarioLiq,extraFilho;
        
        System.out.println("Digite o codigo do funcionario:");
        codigoFunc = ler.nextInt();
        System.out.println("Digite o valor da hora trabalhada:");
        valorHora = ler.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas:");
        nHoras = ler.nextDouble();
        System.out.println("Digite o numero de horas extras trabalhadas:");
        nHorasExtras = ler.nextDouble();
        System.out.println("Digite o numero de dependentes menores de 18 anos:");
        qtdFilhos = ler.nextInt();
        
        extraFilho = qtdFilhos*13.89;
        
        salarioBruto = (valorHora*nHoras)+(nHorasExtras*45.38)+extraFilho;
        
        System.out.println(salarioBruto);
        
        System.out.println(salarioBruto*0.08);
        
        
        salarioLiq = salarioBruto-(salarioBruto*0.08);
        System.out.println(salarioLiq);
        
    }
    
}
