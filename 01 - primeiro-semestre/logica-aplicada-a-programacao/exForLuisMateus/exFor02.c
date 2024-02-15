#include <stdlib.h>
// 3-Faça uma Programa que imprima na tela as tabuadas de 1 a 10.
int main(int argc, char const *argv[])
{
    int i,j;

    for (i = 1; i <= 10; i++){
        printf("Inicio da Tabuada do %d\n",i);
        for (j = 1; j <= 10; j++){        
            printf("%d x %d = %d\n", i,j,i*j);
        }
        printf("Fim da Tabuada do %d\n\n",i);
    }
    
    system("pause");
    return 0;
    
}
