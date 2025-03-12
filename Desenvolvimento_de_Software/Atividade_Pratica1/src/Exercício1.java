// Crie um programa que receba 5 números inteiros do usuário, armazene em um vetor e exiba a soma de todos os valores.
//Saída Esperada:
//A soma dos números é: 25

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i <= 4; i++){
            System.out.print("Digite o " + (i + 1) + "° número: ");
            int num = scanner.nextInt();
            nums.add(num);
        }
        int soma = 0;
        for (int num : nums){
            soma += num;
        }

        System.out.println("A soma dos números é: " + soma);
        scanner.close();
    }
}
