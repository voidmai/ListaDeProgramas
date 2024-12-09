public class Animal {
    String especie;
    String dataNascimento;
    String nome;
    int numeroRegistro;
    String localNascimento;

    void cadastrar(String especie, String dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    void alterar(String nome, String localNascimento) {
        this.nome = nome;
        this.localNascimento = localNascimento;
    }

    void imprimirInformacoes() {
        System.out.println("Espécie: " + especie);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Nome: " + nome);
        System.out.println("Número de Registro: " + numeroRegistro);
        System.out.println("Local de Nascimento: " + localNascimento);
    }
}
