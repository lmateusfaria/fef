---------

#include <stdlib.h>
#include <stdio.h>
//1-Escreva um algoritmo em PORTUGOL que leia um número e o imprima caso ele seja maior que 20.


int main (){
	int n;
	
	printf("Digite um numero = ");
	scanf("%d", &n);
	
	if (n > 20)
		printf("%d <- numero maior que 20", n);
	else if (n == 20)
		printf("%d <- numero igual a 20", n);
	else
		printf("%d <- numero menor que 20", n);
	
}

---------

#include <stdlib.h>
#include <stdio.h>
//2-Escreva um algoritmo em PORTUGOL para determinar se um dado número N (recebido através do teclado) é POSITIVO, NEGATIVO.


int main (){
	int n;
	
	printf("Digite um numero = ");
	scanf("%d", &n);
	
	if (n > 0)
		printf("%d <- numero positivo", n);
	else if (n < 0)
		printf("%d <- numero negativo", n);
	else
		printf("%d <- numero igual a 0", n);
	
}

---------

#include <stdlib.h>
#include <stdio.h>
//3-Construa um algoritmo em PORTUGOL que imprima qual o menor e qual o maior valor de dois números A e B, lidos através do teclado.

int main (){
	int n1,n2;
	
	printf("Digite o primeiro numero inteiro: \n");
	scanf("%d", &n1);
	printf("Digite o segundo numero inteiro: \n");
	scanf("%d", &n2);
	
	if(n1 > n2)
		printf("%d (primeiro n) maior que %d (segundo n) \n",n1,n2);
	else if (n2 > n1)
		printf("%d (segundo n) maior que %d (primeiro n) \n",n2,n1);
	else
		printf("%d (primeiro n) igual a %d (primeiro n) \n",n1,n2);
}

---------


#include <stdlib.h>
#include <stdio.h>
//4-A prefeitura de Contagem abriu uma linha de crédito para os funcionários
// estatutários. O valor máximo da prestação não poderá ultrapassar 30% do
// salário bruto. Fazer um algoritmo que permita entrar com o salário bruto e o
// valor da prestação, e informar se o empréstimo pode ou não ser concedido.

int main (){
	float salarioBruto,valorPrest,maxPrest;
	
	printf("Digite o valor do salario bruto do funcionario = ");
	scanf("%f", &salarioBruto);
	printf("Digite o valor da prestacao = ");
	scanf("%f", &valorPrest);
	
	maxPrest = salarioB ruto*0.3;
	
	printf("%f valor maximo por prestacao \n",maxPrest);
	
	if (valorPrest < maxPrest )
		printf("Emprestimo Concedido");
	else
		printf("Emprestimo Não Concedido");
	
}


---------


#include <stdlib.h>
#include <stdio.h>
//5-Construa um algoritmo de PORTUGOL para determinar se o indivíduo esta
// com um peso favorável. Essa situação é determinada através do IMC (Índice
// de Massa Corpórea), que é definida como sendo a relação entre o peso
// (PESO) e o quadrado da Altura (ALTURA) do indivíduo. Ou seja,
// IMC ??PESO/ ALTURA²
// e, a situação do peso é determinada pela tabela abaixo:
// Condição Situação
// IMC abaixo de 20 Abaixo do peso
// IMC de 20 até 25 Peso Normal
// IMC de 25 até 30 Sobre Peso
// IMC de 30 até 40 Obeso
// IMC de 40 e acima Obeso Mórbido

int main (){
	float peso,altura,imc;
	
	printf("Digite a sua altura = ");
	scanf("%f", &altura);
	printf("Digite o seu peso em kg (Ex:35.4) = ");
	scanf("%f", &peso);
	
	imc = peso/(altura*altura);
	
	if (imc <= 20)	
		printf("IMC = %f - Abaixo do peso \n",imc);
	else if (imc > 20 && imc <= 25 )
		printf("IMC = %f - Peso Normal \n",imc);
	else if (imc > 25 && imc <= 30 )
		printf("IMC = %f - Sobre Peso \n",imc);
	else if (imc > 30 && imc <= 40 )
		printf("IMC = %f - Obeso \n",imc);
	else if (imc > 40 )
		printf("IMC = %f - Obeso Morbido \n",imc);
	
}



---------


#include <stdlib.h>
#include <stdio.h>
// 6- A partir da idade informada de uma pessoa, elabore um algoritmo que
// informe a sua classe eleitoral, sabendo que menores de 16 não votam (não
// votante), que o voto é obrigatório para adultos entre 18 e 65 anos (eleitor
// obrigatório) e que o voto é opcional para eleitores entre 16 e 18, ou maiores de
// 65 anos (eleitor facultativo).


