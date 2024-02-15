import java.util.Scanner;
public class App {

    //9)- Você foi contratado por uma loja comercial de vestuário para calcular o valor de
    //venda de um determinado produto. É necessário o usuário digitar o código do produto, o
    //valor unitário, o desconto que concedido ao usuário (Ex. 15%, o usuário irá digitar 15).
    //Para calcular o valor de venda, aplica-se sobre o valor unitário 15% de imposto e uma
    //taxa de frete de 2,56 e concede-se o desconto informado.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);

        String codigoProduto;
        double valorProduto,desconto,valorDesconto, valorFinal,frete=2.56;

        System.out.println("Insira o código do produto:");
        codigoProduto = ler.nextLine();
        System.out.println("Insira o valor do produto:");
        valorProduto = ler.nextFloat();
        System.out.println("Insira o do desconto no produto(Ex. 15%, irá digitar 15):");
        desconto = ler.nextFloat();
        
        valorDesconto = valorProduto*(desconto/100);
        System.out.println("Valor do Desconto = R$ "+valorDesconto);
        valorFinal = ((valorProduto+(valorProduto*(15/100))+frete)-valorDesconto);
        System.out.println("Valor Final do produto "+codigoProduto+" = R$ "+valorFinal);
    }
}
