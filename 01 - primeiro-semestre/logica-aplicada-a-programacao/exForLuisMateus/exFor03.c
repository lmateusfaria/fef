#include <stdlib.h>
// 4-Faça uma Programa que receba a idade, a altura e o peso de 15 pessoas. Calcule e imprima:
// a quantidade de pessoas com idade superior a 50 anos;
// a média das alturas das pessoas com idade entre 10 e 20 anos;
// a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas.

int main(int argc, char const *argv[])
{
    int idade,i,cont1=0,cont2=0,cont3=0;
    double altura,peso,mediaAltura=0,somaAltura=0,s=0,porcCont3;

    for ( i = 0; i < 15; i++){
        printf("Digite a Idade: ");
        scanf("%d", &idade);
        printf("Digite a altura: ");
        scanf("%lf", &altura);
        printf("Digite o peso: ");
        scanf("%lf", &peso);
        
        if(idade > 50){
            cont1++;
        }
        if(idade >= 10 && idade <=20 ){
            somaAltura = altura + somaAltura;
            cont2++;
        }
        if(peso < 40){
            cont3++;
        }
    }
    
    mediaAltura = ((float) somaAltura/cont2);
    
    s = ((float)cont3/i);
    
    porcCont3 = ((float) s*100);

    printf("a quantidade de pessoas com idade superior a 50 anos = %d\n", cont1);
    printf("A media das alturas das pessoas com idade entre 10 e 20 anos = %.2f\n", mediaAltura);
    printf("A porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas = %.2f\n", porcCont3);

    system("pause");
    return 0;
    
}
