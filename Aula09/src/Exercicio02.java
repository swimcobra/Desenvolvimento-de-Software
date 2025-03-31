/*
Criar um sistema de cadastro para funcionários de uma empresa. A classe base será Funcionario, e haverá duas subclasses: Gerente e Assistente. Cada uma terá características e comportamentos próprios.

Requisitos:

Criar a classe base Funcionario com:

String nome
double salario
Método exibirDados() que mostra nome e salário

Criar a subclasse Gerente com:

double bonus
Método calcularSalarioTotal() que soma salário + bônus

Criar a subclasse Assistente com:

String turno (manhã, tarde ou noite)
Método mostrarTurno()

No main(), criar um gerente e um assistente com dados digitados pelo usuário e exibir suas informações.

Exemplo de saída esperada:

=== Cadastro do Gerente ===

Nome: Roberto
Salário base: 5000
Bônus: 1200

Funcionário: Roberto
Salário base: R$5000.0
Salário total com bônus: R$6200.0

=== Cadastro do Assistente ===

Nome: Ana
Salário base: 2500
Turno: noite

Funcionário: Ana
Salário base: R$2500.0
Turno de trabalho: noite
 */

 import java.util.Scanner;

 class Funcionario{
    String nome;
    double salario;

    void exibirDados(){
        System.out.println("\nFuncionário: " + nome + "\nSalário base: " + salario);
    }
 }
 
 class Gerente extends Funcionario{
    double bonus;
    double salarioTotal;

    void calcularSalarioTotal(){
        salarioTotal = salario + bonus;
    }

    void exibirSalarioTotal(){
        System.out.println("Salário total com bônus: " + salarioTotal);
    }
}

class Assistente extends Funcionario{
    String turno;

    void mostrarTurno(){
        System.out.println("Turno de trabalho: " + turno);
    }
}

 public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Assistente assistente = new Assistente();

        System.out.println("=== Cadastro de Gerente ===");
        System.out.print("\nNome: ");
        gerente.nome = scanner.nextLine();
        System.out.print("Salário: ");
        gerente.salario = scanner.nextDouble();
        System.out.print("Bônus: ");
        gerente.bonus = scanner.nextDouble();

        gerente.exibirDados();
        gerente.calcularSalarioTotal();
        gerente.exibirSalarioTotal();

        scanner.nextLine();

        System.out.println("\n=== Cadastro de Assistente ===");
        System.out.print("\nNome: ");
        assistente.nome = scanner.nextLine();
        System.out.print("Salário: ");
        assistente.salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Turno: ");
        assistente.turno = scanner.nextLine();

        assistente.exibirDados();
        assistente.mostrarTurno();
        System.out.println("\n");

        scanner.close();
    }
 }