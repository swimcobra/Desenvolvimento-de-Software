//Crie um programa que leia 5 notas de um aluno, calcule a média e exiba se o aluno foi Aprovado (>=7.0) ou Reprovado (<7.0).
//Saída Esperada:
//Média: 7.24
//Situação: Aprovado

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //define o vetor para armazenar as notas e a váriavel para a média
        int notas[] = new int[5];
        double media = 0;
        
        //armazena os inputs do usuário no vetor e adiciona esses valores na soma da média
        for(int i = 0; i <= 4; i++){
            System.out.print("Digite sua " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextInt();
            media += notas[i];
        }
        //dvide a soma das notas por 5 para saber a média
        media /= 5;

        System.out.println("Média: " + media);

        //vê se a média é igual ou maior que 7 para ser aprovado, caso contrário é reprovado
        if(media >= 7){
            System.out.println("Situação: Aprovado");
        }
        else{
            System.out.println("Situação: Reprovado");
        }
        scanner.close();
    }
}