int main (){
	int idade;
	
	printf("Digite a sua idade = ");
	scanf("%d", &idade);
	
	if (idade < 16)
		printf("Menores de 16 anos nao votam - Sua idade -> %d anos", idade);
	else if (idade > 18 && idade < 65)
		printf("Sua idade = %d anos -> Voto Obrigatório \n Para adultos entre 18 e 65 anos o voto e obrigatorio (eleitor obrigatório)", idade);
	else if (idade >= 16 && idade <=18)
		printf("sua idade = %d anos -> voto opcional", idade);
	else
		printf("sua idade = %d anos -> voto opcional", idade);
		
}


---------


#include <stdlib.h>
#include <stdio.h>
// 7-A CEF concederá um crédito especial com juros de 2% aos seus clientes de
// acordo com o saldo médio no último ano. Fazer um algoritmo em PORTUGOL
// que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com
// a tabela a seguir. Imprimir uma mensagem informando o saldo médio e o valor de crédito.
// Saldo Médio Percentual// De 0 a 500 Nenhum crédito
// De 501 a 1000 30% do valor do saldo médio
// De 1001 a 3000 40% do valor do saldo médio
// Acima de 3001 50% do valor do saldo médio

int main (){
	float saldo,valorCredito=0;
	
	printf("Digite o saldo medio: ");
	scanf("%f", &saldo);
	
	if (saldo >= 3001){
		valorCredito = saldo*0.5;
		printf("\nCredito Aprovado \nValor Saldo = R$ %.2f \nCredito liberado = R$ %.2f", saldo,valorCredito);
	}
	else if (saldo >= 1001 && saldo <= 3000){
		valorCredito = saldo*0.4;
		printf("\nCredito Aprovado \nValor Saldo = R$ %.2f \nCredito liberado = R$ %.2f", saldo,valorCredito);
	}
	else if (saldo >= 501 && saldo <= 1000){
		valorCredito = saldo*0.3;
		printf("\nCredito Aprovado \nValor Saldo = R$ %.2f \nCredito liberado = R$ %.2f", saldo,valorCredito);	
	}
	else
		printf("\nCredito Reprovado \nValor Saldo = R$ %.2f \nCredito nao liberado! ", saldo);
}



---------


#include <stdlib.h>
#include <stdio.h>
// 8-Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de
// um financiamento pretendido. Caso o financiamento seja menor ou igual a 5
// vezes o salário da pessoa, o algoritmo deverá escrever “Financiamento
// concedido”, caso contrário ele deverá escrever “Financiamento negado”.
// Independente de conceder ou não o financiamento, o algoritmo escreverá
// depois a frase “Obrigada por nos consultar ! “.

int main (){
	float salario,finan,cond;
	
	printf("Digite o valor do salario: ");
	scanf("%f", &salario);
	
	printf("Digite o valor do financiamento pretendido: ");
	scanf("%f", &finan);
	
	cond = salario*5;
	
	if ( finan <= cond)
		printf("\nFINANCIAMENTO CONCEDIDO! \n\n");
	else
		printf("\nFINANCIAMENTO NEGADO! \n\n");
	printf("Obrigada por nos consultar!");
	
}


---------

#include <stdlib.h>
#include <stdio.h>
// 9- Construa um algoritmo que leia três números, calcule e escreva quantos destes números são maiores que 10.
int main(){
	float n1,n2,n3;
	int cont;
	
	printf("Digite o primeiro numero:");
	scanf("%f", &n1);
	
	printf("Digite o segundo numero:");
	scanf("%f", &n2);
	
	printf("Digite o terceiro numero:");
	scanf("%f", &n3);
	
	if (n1 > 10 && n2 > 10 && n3 >10){
		printf("todos os 3 numeros sao maiores que 10");
	}else{
		if((n1 > 10 && n2 > 10 && n3 <= 10) || (n1 > 10 && n2 <= 10 && n3 > 10) || (n1 <= 10 && n2 > 10 && n3 > 10 )){
			printf("apenas 2 numeros sao maiores que 10");
		}else if((n1 > 10 && n2 <= 10 && n3 <= 10) || (n1 <= 10 && n2 > 10 && n3 <= 10 ) || (n1 <= 10 && n2 <= 10 && n3 > 10)){
			printf("apenas 1 numero e maior que 10");
		}else {
			printf("nenhum numero maior que 10");
		}
	}
	
}


---------

