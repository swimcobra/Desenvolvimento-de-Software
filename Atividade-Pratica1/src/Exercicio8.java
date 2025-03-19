//Crie um método chamado contarVogais(String palavra) que recebe uma palavra e retorna a quantidade de vogais (a, e, i, o, u) nela.
//Exemplo de Entrada:
//Digite uma palavra: programacao
//Saída Esperada:
//A palavra contém 5 vogais.

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra desejada: ");
        String palavra = scanner.next();

        contarVogais(palavra);

        scanner.close();
    }   
    
    public static void contarVogais(String palavra) {
        palavra = palavra.toLowerCase();
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int quantVogais = 0;
        char[] palavraArray = palavra.toCharArray();
        
        for(int i = 0; i < palavra.length(); i++){
            for(int j = 0; j < 5; j++){
                if(vogais[j] == palavraArray[i]){
                    quantVogais += 1;
                }
            }
        }

        System.out.println("A palavra contém " + quantVogais + " vogais.");
    }
}
