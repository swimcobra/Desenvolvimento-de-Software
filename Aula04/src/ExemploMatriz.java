public class ExemploMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 3},
            {7, 8 ,9}
        };
        System.err.println("Elementos da Matriz: ");
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
