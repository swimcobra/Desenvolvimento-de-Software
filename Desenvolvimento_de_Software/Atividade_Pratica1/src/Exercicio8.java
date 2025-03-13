//Crie um método chamado contarVogais(String palavra) que recebe uma palavra e retorna a quantidade de vogais (a, e, i, o, u) nela.
//Exemplo de Entrada:
//Digite uma palavra: programacao
//Saída Esperada:
//A palavra contém 5 vogais.

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        
    }   
    
    public static void contarVogais(String palavra) {
        palavra = palavra.toLowerCase();
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int quantVogais = 0;
        char[] palavraArray = palavra.toCharArray();
        
        for(int i = 0; i <= palavra.length(); i++){
            for(int j = 0; j <= vogais.length(); j++){
                if(vogais[j] == palavraArray[i]){

                }
            }
        }
    }
}