#include <stdlib.h>
#include <stdio.h>
// 10-Construa um algoritmo que leia três números, verifique e escreva qual o maior entre eles.
int main(){
	float n1,n2,n3;
	int cont;
	
	printf("Digite o primeiro numero:");
	scanf("%f", &n1);
	
	printf("Digite o segundo numero:");
	scanf("%f", &n2);
	
	printf("Digite o terceiro numero:");
	scanf("%f", &n3);
	
	if (n1 == n2 && n2 == n3 ){
		printf("todos os numeros sao iguais => %.2f ", n1);
	}else{
		if((n1 > n2 && n2 >= n3) || (n1 > n3 && n3 >= n2) ){
			printf("o maior numero e o primeiro => %.2f ",n1);
		}else if ((n2 > n1 && n1 >= n3) || (n2 > n3 && n3 >= n1)){
			printf("o maior numero e o segundo => %.2f ",n2);
		}else  if ((n3 > n1 && n1 >= n2) || (n3 > n2 && n2 >= n1)){
			printf("o maior numero e o terceiro => %.2f ",n3);
		}else if((n1 == n2 && n2 > n3) || (n2 == n1 && n1 > n3)){
			printf("o primeiro => %.2f e o segundo => %.2f sao iguais e maiores que o terceiro => %.2f ",n1,n2,n3);
		}else if((n1 == n3 && n3 > n2) || (n3 == n1 && n1 > n2)){
			printf("o primeiro => %.2f e o terceiro => %.2f sao iguais e maiores que o segundo => %.2f ",n1,n3,n1);
		}else if((n2 == n3 && n3 > n1) || (n3 == n2 && n2 > n1)){
			printf("o segundo => %.2f e o terceiro => %.2f sao iguais e maiores que o primeiro => %.2f ",n1,n2,n3);
		}else{
			printf("ERRO");
		}
	}
	
}


---------


#include <stdlib.h>
#include <stdio.h>
// 11- Num determinado Estado, para transferências de veículos, o DETRAN
// cobra uma taxa de 1% para carros fabricados antes de 1990 e uma taxa de
// 1.5% para os fabricados de 1990 em diante, taxa esta incidindo sobre o valor
// de tabela do carro. O algoritmo abaixo lê o ano e o preço do carro e a seguir
// calcula e imprime imposto a ser pago.

int main(){
	float preco,taxaA=0.1,taxaB=0.15,imp=0;
	int ano;

	printf("TAXA A = %.2f \nTAXA B = %.2f \n",taxaA,taxaB);
	
	printf("Digite o ano do carro:");
	scanf("%d", &ano);
	
	printf("Digite o valor do carro:");
	scanf("%f", &preco);
	
	if(ano < 1990 && ano > 1886){
		imp = ano*taxaA;
		printf("Imposto do carro => R$ %.2f ",imp);
	}else if (ano >=1990 && ano <= 2023){
		imp = ano*taxaB;
		printf("Imposto do carro => R$ %.2f ",imp);
	}else {
		printf("ANO INVALIDO!");
	}
	
	
}


---------

#include <stdlib.h>
#include <stdio.h>
// 12-Uma empresa concederá um aumento de salário aos seus funcionários,
// variável de acordo com o cargo, conforme a tabela abaixo. Faça um algoritmo
// que leia o salário e o código de um funcionário e calcule o novo salário. Se o
// código do funcionário não estiver na tabela, ele deverá, então, receber 40% de
// aumento. Mostre o salário antigo, o novo salário e a diferença.
// Código Cargo Percentual
// 101 Gerente 10%
// 102 Engenheiro 20%
// 103 Técnico 30%

