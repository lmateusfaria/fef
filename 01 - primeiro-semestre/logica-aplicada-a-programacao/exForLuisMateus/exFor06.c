#include <stdio.h>
#include <stdlib.h>

// 8-Escreva uma Programa que receba a idade de 15 pessoas, calcule e imprima:
// a quantidade de pessoas em cada faixa etária;
// a porcentagem de cada faixa etária em relação ao total de pessoas.
// As faixas etárias são:
// 1 a 15 anos -> faixaEt1
// 16 a 30 anos -> faixaEt2
// 31 a 45 anos -> faixaEt3
// 46 a 60 anos -> faixaEt4
// >= 61 anos -> faixaEt5


int main(int argc, char const *argv[]){
    int idade,i,faixaEt1=0,faixaEt2=0,faixaEt3=0,faixaEt4=0,faixaEt5=0;
    double porcFaixaEt1,porcFaixaEt2,porcFaixaEt3,porcFaixaEt4,porcFaixaEt5,r;
    
    for ( i = 0; i < 15; i++){
        printf("Digite a Idade da pessoa %d: ",i+1);
        scanf("%d", &idade);

        if (idade >= 61){
            faixaEt5++;

        }else if (idade >= 46 && idade <= 60){
            faixaEt4++;

        }else if (idade >= 31 && idade <= 45){
            faixaEt3++;
            
        }else if (idade >= 16 && idade <= 30){
            faixaEt2++;

        }else if (idade >= 1 && idade <= 15){
            faixaEt1++;

        }
        
    }
    
    printf("Quantidade de pessoas 1 a 15 anos = %d\n", faixaEt1);
    printf("Quantidade de pessoas 16 a 30 anos = %d\n", faixaEt2);
    printf("Quantidade de pessoas 31 a 45 anos = %d\n", faixaEt3);
    printf("Quantidade de pessoas 46 a 60 anos = %d\n", faixaEt4);
    printf("Quantidade de pessoas com 61 anos ou mais = %d\n", faixaEt5);
    
    r = (i-(faixaEt2+faixaEt3+faixaEt4+faixaEt5));
    porcFaixaEt1 = ((float)(r/i)*100);

    r = (i-(faixaEt1+faixaEt3+faixaEt4+faixaEt5));
    porcFaixaEt2 = ((float)(r/i)*100);
    
    r = (i-(faixaEt1+faixaEt2+faixaEt4+faixaEt5));
    porcFaixaEt3 = ((float)(r/i)*100);
    
    r = (i-(faixaEt1+faixaEt2+faixaEt3+faixaEt5));
    porcFaixaEt4 = ((float)(r/i)*100);

    r = (i-(faixaEt1+faixaEt2+faixaEt3+faixaEt4));
    porcFaixaEt5 = ((float)(r/i)*100);
    
    printf("Porcentagem de pessoas com 1 a 15 anos em relacao ao total => %.2f %%\n", porcFaixaEt1);
    printf("Porcentagem de pessoas 16 a 30 anos em relacao ao total => %.2f %%\n", porcFaixaEt2);
    printf("Porcentagem de pessoas 31 a 45 anos em relacao ao total => %.2f %% \n", porcFaixaEt3);
    printf("Porcentagem de pessoas 46 a 60 anos em relacao ao total => %.2f %% \n", porcFaixaEt4);
    printf("Porcentagem de pessoas com 61 anos ou mais em relacao ao total => %.2f %% \n", porcFaixaEt5);
    
    system("pause");
    return 0;
}
