/*
 * Exercício:
 * 
 * Criar uma classe Livro com os atributos:
 * Título (String);
 * Páginas (int);
 * Disponível (boolean).
 * 
 * Os atributos devem ser privados, e vocês deverão:
 * Criar os métodos get para acessar os valores;
 * Inicializar os valores no main() usando o construtor;
 * Exibir as informações do livro usando apenas os métodos get.
 * 
 * Saída esperada: 
 * Título: O senhor dos Anéis
 * Total de páginas: 1200
 * Status: Disponível para empréstimo
 */

class Livro{
    private String titulo;
    private int paginas;
    private boolean emprestimo;

    //GET
    public String getTitulo(){
        return titulo;
    }

    public int getPaginas(){
        return paginas;
    }

    public boolean getEmprestimo(){
        return emprestimo;
    }

    //SET
    public void setTitulo(String novoTitulo){
        titulo = novoTitulo;
    }

    public void setPaginas(int novasPaginas){
        if(novasPaginas > 0){
            paginas = novasPaginas;
        } else{
            System.out.println("Número de páginas inválido!");
        }
    }

    public void setEmprestimo(boolean novoEmprestimo){
        emprestimo =novoEmprestimo;
    }
}

public class Exercicio01 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        
        livro1.setTitulo("Duna");
        livro1.setPaginas(1300);
        livro1.setEmprestimo(false);

        if(livro1.getPaginas() == 0){
            System.out.println("Informações Inválidas");
        } else{
            if(livro1.getEmprestimo() == false){
                System.out.println("Título: " + livro1.getTitulo() + "\nTotal de Páginas: " + livro1.getPaginas() + "\nStatus: Não disponível para empréstimo");
            } else{
                System.out.println("Título: " + livro1.getTitulo() + "\nTotal de Páginas: " + livro1.getPaginas() + "\nStatus: Disponível para empréstimo");
            }
        }
    }
}
