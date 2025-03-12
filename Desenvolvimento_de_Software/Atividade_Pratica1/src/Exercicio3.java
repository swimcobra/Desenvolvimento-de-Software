// Peça ao usuário para digitar 10 números inteiros e armazene-os em uma ArrayList. Em seguida, exiba o maior e o menor número digitado.
//Saída Esperada:
//Maior número: 45
//Menor número: 3

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        //recebe os imputs do usuário e coloca eles em uma lista
        for (int i = 0; i <= 9; i++){
            System.out.print("Digite o " + (i + 1) + "° número: ");
            int num = scanner.nextInt();
            nums.add(num);
        } 

        //declara as variáveis maior e menor com o valor sendo o primeiro número do array para compar com os outros
        int maior = nums.get(0);
        int menor = nums.get(0);

        //compara os números da lista com o número maior e menor e os atribui de acordo
        for(int num : nums){
            if(num >= maior){
                maior = num;
            }
            else if(num <= menor){
                menor = num;
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
    
}
