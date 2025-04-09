import java.util.Scanner;
import java.util.ArrayList;

abstract class Veiculo{
    int id;
    String marca;
    int ano;
    boolean portas = false;
    int capacidadePassageiros;

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
       System.out.println("=== Onibus " + id + " ===\nMarca: " + marca + "\nAno: " + ano + "\nTipo Onibus: " + tipoOnibus + "\nCapacidade de Passageiros: " +capacidadePassageiros);
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
    }

    @Override
    public void exibirDados(){
        System.out.println("=== Metro " + id + " ===\nMarca: " + marca + "\nAno: " + ano + "\nNumero de Vagões: " + numeroVagoes + "\nCapacidade de Passageiros: " + capacidadePassageiros + "\nAr Condicionado: " + temArCondicionado);
    }
}