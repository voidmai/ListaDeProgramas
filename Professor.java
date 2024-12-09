public class Professor {
    String nome;
    String titulacao;
    String formacao;
    int cargaHoraria;
    double salario;
    String descricaoDisciplinas;

    void cadastrar(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDisciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    void alterarDisciplina(String novaDescricao) {
        this.descricaoDisciplinas = novaDescricao;
    }

    void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Formação: " + formacao);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Salário: R$" + salario);
        System.out.println("Disciplinas: " + descricaoDisciplinas);
    }
}
