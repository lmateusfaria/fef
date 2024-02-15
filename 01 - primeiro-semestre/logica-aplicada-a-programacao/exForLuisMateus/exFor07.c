#include <stdio.h>
#include <stdlib.h>
// 10-Tem-se um conjunto de dados contendo a altura e o sexo (M ou F) de 15 pessoas. Faça uma
// Programa que
// calcule e escreva:
// a maior e a menor altura do grupo;
// a média de altura das mulheres;
// número de homens.

int main(int argc, char const *argv[])
{
    int idade,contF=0,contM=0;
    double altura=0,mediaAltura=0,somaAltura=0,maiorAltura=0,menorAltura;
    char sexo;

    for (int i = 0; i < 3; i++){
        
        printf("\n| [M] - Masculino | [F] - Feminino |\nDigite o sexo: ");
        scanf(" %c", &sexo);
        
        printf("Digite a altura: ");
        scanf("%lf", &altura);
        
        if(sexo == 'M' || sexo == 'm'){
            contM++;
            
        }else if (sexo == 'F' || sexo == 'f'){
            contF++;
            somaAltura = altura+somaAltura;
        }else {
            printf("Sexo Invalido!\n");
        }
        printf("\n");

        mediaAltura = somaAltura/contF;

        if (altura > maiorAltura){
            maiorAltura = altura;
        }
        if (altura < menorAltura){
            menorAltura = altura;
        }
        
    }
    
    printf("A maior altura do grupo => %.2f \n", maiorAltura);
    printf("A menor altura do grupo => %.2f \n", menorAltura);
    printf("\n");
    printf("A media da altura das mulheres do grupo => %.2f \n", mediaAltura);
    printf("Numero de homens do grupo => %d \n", contM);
    
    system("pause");
    return 0;
    
}