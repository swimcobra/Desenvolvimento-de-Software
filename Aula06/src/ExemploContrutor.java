/*O que é um construtor?
 * Um construtor é um método especial dentro de uma classe que é executado automaticamente quando um objeto é criado.
 * O construtor serve para inicializar os atributos do objeto.
 * 
 * Regras do construtor em Java:
 * Mesmo nome da classe;
 * Não possui retorno (nem void);
 * Executado automaticamente ao criar o objeto (new).
 */

class Carro{
    String modelo;
    int ano;

    //construtor da classe
    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    void imprimir(){
        System.out.println("Modelo: " + modelo + "\nAno: " + ano);
    }
}

public class ExemploContrutor {
    public static void main(String[] args) {
        //Criando um objeto com o construtor
        Carro carro = new Carro("Civic", 1995);
        carro.imprimir();
    }
}
