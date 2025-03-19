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

class Carros{
    String modelo;
    boolean ligado = false;
    int velocidade = 0;

    void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("O carro foi ligado!");
        }
        else{
            System.out.println("O carro já está ligado");
        }
    }

    void desligar(){
        if(ligado){
            if(velocidade == 0){
                ligado = false;
                System.out.println("O carro foi desligado!");
            }
            else{
                System.out.println("O carro ainda está em movimento!");
            }
        }
        else{
            System.out.println("O carro já está desligado!");
        }
    }

    void acelerar(){
        if(ligado){
            if(velocidade < 220){
                velocidade += 20;
                System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
            }
            else{
                System.out.println("O carro está no limite!");
            }
        }
        else{
            System.out.println("O carro está desligado!");
        }
    }

    void desacelerar(){
        if(velocidade > 0){
            velocidade -= 20;
            System.out.println("Desacelerando... Velocidade atual: " + velocidade + " km/h");
        }
        else{
            System.out.println("O carro já está parado!");
        }
    }
}

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carros carro = new Carros();

        System.out.print("Digite o modelo do carro: ");
        carro.modelo = scanner.nextLine();

        String comandos = "";

        do{
            System.out.println("=====Instruções=====");
            System.out.println("1. Digite L para ligar");
            System.out.println("2. Digite D para desligar (só desliga se a velocidade dor 0)");
            System.out.println("3. Digite A para acelerar");
            System.out.println("4. Digite R para desacelerar");
            System.out.println("5. Digite E para encerrar o programa\n");
            System.out.println("Modelo do carro: " + carro.modelo);
            System.out.print("\nO que deseja fazer? ");
            comandos = scanner.next().toUpperCase();
            scanner.nextLine();
            
            switch (comandos) {
                case "L":
                    System.out.println(" ");
                    carro.ligar();
                    System.out.println(" ");
                    break;
                case "D":
                    System.out.println(" ");
                    carro.desligar();
                    System.out.println(" ");
                    break;
                case "A":
                    System.out.println(" ");
                    carro.acelerar();
                    System.out.println(" ");
                    break;
                case "R":
                    System.out.println(" ");
                    carro.desacelerar();
                    System.out.println(" ");
                    break;
                default:
                        System.out.println("\nDigite um comando válido\n");
            }
        } while(!comandos.equals("E"));

        System.out.println("Deconsiderar mensagem acima. O Programa foi encerrado!\n");
        scanner.close();
    }
}
