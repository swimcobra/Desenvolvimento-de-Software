import java.util.Scanner;

class Pessoa{
    //Protected: acessíveis pelas subclasses diretamente
    protected String nome;
    protected int idade;

    //Construtor que inicializa o nome e a idade
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Método comum que será herdado e possivelmente sobrescrito
    public void apresentar(){
        System.out.println("Sou " + nome + ", tenho " + idade + " anos");
    }
}

//Funcionario herda de Pessoa(superClasse)
class Funcionario extends Pessoa{
    protected double salario;

    //Construtor da subclasse chama o construtor da superClasse com super()
    public Funcionario(String nome, int idade, double salario){
        super(nome, idade); //super: chama o construtor da classe mãe(Pessoa)
        this.salario = salario;
    }

    //Sobrescrita de método: altera o comportamento de apresentar()
    @Override
    public void apresentar(){
        super.apresentar();
        System.out.println("Sou um funcionário e meu salário é R$" + salario);
    }
}

//Gerente herda de Funcionario, que herda de Pessoa (herança em cadeia)

class Gerente extends Funcionario{
    private String setor;

    //Construtor que também chama o construtor de superClasse Funcionario
    public Gerente(String nome, int idade, double salario, String setor){
        super(nome, idade, salario); //Chamada em cadeia: Gerente -> Funcionario -> Pessoa
        this.setor = setor;
    }

    //Sobrescrita novamente do método apresentar()
    @Override
    public void apresentar(){
        super.apresentar(); //Chama apresentar() de Funcionario
        System.out.println("Atuo como gerente do setor de " + setor);
    }
}

public class ExemploHerancaEmCadeia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados para criar o objeto Gerente
        System.out.print("Digite o nome do gerente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        scanner.nextLine(); //Limpar o buffer do teclado

        System.out.print("Digite o setor: ");
        String setor = scanner.nextLine();

        //Instancia um objeto de subclasse Gerente
        Gerente gerente = new Gerente(nome, idade, salario, setor);

        System.out.println("\n=== Apresentação ===");

        //chama o método apresentar() da classe Gerente
        gerente.apresentar();
        
        scanner.close();
    }
}