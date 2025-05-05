package controller;
import model.Pessoa;

public class PessoaController {
    public void mostrarPessoa(Pessoa pessoa){
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
