import java.util.Scanner;
import java.util.ArrayList;

abstract class Veiculo{
    int id;
    String marca;
    int ano;
    boolean portas = false;
    int capacidadePassageiros;
    int quantidadePassageiros;

    public abstract void exibirDados();
    
    public void abrirPortas(){
        if(!portas){
            System.out.println("Abrindo Portas...\n...\n...\n...\nPortas Abertas!");
            portas = true;
        } else{
            System.out.println("As portas já se encontram abertas!");
        }
    }

    public void fecharPortas(){
        if(portas){
            System.out.println("Fechando Portas...\n...\n...\n...\nPortas Fechadas!");
            portas = false;
        } else{
            System.out.println("As portas já se encontram fechadas!");
        }
    }

    public void embarcarPassageiros(int quantidade){
        if(portas){
            if(quantidade + quantidadePassageiros <= capacidadePassageiros){
                System.out.println(quantidade + " passageiros embarcados.");
                quantidadePassageiros += quantidade;
            } else{
                int quantTemp = capacidadePassageiros - quantidade;
                quantTemp *= -1;
                System.out.println("Lotação máxima! Apenas " + ((quantidade - quantTemp) - quantidadePassageiros)  + " passageiros conseguiram embarcar.");
                quantidadePassageiros = (quantidade - quantTemp);
            }
        } else{
            System.out.println("AVISO: Portas fechadas! É necessário que estejam abertas para o embarque de passageiros!");
        }
    }

