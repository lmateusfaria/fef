#include <stdio.h>
#include <stdlib.h>
// 6-Faça uma Programa que receba a idade, o peso e o sexo de 10 pessoas.
// Calcule e imprima:
// total de homens;
// total de mulheres;
// média das idades dos homens;
// média dos pesos das mulheres.
int main(int argc, char const *argv[])
{
    int idade,contF=0,contM=0;
    double peso=0,mediaIdade=0,mediaPeso=0,somaIdade=0,somaPeso=0;
    char sexo;

    for (int i = 0; i < 3; i++){
        printf("Digite a Idade: ");
        scanf("%d", &idade);

        printf("\n| [M] - Masculino | [F] - Feminino |\nDigite o sexo: ");
        scanf(" %c", &sexo);
        
        printf("Digite o peso: ");
        scanf("%lf", &peso);
        
        if(sexo == 'M' || sexo == 'm'){
            contM++;
            somaIdade = idade+somaIdade;
            printf("%d",somaIdade);
        }else if (sexo == 'F' || sexo == 'f'){
            contF++;
            somaPeso = peso+somaPeso;
            printf("%f",somaPeso);
        }else {
            printf("Sexo Invalido!\n");
        }
        printf("\n");
    }
    mediaIdade = ((float) somaIdade/contM);
    mediaPeso = ((float) somaPeso/contF);
    
    printf("Homens = %d\nMulheres = %d\n",contM,contF);
    printf("\n");
    printf("Media da Idade dos Homens = %.0f Anos\nMedia do Peso das Mulheres = %.2f kg\n",mediaIdade,mediaPeso);
    
    system("pause");
    return 0;
    
}

