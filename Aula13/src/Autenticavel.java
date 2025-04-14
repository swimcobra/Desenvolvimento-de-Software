// =============================
// Interface: Autenticavel.java
// =============================

// Define um "contrato" para qualquer classe que quiser autenticar

public interface Autenticavel{
    // Método que TODA classe que implementar essa interface será OBRIGADA a definir
    void autenticar(String usuario, String senha);

}

// Interface: define um contrato, e não uma classe com lógica.
// O método autenticar não tem corpo, ele apenas diz o que deve existir em quem implementar.
// Toda classe que implementar Autenticavel deverá obrigatoriamente criar esse método.