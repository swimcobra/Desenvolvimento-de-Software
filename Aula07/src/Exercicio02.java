/*Exercício: Sistema de Conta Bancária

Criar uma classe ContaBancaria que represente uma conta simples com as seguintes funcionalidades:
Cadastrar cliente com nome e número da conta.
Consultar saldo.
Realizar depósito.
Realizar saque com verificação de saldo.
Mostrar dados da conta.

Exemplo da Tela do Programa:

Nome do titular: Lucas
Número da conta: 1234

=== Menu ===
1 - Consultar saldo
2 - Depositar
3 - Sacar
4 - Exibir dados da conta
5 - Sair
Escolha uma opção: 2
Valor para depósito: 1000
Depósito de R$1000.0 realizado com sucesso! */

import java.util.Scanner;

class ContaBancaria{
    private String cliente;
    private int numeroConta;
    private int saldo;

    //GET
    public String getCliente(){
        return cliente;
    }

    public int getConta(){
        return numeroConta;
    }

    public int getSaldo(){
        return saldo;
    }

    //SET
    public void setCliente(String novoCliente){
        cliente = novoCliente;
    }

    public void setConta(int novaConta){
        numeroConta = novaConta;
    }

    public void setSaldo(int novoSaldo){
        if(novoSaldo >= 0){
            saldo = novoSaldo;
        } else{
            System.out.println("Valor inválido");
        }
    }
}

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();

        System.out.print("Digite seu nome: ");
        conta1.setCliente(scanner.next());

        conta1.setConta(1234);
        conta1.setSaldo(0);

        int comando = 0;

        do{
            System.out.println("\n==MENU==");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Exibir dados da conta");
            System.out.println("5 - Sair");
            System.out.print("\nO que deseja fazer?  ");
            comando = scanner.nextInt();

            switch (comando) {
                case 1:
                    System.out.println("\nSaldo: " + conta1.getSaldo());
                    break;
                case 2:
                    System.out.print("Informe o valor que deseja depositar: ");
                    conta1.setSaldo(conta1.getSaldo() + scanner.nextInt());
                    System.out.println("\nDepósito Realizado!");
                    break;
                case 3:
                    System.out.print("Informe o valor que deseja sacar: ");
                    int scannerInt = scanner.nextInt();
                    if(scannerInt <= conta1.getSaldo()){
                        conta1.setSaldo(conta1.getSaldo() - scannerInt);
                        System.out.println("\nSaque Realizado!");
                    } else{
                        System.out.println("\nValor inválido!");
                    }
                    break;
                case 4:
                    System.out.println("\nNome do Títular: " + conta1.getCliente() + "\nNúmero da conta: " + conta1.getConta());
                    break;
                case 5:
                    System.out.println("\nEncerrando Programa...");
                    break;
                default:
                    System.out.println("Número Inválido!");
                    break;
            }
        } while(comando != 5);

        System.out.println("\nPrograma Encerrado!");
        
        scanner.close();
    }
}
