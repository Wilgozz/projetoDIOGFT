//Tipos de Triângulos (vale 2 pontos)
//        Determine se um triângulo é equilátero, isósceles ou escaleno.
//        Um triângulo equilátero tem os três lados com o mesmo comprimento.
//        Um triângulo isósceles tem pelo menos dois lados com o mesmo
//        comprimento.
//        Um triângulo escaleno tem todos os lados de comprimentos diferentes.
//        Considere também que só irá existir um triângulo se, e somente se, os
//        seus lados obedeceram à seguinte regra: um de seus lados deve ser maior
//        que o valor absoluto (módulo) da diferença dos outros dois lados e menor
//        que a soma dos outros dois lados.

package ex2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner valorTriangulo = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int C = 0;

        System.out.print("Insira o primeiro lado do triângulo: ");
        A = valorTriangulo.nextInt();

        System.out.print("Insira o segundo lado do triângulo: ");
        B = valorTriangulo.nextInt();

        System.out.print("Insira o terceiro lado do triângulo:");
        C = valorTriangulo.nextInt();


        if( A < B + C && B < A + C && C < A + B ){

            if(A==B && B == C){ //se os lados forem A==B e se B==C (todos os lados iguais)
                System.out.print("Com os valores inseridos, constatamos que seu triângulo é: Equilatero :D ");

            }else if(A==B || A==C || B==C){ //aqui se A==B || A==C ||B==C, (dois lados iguais e somente um diferente)
                System.out.print("Com os valores inseridos, constatamos que seu triângulo é: Isósceles :D");

            }else{ //se o triângulo possuir medidas que não são semelhantes (nenhum lado possui o mesmo valor)
                System.out.print("Com os valores inseridos, constatamos que seu triângulo é: Escaleno :D");
            }
        }else{ //se as medidas não coincidirem com um triângulo, então
            System.out.print("Ops. Algo deu errado! Insira um valor válido :D ");
        }
    }
}
