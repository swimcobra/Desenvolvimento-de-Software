import java.util.Scanner;

// ====================================
// Classe Principal: SistemaLogin.java
// ====================================

public class SistemaLogin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando os objetos com o tipo de interface (polimorfismo)
        Autenticavel adm = new Administrador("Fernanda");
        Autenticavel cli = new Cliente("João");

        // Entrada de dados para o Administrador
        System.out.println("=== LOGIN ADMINISTRADOR ===");
        System.out.print("Usuário: ");
        String usuarioAdm = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaAdm = scanner.nextLine();
        // Chama o método de autenticação - comportamento específico de Administrador
        adm.autenticar(usuarioAdm, senhaAdm);

        // Entrada de dados para o Cliente
        System.out.println("=== LOGIN CLIENTE ===");
        System.out.print("Usuário: ");
        String usuarioCli = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaCli = scanner.nextLine();
        // Chama o método de autenticação - comportamento específico de Cliente
        cli.autenticar(usuarioCli, senhaCli);

        scanner.close();
    }
}