package view;
import model.*; // Importa todas as classes do pacote
import controller.PessoaController;

public class Main {
    public static void main(String[] args){
        Pessoa p = new Pessoa("Ana", 25);
        PessoaController controller = new PessoaController();
        controller.mostrarPessoa(p);
    }
}