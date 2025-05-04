// COLEÇÕES: o que são coleções?
// Coleções sao estruturas que armazenam grupos de objetos - como listas, conjuntos, mapas,
// filas, etc.
// O java oferece o FraneWork de coleções (java.util), que traz várias interfaces e classes
// prontas para:
// - Armazenas dados de forma flexivel
// - Percorrer os dados:
// - Ordenar, buscar, adicionar e remover elementos com facilidade:
// PRINCIPAIS TIPOS DE COLEÇÕES
// List - ArrayList, LinkedList    - Lista ordenada (Aceita elementos repetidos)
// Set  - HashSet, TreeSet         - Conjunto (não aceita elementos repetidos)
// Map  - HashMap, TreeMap         - Pares Chave-valor (ex: CPF -> nome)

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        // Criação de Lista
        List<String> nomes = new ArrayList<>();

        // Adicionando elementos a lista
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        // Acessando elementos pelo indice
        System.out.println("Primeiro nome: " + nomes.get(0));

        // Percorrendo a lista
        System.out.println("Todos os nomes: ");
        for(String nome : nomes) {
            System.out.println(nome);
        }
        // Verificando o tamanho da lista
        System.out.println("Tamanho da lista " + nomes.size());

        // Removendo um elemento
        nomes.remove("Ana");

        System.out.println("Nomes após remoção: ");
        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}