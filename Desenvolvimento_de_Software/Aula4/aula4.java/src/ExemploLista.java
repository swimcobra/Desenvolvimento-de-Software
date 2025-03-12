import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        //criando uma lista de nomes
        List<String> nomes = new ArrayList<>();
        //List<String> -> interface que define uma lista de strings
        //nomes -> nome da váriavel 
        //new ArrayList<>() -> criação de uma nova lista dinâmica
                            //que pode crescer ou diminuir de tamanho

        //adicionando elementos na lista
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Diana");

        //exibindo elementos da lista
        System.out.println("Lista de nomes: ");
        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
