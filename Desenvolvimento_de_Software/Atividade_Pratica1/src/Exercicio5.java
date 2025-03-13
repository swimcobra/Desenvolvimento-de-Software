//Crie uma matriz 3x3 preenchida pelo usuário e exiba os valores formatados.
//Saída Esperada:
//Matriz inserida:
//1 2 3
//4 5 6
//7 8 9

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mat = new int[3][3];

        //recebe os inputs do usuário
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                System.out.print("Digite o número de indíce " + i + " " + j + ": ");
                mat[i][j] = scanner.nextInt();
            }
        }

        //mostra a matriz
        System.out.println("Matriz Inserida: ");
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); //quebra de linha da matriz
        }

        scanner.close();
    }
}
