public class Operadores {

    public static void main(String[] args) {
        
        /*Atribuição
Representado pelo símbolo de igualdade =.

O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. 
em Java definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição. 
Exemplos abaixo:
*/

//classe Operadores.java
String nome = "GLEYSON";
int idade = 22;
double peso = 68.5;
char sexo = 'M';
boolean doadorOrgao = false;
//Date dataNascimento = new Date();


/*Aritméticos
O operador aritmético é utilizado para realizar operações matemáticas entre valores numéricos, 
podendo se tornar ou não uma expressão mais complexa.

Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).
*/

//classe Operadores.java
double soma = 10.5 + 15.7;
int subtração = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20/4);

//ATENÇÃO! O operador de adição (+), 
//quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.

//classe Operadores.java
String nomeCompleto = "LINGUAGEM" + "JAVA";
		
//qual o resultado das expressoes abaixo?
String concatenacao ="?"; 
        System.out.println(concatenacao);

concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);


/*
Saída:

?
31
1111
1111
1111
13

 A regra é:

Se começar com números, faz operação matemática até encontrar uma string

Depois de encontrar uma string, tudo vira concatenação

Parênteses têm precedência e são calculados primeiro
 */
    }

}
