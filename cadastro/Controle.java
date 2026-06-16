package cadastro;

public class Controle {

    public static void main(String[] args) {

        Cliente<String, Integer, String> cliente =
                new Cliente<>(
                        "Cleber",
                        "Souza",
                        20,
                        "Rua domingos silveira, 133",
                        "cleber.souza@gmail.com"
                );

        cliente.imprimirDados();
    }
}