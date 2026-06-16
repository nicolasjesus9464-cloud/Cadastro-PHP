package cadastro;

public class Cliente<T, U, V> {

    private T nome;
    private T sobrenome;
    private U idade;
    private V endereco;
    private V email;

    public Cliente(T nome, T sobrenome, U idade, V endereco, V email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
    }

    public void imprimirDados() {
        System.out.println("=== DADOS DO CLIENTE ===");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
    }
}