int main(){
	float salario,aumento,novoSalario;
	int cargo;

	printf("Digite o codigo do cargo do funcionario:");
	scanf("%d", &cargo);
	
	printf("Digite o salario atual do funcionario: R$ ");
	scanf("%f", &salario);
	
	if (cargo != 101 || cargo != 102 || cargo != 103){
		aumento = salario*0.4;
		novoSalario = salario + aumento;
		printf("Salario Antigo => R$ %.2f \nNovo Salario => R$ %.2f \nDiferenca => R$ %.2f \n",salario,novoSalario,aumento);
	}else{
		if(cargo == 101){
			aumento = salario*0.1;
			novoSalario = salario + aumento;
			printf("Salario Antigo => R$ %.2f \nNovo Salario => R$ %.2f \nDiferenca => R$ %.2f \n",salario,novoSalario,aumento);
		}else if (cargo == 102){
			aumento = salario*0.2;
			novoSalario = salario + aumento;
			printf("Salario Antigo => R$ %.2f \nNovo Salario => R$ %.2f \nDiferenca => R$ %.2f \n",salario,novoSalario,aumento);
		}else if (cargo == 103){
			aumento = salario*0.3;
			novoSalario = salario + aumento;
			printf("Salario Antigo => R$ %.2f \nNovo Salario => R$ %.2f \nDiferenca => R$ %.2f \n",salario,novoSalario,aumento);
		}
	
}


---------


#include <stdlib.h>
#include <stdio.h>
// 13- Um banco concederá um crédito especial aos seus clientes, variável com o
// saldo médio no último ano. Faça um algoritmo que leia o saldo médio de um
// cliente e calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma
// mensagem informando o saldo médio e o valor do crédito.
// Saldo médio Percentual
// de 0 a 200 nenhum crédito
// de 201 a 400 20% do valor do saldo médio
// de 401 a 600 30% do valor do saldo médio
// acima de 601 40% do valor do saldo médio

int main(){
	float saldo,credito=0;

	printf("Digite o saldo do cliente:");
	scanf("%f", &saldo);
	
	if (saldo >= 601 ){
		credito = 0.4*saldo;
		printf("Saldo => R$ %.2f - Credito liberado => R$ %.2f  ",saldo,credito);
	}else{
		if(saldo >= 0 && saldo <=200){
			printf("Saldo => R$ %.2f - Nenhum Credito Liberado => R$ %.2f  ",saldo,credito);
		}else if (saldo >= 201 && saldo <= 400){
			credito = 0.2*saldo;
			printf("Saldo => R$ %.2f - Credito liberado => R$ %.2f  ",saldo,credito);
		}else if (saldo >= 401 && saldo <=600){
			credito = 0.3*saldo;
			printf("Saldo => R$ %.2f - Credito liberado => R$ %.2f  ",saldo,credito);
		}else{
			printf("Saldo Negativo => R$ %.2f - Nenhum Credito Liberado => R$ %.2f  ",saldo,credito);
		}
	}
}



---------


#include <stdlib.h>
#include <stdio.h>
// 14- Elabore um algoritmo que leia dois números inteiros e mostre o resultado
// da diferença do maior valor pelo menor;

int main(){
	int n1,n2,dif;

	printf("Digite o primeiro numero: ");
	scanf("%d", &n1); 
	
	printf("Digite o segundo numero: ");
	scanf("%d", &n2);
	
	if (n1 == n2 ){
		printf("os numeros sao iguais => %d ", n1);
	}else{
		if(n1 > n2 ){
			dif = n1-n2;
			printf("a diferenca do maior pelo menor => %d ",dif);
		}else if (n2 > n1){
			dif = n2-n1;
			printf("a diferenca do maior pelo menor => %d ",dif);
		}
	}
}



---------


#include <stdlib.h>
#include <stdio.h>
// 	15 - Construa um algoritmo em portugol para determinar a situacao
// 	(APROVADO/EXAME/REPROVADO) de um aluno, dado a sua frequencia (FREQ)
// 	(porcentagem de 0 a 100) e sua nota (NOTA) (nota de 0.0 a 10.0), sendo que:
// 	CONDIÇÃO											SITUACAO
//	FREQUENCIA ATÉ 75% 										REPROVADO
//	FREQUENCIA ENTRE 75% E 100% E NOTA ATÉ 3.0				REPROVADO
//	FREQUENCIA ENTRE 75% E 100% E NOTA DE 3.0 ATÉ 7.0		EXAME
//	FREQUENCIA ENTRE 75% E 100% E NOTA ENTRE 7.0 E 10.0		APROVADO


int main(){
	float nota,freq;
	
	printf("Digite a frequencia do aluno em porcentagem: ");
	scanf("%f", &freq); 
	
	printf("Digite a nota do aluno: ");
	scanf("%f", &nota);
	
	if (freq < 75){
		printf("REPROVADO!\nFREQUENCIA MENOR QUE 75% => %.2f ", freq);
	}else{
		if((freq >= 75 && freq <= 100)){
			if(nota >= 0 && nota < 3){
				printf("REPROVADO!\nNOTA MENOR QUE 3.0 => %.2f | FREQUENCIA => %.2f ", nota,freq);	
			}else if ( nota >= 3 && nota < 7 ){
				printf("EXAME!\nNOTA ENTRE 3.0 e 7.0 => %.2f | FREQUENCIA => %.2f ", nota,freq);	
			}else if (nota >= 7 && nota <= 10){
				printf("APROVADO!\nNOTA ENTRE 7.0 e 10.0 => %.2f | FREQUENCIA => %.2f ", nota,freq);	
			}else{
				printf("NOTA INVALIDA => %.2f | FREQ = > %.2f", nota,freq);	
			}
		}
	}
}


