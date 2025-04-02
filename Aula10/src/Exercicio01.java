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
    protected int quantidadePassageiros;

    public Transporte(String linha, String motorista, int quantidadePassageiros){
        this.linha = linha;
        this.motorista = motorista;
        this.quantidadePassageiros = quantidadePassageiros;
    }
    void iniciarViagem(){
        System.out.println("Iniciando a viagem da linha " + linha);
    }

    void encerrarViagem(){
        System.out.println("Encerrando a viagem!");
    }

    void exibirDados(){
        System.out.println("\n=== Dados ===");
        System.out.println("\nLinha: " + linha + "\nMotorista: " + motorista + "\nQuantidade de passageiros: " + quantidadePassageiros);
    }
 }

 class Onibus extends Transporte{
    protected boolean articulado;

    public Onibus(String linha, String motorista, int quantidadePassageiros, boolean articulado){
        super(linha, motorista, quantidadePassageiros);
        this.articulado = articulado;
    }

    void abrirPortas(){
        System.out.println("Abrindo as portas.");
    }

    void fecharPortas(){
        System.out.println("Fechando as portas.");
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

    public Metro(String linha, String motorista, int quantidadePassageiros, int numeroVagoes){
        super(linha, motorista, quantidadePassageiros);
        this.numeroVagoes = numeroVagoes;
    }
 }