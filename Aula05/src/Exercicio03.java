/*Criar uma classe Carro onde o usuário pode ligar, desligar e acelerar o carro.

Requisitos:

Criar a classe Carro com os atributos:
String modelo
boolean ligado (inicia como false)
int velocidade (inicia em 0)

Criar métodos para:
ligar() → Define ligado = true
desligar() → Define ligado = false, mas só se a velocidade for 0
acelerar() → Aumenta a velocidade somente se o carro estiver ligado
No main(), permitir que o usuário ligue o carro e acelere.


Exemplo de Entrada e Saída:
Modelo do carro: Ferrari
O carro foi ligado!
Acelerando... Velocidade atual: 20 km/h
Acelerando... Velocidade atual: 40 km/h
O carro foi desligado! */

import java.util.Scanner;

class Carro{
    String modelo;
    boolean ligado = false;
    int velocidade = 0;

    void ligar(){
        ligado = true;
        System.out.println("O carro foi ligado!");
    }

    void desligar(){
        if(velocidade == 0){
            ligado = false;
            System.out.println("O carro foi desligado!");
        }

    }

    void acelerar(){
        velocidade += 20;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }

    void desacelerar(){
        velocidade -= 20;
        System.out.println("Desacelerando... Velocidade atual: " + velocidade + " km/h");
    }
}

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.print("Digite o modelo do carro: ");
        carro.modelo = scanner.nextLine();

        System.out.println("=====Instruções=====");
        System.out.println("1. Digite L para ligar");
        System.out.println("2. Digite D para desligar (só desliga se a velocidade dor 0)");
        System.out.println("3. Digite A para acelerar");
        System.out.println("4. Digite R para desacelerar");
        System.out.println("5. Digite E para encerrar o programa");

        String comandos = "Z";

        while(!comandos.equals("E")){
            System.out.print("O que deseja fazer?");
            comandos = scanner.next();

            comandos.toUpperCase();
            
            switch (comandos) {
                case "L":
                    carro.ligar();
                    System.out.print("Comando: ");
                    comandos = scanner.next();
                    break;
                case "D":
                    carro.desligar();
                    System.out.print("Comando: ");
                    comandos = scanner.next();
                    break;
                case "A":
                    carro.acelerar();
                    System.out.print("Comando: ");
                    comandos = scanner.next();
                    break;
                case "R":
                    carro.desacelerar();
                    System.out.print("Comando: ");
                    comandos = scanner.next();
                    break;
                default:
                    System.out.print("Digite um comando válido: ");
                    comandos = scanner.next();
                    break;
            }
        }
        scanner.close();
    }
}