    public void desembarcarPassageiros(int quantidade){
        if(portas){
            if(quantidadePassageiros > 0){
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

class Onibus extends Veiculo{
    String[] tipos = {"Micro-Ônibus", "Convencional", "Articulado"};
    int tipoOnibus;

    public Onibus(int id, String marca, int ano, int tipoOnibus){
        this.id = id;
        this.marca = marca;
        this.ano = ano;
        this.tipoOnibus = tipoOnibus;
        switch (tipoOnibus){
            case 0:
                capacidadePassageiros = 40;
                break;
            case 1:
                capacidadePassageiros = 80;
                break;
            case 2:
                capacidadePassageiros = 160;
                break;
            default:
                break;
        }
    }

    @Override
    public void exibirDados(){
       System.out.println("Onibus de ID " + id + "\nMarca: " + marca + "\nAno: " + ano + "\nTipo Onibus: " + tipos[tipoOnibus] + "\nCapacidade de Passageiros: " +capacidadePassageiros);
    }
}

class Metro extends Veiculo{
    int numeroVagoes;
    boolean temArCondicionado;

    public Metro(int id, String marca, int ano, int numeroVagoes, boolean temArCondicionado){
        this.id = id;
        this.marca = marca;
        this.ano = ano;
        this.numeroVagoes = numeroVagoes;
        this.temArCondicionado = temArCondicionado;
        this.capacidadePassageiros = numeroVagoes * 50;
    }

    @Override
    public void exibirDados(){
        System.out.println("Metrô de ID " + id + "\nMarca: " + marca + "\nAno: " + ano + "\nNumero de Vagões: " + numeroVagoes + "\nCapacidade de Passageiros: " + capacidadePassageiros);
        if(temArCondicionado){
            System.out.println("Ar Condicionado: Sim");
        } else{
            System.out.println("Ar Condicionado: Não");
        }
    }
}

class Garagem{
    ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void listarTodos(){
        for (Veiculo v : veiculos) {
           v.exibirDados();
           System.out.println();
        }
    }

    public void listarPorTipo(){
        System.out.println("=== Ônibus ===");
        for(Veiculo v : veiculos){
            if(v instanceof Onibus){
                v.exibirDados();
            }
        }
        System.out.println("=== Metrôs ===");
        for(Veiculo v : veiculos){
            if(v instanceof Metro){
                v.exibirDados();
            }
        }
    }
    
    public void contarVeiculos(){
        int numOnibus = 0;
        int numMetro = 0;

        for (Veiculo veiculo : veiculos) {
            if(veiculo instanceof Onibus){
                numOnibus++;
            } else{
                numMetro++;
            }
        }
        
        System.out.println("Quantidade de Ônibus: " + numOnibus + "\nQuantidade de Metrôs: " + numMetro);
    }

    public Veiculo buscarPorId(int id){
        for(Veiculo v : veiculos){
            if(v.id == id){
                return v;
            }
        }
        return null;
    }
}

public class SistemaTransporteApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comando = 0;
        int novoId = 0;
        String novaMarca;
        int novoAno;
        Garagem garagem = new Garagem();

        do{
            System.out.println("=== INSTRUÇÕES ===\n\n1. Cadastrar Ônibus\n2. Cadastrar Metrô\n3. Listar todos os Veículos\n4. Listar Veículos por Tipo\n5. Executar Ação Específica(Abrir portas, embarcar passageiros, etc.)\n6. Mostrar Total de Veículos por Tipo\n7. Sair");
            System.out.print("Digite a opção desejada: ");
            comando = scanner.nextInt();
            scanner.nextLine();

            switch (comando) {
                case 1:
                    novoId++;
                    System.out.println("=== CADASTRO ===");
                    System.out.print("Digite a Marca: ");
                    novaMarca = scanner.nextLine();
                    System.out.print("Digite o ano: ");
                    novoAno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o tipo de ônibus(0. Micro-Ônibus/1. Convencional/2. Articulado): ");
                    int novoTipo = scanner.nextInt();
                    if(novoTipo >= 0 && novoTipo <= 2){
                        garagem.veiculos.add(new Onibus(novoId, novaMarca, novoAno, novoTipo));
                        System.out.println("Ônibus de ID " + novoId + " cadastrado com sucesso!");   
                    } else{
                        System.out.println("Tipo de Ônibus Inválido. Retornando ao Menu!");
                    }
                    break;
                case 2:
                    novoId++;
                    System.out.println("=== CADASTRO ===");
                    System.out.print("Digite a marca: ");
                    novaMarca = scanner.nextLine();
                    System.out.print("Digite o ano: ");
                    novoAno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite a quantidade de vagões: ");
                    int novoNumVagoes = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("O metrô possuí ar condicionado? Digite 'true' se tiver ou 'false' caso não tenha: ");
                    boolean novoArCondicionado = scanner.nextBoolean();
                    garagem.veiculos.add(new Metro(novoId, novaMarca, novoAno, novoNumVagoes, novoArCondicionado));
                    System.out.println("Metrô de ID " + novoId + " cadastrado com sucesso!");
                    break;
                case 3:
                    garagem.listarTodos();
                    break;
                case 4:
                    garagem.listarPorTipo();
                    break;
                case 5:
                    System.out.println("=== ESCOLHA DE VEÍCULO ===");
                    System.out.print("Digite o ID do veículo desejado: ");
                    int idTemp = scanner.nextInt();
                    scanner.nextLine();
                    Veiculo veiculoSelecionado = garagem.buscarPorId(idTemp);
                    if(veiculoSelecionado != null){
                        System.out.println("Veículo de ID " + idTemp + " selecionado");
                        int comandoEsp;
                        int novaQuant;
                        do{
                            System.out.println("=== INSTRUÇÕES ===\n\n1. Abrir Portas\n2. Fechar Portas\n3. Embarcar Passageiros\n4. Desembarcar Passageiros\n5. Exibir Dados\n6. Retornar ao Menu Principal");
                            System.out.print("Digite o que deseja fazer: ");
                            comandoEsp = scanner.nextInt();
                            scanner.nextLine();
                            switch (comandoEsp) {
                                case 1:
                                    veiculoSelecionado.abrirPortas();
                                    break;
                                case 2:
                                    veiculoSelecionado.fecharPortas();
                                    break;
                                case 3:
                                    System.out.print("Digite a quantidade de passageiros a embarcar: ");
                                    novaQuant = scanner.nextInt();
                                    scanner.nextLine();
                                    veiculoSelecionado.embarcarPassageiros(novaQuant);
                                    break;
                                case 4:
                                    System.out.print("Digite a quantidade de passageiros a desembarcar: ");
                                    novaQuant = scanner.nextInt();
                                    scanner.nextLine();
                                    veiculoSelecionado.desembarcarPassageiros(novaQuant);
                                    break;
                                case 5:
                                    veiculoSelecionado.exibirDados();
                                    break;
                                case 6:
                                    System.out.println("Voltando ao Menu Principal...\n...\n...");
                                    break;
                                default:
                                    System.out.println("ATENÇÃO: COMANDO INVÁLIDO");
                                    break;
                            }
                        } while(comandoEsp != 6);
                    } else{
                        System.out.println("Veículo de ID " + idTemp + " não encontrado");
                    }
                    break;
                case 6:
                    garagem.contarVeiculos();
                    break;
                case 7:
                    System.out.println("Encerrando Programa...\n...\n...");
                    break;
                default:
                    System.out.println("ATENÇÃO: COMANDO INVÁLIDO");
                    break;
            }
        } while(comando != 7);

        System.out.println("Programa Encerrado!");

        scanner.close();
    }
}