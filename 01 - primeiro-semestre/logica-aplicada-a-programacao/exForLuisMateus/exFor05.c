#include <stdio.h>
// 7- Escreva uma Programa que receba a idade de 10 pessoas, calcule e imprima a quantidade de
// pessoas maiores de idade (idade &>= 18 anos).

int main(int argc, char const *argv[]){
    int idade,cont=0;
    
    for (int i = 0; i < 10; i++){
        printf("Digite a idade:");
        scanf("%d", &idade);
        if (idade >= 18 ){
            cont++;
        }
        
    }
    printf("Quantidade de pessoas maiores de idade = %d", cont);

    system("pause");
    return 0;
    
}
