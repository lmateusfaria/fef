
#include <stdio.h>
// 2- Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua
// opinião em relação ao filme: ótimo - 3, bom - 2, regular - 1.
// Faça um Programa que receba a idade e a opinião de 15 espectadores, calcule e imprima:
// a média das idades das pessoas que responderam ótimo;
// a quantidade de pessoas que responderam regular;
// a porcentagem de pessoas que responderam bom entre todos os espectadores analisados.
int main(){
    int idade,i,op,otimo=0,bom=0,regular=0,invalido=0;  
    double somaIdadeOtimo=0,mediaOtimo=0,porcBom=0,r=0;

    for ( i = 0; i < 15; i++){
        printf("Digite a Idade: ");
        scanf("%d", &idade);
        printf("Digite a operacao correspondente a opiniao: ");
        scanf("%d", &op);

        if (op == 1){
            regular++;
        }else if (op == 2){
            bom++;
        } else if (op == 3){
            otimo++;
            somaIdadeOtimo = idade + somaIdadeOtimo;
        }else{
            invalido++;
        }
    }
    printf("regular = %d\n", regular);
    printf("bom = %d\n", bom);
    printf("otimo = %d\n", otimo);
    
    if(otimo >= 1){
        mediaOtimo = somaIdadeOtimo/otimo;
    }
    
    if(bom >= 1){
        r = (i-(regular+otimo+invalido));
        porcBom = ((r/i)*100);
    }

    printf("A media das idades das pessoas que responderam otimo = %.2f\n", mediaOtimo);
    printf("A quantidade de pessoas que responderam regular = %d\n", regular);
    printf("A porcentagem de pessoas que responderam bom entre todos os espectadores analisados = %.2f %% \n", porcBom);

    system("pause");
    return 0;
    
}





