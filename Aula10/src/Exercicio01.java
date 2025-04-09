/*
 Sistema de Transporte Urbano

Objetivo:

Simular um sistema de cadastro e controle de veículos urbanos, com uma classe base Transporte, e subclasses como Onibus e Metro.

Classe base: Transporte

Atributos linha, motorista, quantidadePassageiros (protected)
Construtor que inicializa todos os atributos
Método iniciarViagem()
Método encerrarViagem()
Método exibirDados()

Subclasse 1: Onibus

Atributo tipo (ex: "articulado", "micro-ônibus")
Método abrirPortas()
Método fecharPortas()
Sobrescreve exibirDados() com @Override, chamando super.exibirDados() e adicionando o tipo

Subclasse 2: Metro

Atributo numeroVagoes
Método embarcarPassageiros(int quantidade)
Método desembarcarPassageiros(int quantidade)
Sobrescreve exibirDados() com @Override, mostrando número de vagões


No main():

Criar um menu com opções:
Cadastrar ônibus
Cadastrar metrô
Iniciar viagem
Exibir dados do transporte
Encerrar viagem
Sair
Permitir o uso de métodos específicos de cada classe


Desafio extra (avançado):

Adicionar uma opção no menu para aumentar ou reduzir o número de passageiros com regras diferentes para ônibus e metrô.
Adicionar verificação de lotação máxima.
 */

 import java.util.Scanner;

 class Transporte{
    protected String linha;
    protected String motorista;
    protected int quantidadePassageiros = 0;
    protected boolean porta = false;
    protected int lotação;

    public Transporte(String linha, String motorista){
        this.linha = linha;
        this.motorista = motorista;
    }
    void iniciarViagem(){
        System.out.println("Iniciando a viagem da linha " + linha);
    }

    void encerrarViagem(){
        if(quantidadePassageiros == 0){
            System.out.println("Encerrando a viagem.");
        } else{
            System.out.println("Necessário desembarcar todos os passageiros antes de encerrar a viagem.");
        }
    }

    void exibirDados(){
        System.out.println("\n=== Dados ===");
        System.out.println("\nLinha: " + linha + "\nMotorista: " + motorista + "\nQuantidade de passageiros: " + quantidadePassageiros + "/" +lotação);
    }

    void abrirPortas(){
        if(!porta){
            porta = true;
            System.out.println("Abrindo as portas.");
        } else{
            System.out.println("AVISO: As portas já estão abertas.");
        }
    }

    void fecharPortas(){
        if(porta){
            porta = false;
            System.out.println("Fechando as portas.");
        } else{
            System.out.println("AVISO: As portas já estão fechadas.");
        }
    }

    void embarcarPassageiros(int quantidade){
        if(porta){
            if(quantidade + quantidadePassageiros <= lotação){
                System.out.println(quantidade + " passageiros embarcados.");
                quantidadePassageiros += quantidade;
            } else{
                int quantTemp = lotação - quantidade;
                quantTemp *= -1;
                System.out.println("Lotação máxima! Apenas " + ((quantidade - quantTemp) - quantidadePassageiros)  + " passageiros conseguiram embarcar.");
                quantidadePassageiros = (quantidade - quantTemp);
            }
        } else{
            System.out.println("AVISO: Portas fechadas! É necessário que estejam abertas para o embarque de passageiros!");
        }
    }

    void desembarcarPassageiros(int quantidade){
        if(porta){
            if(quantidadePassageiros > 1){
                if(quantidade <= quantidadePassageiros){
                System.out.println("Desembarcando " + quantidade + " passageiros.");
                quantidadePassageiros -= quantidade;
                } else{
                    System.out.println("O veículo não possui essa quantidade de passageiros nas suas dependências. Desembarcando todos os passageiros de suas dependências.");
                    quantidadePassageiros = 0;
                }
            } else{
                System.out.println("O veiculo está vazio.");
            }
        } else{
            System.out.println("AVISO: Portas fechadas! É necessário que estejam abertas para o desembarque de passageiros!");
        }
    }
 }

 class Onibus extends Transporte{
    protected boolean articulado;

    public Onibus(String linha, String motorista, boolean articulado){
        super(linha, motorista);
        this.articulado = articulado;
        if(articulado){
            this.lotação = 80;
        } else{
            this.lotação = 40;
        }
    }

    @Override
    void exibirDados(){
        super.exibirDados();
        if(articulado){
            System.out.println("Tipo: Articulado");
        } else{
            System.out.println("Tipo: Micro-Ônibus");
        }
    }
 }

 class Metro extends Transporte{
    int numeroVagoes;

    public Metro(String linha, String motorista, int numeroVagoes){
        super(linha, motorista);
        this.numeroVagoes = numeroVagoes;
        this.lotação = numeroVagoes * 60;
        }
        
    @Override
    void exibirDados(){
    super.exibirDados();
    System.out.println("Número de vagões: " + numeroVagoes);
    }
 }

 public class Exercicio01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        do{
            System.out.print("Digite 1 para cadastrar um ônibus e 2 para cadastrar um metrô: ");
            escolha = scanner.nextInt();
            if(escolha != 1 && escolha != 2){
                System.out.print("Número fora dos parâmetros, favor digitar corretamente.");
            }
        } while(escolha != 1 && escolha != 2);

        if(escolha == 1){
            System.out.print("Digite o nome da linha: ");
            String linha = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Digite o nome do motorista: ");
            String motorista = scanner.nextLine();

            System.out.print("Digite 'true' se o ônibus for articulado e 'false' se não for: ");
            boolean articulado = scanner.nextBoolean();

            Onibus onibus = new Onibus(linha, motorista, articulado);
            int comandos = 0;

            do{
                System.out.println("\n=== Instruções ===");
                System.out.println("1. Exibir dados\n2. Iniciar viagem\n3. Abrir as portas\n4. Fechar as portas\n5. Embarcar passageiros\n6. Desembarcar passageiros\n7. Encerrar viagem\n8. Encerrar");
                System.out.println("O que deseja fazer? ");
                comandos = scanner.nextInt();

                switch (comandos) {
                    case 1:
                        onibus.exibirDados();
                        break;
                    case 2:
                        onibus.iniciarViagem();
                        break;
                    case 3:
                        onibus.abrirPortas();
                        break;
                    case 4:
                        onibus.fecharPortas();
                        break;
                    case 5:
                        System.out.print("Digite a quantidade de passageiros para o embarque: ");
                        int quantidade = scanner.nextInt();
                        onibus.embarcarPassageiros(quantidade);
                        break;
                    case 6:
                        System.out.print("Digite a quantidade de passageiros para o desembarque: ");
                        quantidade = scanner.nextInt();
                        onibus.desembarcarPassageiros(quantidade);
                        break;
                    case 7:
                        onibus.encerrarViagem();
                        break;
                    case 8:
                        System.out.println("Encerrando programa...");
                        break;
                    default:
                        System.out.println("Digite um número válido.");
                        break;
                }
            } while(comandos != 8);
            System.out.println("\nPrograma Encerrado!");
        }
    }
 }