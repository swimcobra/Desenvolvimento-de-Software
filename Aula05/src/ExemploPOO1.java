/*O que é uma classe?
 * Uma classe é o modelo (molde) que define atributod (características) e métodos (ações) de um objeto.
 * Imagine que uma classe seja um "molde de bolo".
 * Com esse molde, podemos fazer vários bolos (objetos) iguais, mas com recheios diferentes.*/

class Carro{
    String modelo;
    int ano;

    void buzinar(){
        System.out.println("BII BII!");
    }
}

/*A classe Carro define o que um carro deve ter (modelo e ano)e o que ele pode fazer (buzinar()).
 * 
 * O que é um objeto?
 * Um objeto é uma instância de uma classe.
 * Ele representa um exemplo real do que foi definido no molde.
 * Se a classe Carro é um molde de bolo, o objeto meuCarro é um bolo feito com esse molde.*/
public class ExemploPOO1 {
    public static void main(String[] args) {
        /*Criando um objeto da classe Carro */
        Carro meuCarro = new Carro();
        
        /*Definindo valores para os atributos*/
        meuCarro.modelo = "Civic";
        meuCarro.ano = 1995;

        /*Chamando um método do objeto */
        meuCarro.buzinar();

        /*Exibindo os valores do objeto */

        System.out.println("Meu carro é um " + meuCarro.modelo + " " + meuCarro.ano);
    }
}