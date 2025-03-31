/*
 * O que é Herança?
 * É o mecanismo da POO que permite uma classe herdar atributos e métodos de outra.
 * Exemplo:
 * Suponha que você tenha uma classe chamada Pessoa.
 * Varias classes como Aluno, Professor tem coisas em comum com Pessoa.
 * Em vez de repetir tudo, essas classes herdam o que Pessoa já tem.
 */


import java.util.Scanner;

class Pessoa{
    String nome;
    int idade;

    void apresentar(){
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos.");
    }
}

class Aluno extends Pessoa{
    String curso;

    void cursar(){
        System.out.println(nome + " está cursando " + curso + ".");
    }
}

class Professor extends Pessoa{
    String disciplina;

    void lecionar(){
        System.out.println(nome + " está lecionando " + disciplina + ".");
    }
}

public class ExemploHeranca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //dados do aluno
        Aluno aluno = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();
        System.out.print("Digite a idade do aluno: ");
        aluno.idade = scanner.nextInt();
        scanner.nextLine(); //limpar o buffer
        System.out.print("Digite o curso do aluno: ");
        aluno.curso = scanner.nextLine();

        System.out.println();
        aluno.apresentar();
        aluno.cursar();

        //dados professor
        Professor professor = new Professor();
        System.out.print("Digite o nome do professor: ");
        professor.nome = scanner.nextLine();
        System.out.print("Digite a idade do professor: ");
        professor.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a disciplina do professor: ");
        professor.disciplina = scanner.nextLine();

        System.out.println();
        professor.apresentar();
        professor.lecionar();

        scanner.close();
    }
}
