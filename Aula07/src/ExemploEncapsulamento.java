/*O que é encapsulamento?
É o conceito de esconder os detalhes internos de uma classe e permitir o acesso a eles somente por meio de métodos controlados.

Fazendo uma analogia: Imagine uma caixa com tampa (a classe). Dentro dela estão os atributos protegidos (variáveis privadas),
e você só pode interagir com eles por meio de botões na tampa (métodos públicos get e set).*/

//EXEMPLO SEM ENCAPSULAMENTO

/* 
class Pessoa{
    String nome;
    int idade;
}

public class ExemploEncapsulamento {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "joão";
        p.idade = 10;

        if(p.idade >= 0){
            System.out.println(p.nome + " tem " + p.idade + " anos");
        } else{
            System.out.println("Idade inválida");
        }
        p.idade = -5;

        System.out.println(p.nome + " tem " + p.idade + " anos");
    }
}
*/

//EXEMPLO COM ENCAPSULAMENTO

class Pessoa{
    private String nome;
    private int idade;

    //GETTERS (para ler)
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    //SETTERS (para alterar)
    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setIdade(int novaIdade){
        if(novaIdade >= 0){
            idade = novaIdade;
        } else{
            System.out.println("Idade Inválida");
        }
    }
}

public class ExemploEncapsulamento {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("João");
        p.setIdade(-5); //Agora é verificado

        System.out.println(p.getNome() + " tem " + p.getIdade() + " anos");
    }
}

/* O que é um método GET?
Um método GET ou GETTER é um método público que serve para ler (ou acessar) o valor de um atributo privado de uma classe.
Quando um atributo é privado, ele não pode ser acessado diretamente de fora da classe. O método GET é a forma controlada e segura de obter esse valor.
O método SET ou SETTER, serve para alterar o valor do atributo.*/