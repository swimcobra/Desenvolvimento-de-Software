// Um map é uma estrutura que armazena pares de chaves e valor
// Cada chave é unica (não pode se repetir)
// Pode ser pensado como um dicionario

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        // Criando um Map onde a chave é a String nome e o valor é o int idade
        HashMap<String, Integer> pessoas = new HashMap<>();

        // Adicionando Elementos
        pessoas.put("Ana", 25);
        pessoas.put("Bruno", 30);
        pessoas.put("Carlos", 20);
        // Atualizando a idade associada à chave "Ana"
        pessoas.put("Ana", 26);

        // Mostrando o Map
        System.out.println("Lista de pessoas: ");
        for(String nome : pessoas.keySet()){
            Integer idade = pessoas.get(nome);
            System.out.println("Nome: " + nome + " Idade: " + idade);
        }
        // Verificando se uma pessoa esta no Map
        if(pessoas.containsKey("Carlos")){
            System.out.println("Carlos está Cadastrado");
        }
        // Removendo uma pessoa
        pessoas.remove("Bruno");

        // Mostrando o Tamanho do  Map
        System.out.println("Quantidade de pessoas cadrastadas: " + pessoas.size());

    }
}