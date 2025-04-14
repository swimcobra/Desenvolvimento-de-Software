// =====================
// Classe: Cliente.java
// =====================

// A classe Cliente também IMPLEMENTA  a interface Autenticavel
public class Cliente implements Autenticavel{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public void autenticar(String usuario, String senha){
        if(usuario.equals("cliente") && senha.equals("1234")){
            System.out.println("Cliente " + nome + " autenticado com sucesso.");
        } else{
            System.out.println("Falha na autenticação do Cliente.");
        }
    }
}