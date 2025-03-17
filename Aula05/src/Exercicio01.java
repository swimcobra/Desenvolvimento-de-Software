/*Criar uma classe Produto que tenha nome, preço e quantidade. O programa deve permitir que o usuário cadastre um produto e exiba as informações na tela.

Exemplo de Entrada:
Digite o nome do produto: Teclado Mecânico
Digite o preço do produto: 299.99
Digite a quantidade em estoque: 10

Exemplo de Saída:
Produto: Teclado Mecânico
Preço: R$299.99
Quantidade: 10 unidades */

import java.util.Scanner;

class Produto{
    String nome;
    Double preco;
    int quantidade;

    void info(){
        System.out.println("Produto: " + nome + "\nPreço: R$" + preco + "\nQuantidade: " + quantidade + " unidades");
    }
}

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();

        System.out.print("Digite o preço do produto(utilize apenas números e ',' para centavos): ");
        produto.preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        produto.quantidade = scanner.nextInt();

        produto.info();

        scanner.close();
    }
}
