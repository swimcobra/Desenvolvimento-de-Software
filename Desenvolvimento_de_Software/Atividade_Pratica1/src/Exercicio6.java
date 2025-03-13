// Crie um método chamado exibirTabuada(int numero) que recebe um número como parâmetro e exibe sua tabuada de 1 a 10.
//Saída Esperada:
//Tabuada de 7:
//7 x 1 = 7
//7 x 2 = 14
//...
//7 x 10 = 70

public class Exercicio6 {
    public static void main(String[] args) {
        //chama o método
        exibirTabuada(7);
    }

    public static void exibirTabuada(int numero){
        for(int i = 0; i < 10; i++){
            System.out.println(numero + " X " + (i + 1) + " = " + (numero * (i + 1)));
        }
    }
}
