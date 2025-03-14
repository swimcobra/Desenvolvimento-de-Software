import java.util.Scanner;
public class OperadoresLogicos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite true ou false para A: ");
        boolean a = scanner.nextBoolean();

        System.out.print("Digite true ou false para B: ");
        boolean b = scanner.nextBoolean();

        boolean and = a && b;
        boolean or = a || b;
        boolean notA = !a;
        boolean notB = !b;

        System.out.println("\n=== Resultados ===");
        System.out.println("A AND B = " + and);
        System.out.println("A OR B = " + or);
        System.out.println("NOT A = " + notA);
        System.out.println("NOT B = " + notB);

        scanner.close();
    }
}