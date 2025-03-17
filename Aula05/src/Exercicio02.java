/*Criar uma classe Aluno para armazenar nome, nota 1 e nota 2. O programa deve calcular a média do aluno e informar se ele foi aprovado ou reprovado (nota mínima 7.0).

Exemplo de Entrada:
Digite o nome do aluno: Maria
Digite a primeira nota: 8.5
Digite a segunda nota: 6.0

Exemplo de Saída:
Aluno: Maria
Média: 7.25
Status: Aprovado */

import java.util.Scanner;

class Aluno{
    String nome;
    double nota1;
    double nota2;

    void aprovado(){
        double media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Nome: " + nome + "\nMédia: " + media + "\nStatus: Aprovado");
        }
        else{
            System.out.println("Nome: " + nome + "\nMédia: " + media + "\nStatus: Reprovado");
        }
    }
}

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();
        
        System.out.print("Digite a primeira nota(use vírgula para decimal): ");
        aluno.nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        aluno.nota2 = scanner.nextDouble();

        aluno.aprovado();

        scanner.close();
    }
}
