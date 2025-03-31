/*
Criar uma hierarquia de veículos com comportamentos diferentes para Carro e Moto, herdando de uma classe base Veiculo.

Requisitos:

Criar a classe base Veiculo com os atributos:

String marca
int ano
Método: exibirDados()

Criar a subclasse Carro com o atributo:

int portas
Método: abrirPortas()

Criar a subclasse Moto com o atributo:

boolean temPartidaEletrica
Método: empinar()

No main(), ler os dados com Scanner, instanciar um carro e uma moto e exibir os comportamentos.

Exemplo de saída esperada:

Digite a marca do carro: Toyota
Digite o ano: 2020
Digite o número de portas: 4

Marca: Toyota
Ano: 2020
Este carro tem 4 portas.

Abrindo todas as portas...

Digite a marca da moto: Honda
Digite o ano: 2022
A moto tem partida elétrica? (true/false): true

Marca: Honda
Ano: 2022
A moto tem partida elétrica.

Empinando a moto!
*/
import java.util.Scanner;

class Veiculo{
    String marca;
    int ano;

    void exibirDados(){
        System.out.println("\nMarca: " + marca + "\nAno: " + ano);
    }
}

class Carro extends Veiculo{
    int portas;

    void exibirPortas(){
        System.out.println("Este carro tem " + portas + " portas.");
    }

    void abrirPortas(){
        System.out.println("\n\nAbrindo todas as portas...");
    }
}

class Moto extends Veiculo{
    boolean temPartidaEletrica;

    void exibirPartida(){
        if(temPartidaEletrica){
            System.out.println("A moto tem partida elétrica.");
        } else{
            System.out.println("A moto não tem partida elétrica.");
        }
    }

    void empinar(){
        System.out.println("\n\nEmpinando a moto!");
    }
}

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        Moto moto = new Moto();

        System.out.print("Digite a marca do carro: ");
        carro.marca = scanner.nextLine();
        System.out.print("Digite o ano do carro: ");
        carro.ano = scanner.nextInt();
        System.out.print("Digite o número de portas: ");
        carro.portas = scanner.nextInt();

        carro.exibirDados();
        carro.exibirPortas();
        carro.abrirPortas();

        System.out.println("\n");
        scanner.nextLine();

        System.out.print("Digite a marca da moto: ");
        moto.marca = scanner.nextLine();
        System.out.print("Digite o ano da moto: ");
        moto.ano = scanner.nextInt();
        System.out.print("A moto tem partida elétrica? (true/false): ");
        moto.temPartidaEletrica = scanner.nextBoolean();

        moto.exibirDados();
        moto.exibirPartida();
        moto.empinar();
        System.out.println("\n");

        scanner.close();
    }
}
