import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>();

        // Adicionando elementos
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        // Tentando adicionar uma cor já existente
        cores.add("Azul"); // Não será adicionado

        // Mostrando o conjunto
        System.out.println("Cores: "); // Ele irá mostrar na tela as cores em uma ordem diferente da ordem de adição, pois o HashSet 
        for(String cor : cores) { // organiza os elementos de acordo com os Hashes (Para manter a ordem, o correto seria utilizar um LinkedHashSet<>())
            System.out.println(cor);
        }
        // Verificando se contém uma cor
        if(cores.contains("Verde")) {
            System.out.println("Contém a cor verde");
        }

        // Removendo uma cor
        cores.remove("Amarelo");

        // Tamanho do conjunto
        System.out.println("Tamanho do conjunto cores: " + cores.size());

        }
    }