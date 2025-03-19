class Carro1{
    String modelo;
    int ano;

    //construtor da classe
    public Carro1(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    void imprimir(){
        System.out.println("Modelo: " + modelo + "\nAno: " + ano);
    }
}

public class ExemploContrutorSemParametro {
    public static void main(String[] args) {
        //Criando um objeto com o construtor
        Carro1 carro = new Carro1("Civic", 1995);
        carro.imprimir();
    }
}