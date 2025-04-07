/*
 * POLIMORFISMO
 * Polimorfismo significa literalmente "muitas formas".
 * Um mesmo método pode ter comportamentos diferentes, dependendo do objeto que o chama.
 */

import java.util.Scanner;
import java.util.ArrayList;

class Pessoa{
    protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void apresentar(){
        System.out.println("Olá, sou uma pessoa genérica.");
    }
}

class Aluno extends Pessoa{
    public Aluno(String nome){
        super(nome);
    }

    @Override
    public void apresentar(){
        System.out.println("Olá, sou o aluno " + nome + ".");
    }
}

class Professor extends Pessoa{
    public Professor(String nome){
        super(nome);
    }

    @Override
    public void apresentar(){
        System.out.println("Olá, sou o professor " + nome + ".");
    }
}

public class SistemaPessoas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int opcao;
        
        do{
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Exibir Apresentações");
            System.out.println("4 - Mostrar total de alunos e professores");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    pessoas.add(new Aluno(nomeAluno));
                    System.out.println("Aluno Cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do professor: ");
                    String nomeProf = scanner.nextLine();
                    pessoas.add(new Professor(nomeProf));
                    System.out.println("Professor cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.println("\n=== APRESENTAÇÕES ===");
                    for(Pessoa p: pessoas){
                        p.apresentar(); //Polimorfismo em ação
                    }
                    break;
                case 4:
                    int totalAlunos = 0;
                    int totalProfessores = 0;
                    for(Pessoa p: pessoas){
                        //instanceof é usado para verificar se um objeto é de um tipo específico ou uma subclasse dele
                        if(p instanceof Aluno){
                            totalAlunos++;
                        } else if(p instanceof Professor){
                            totalProfessores++;
                        }
                    }
                    System.out.println("Total de Alunos: " + totalAlunos);
                    System.out.println("Total de Professores: " + totalProfessores);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(opcao != 5);
        scanner.close();
    }
}