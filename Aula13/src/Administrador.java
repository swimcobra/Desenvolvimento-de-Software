// ===========================
// Classe: Administrador.java
// ===========================

// A classe Administrador IMPLEMENTA a interface Autenticavel
public class Administrador implements Autenticavel{
    // Atributo privado para armazenar o nome do Administrador
    private String nome;

    public Administrador(String nome){
        this.nome = nome;
    }

    // Método obrigatório da Interface
    @Override
    public void autenticar(String usuario, String senha){
        // Simulação de login fixo
        // equals() é um método usado para comparar o conteúdo de dois objetos
        if(usuario.equals("admin") && senha.equals("1234")){
            System.out.println("Administrador " + nome + " autenticado com sucesso.");
        } else{
            System.out.println("Falha na autenticação do administrador.");
        }
    }
}
// A classe usa implements para indicar que ela está se cimprometendo a seguir o contrato da Interface.
// O método autenticar tem uma simulação de verificação de login com valores fixos.
// O uso de @Override indica que estamos Implementando um método da interface.