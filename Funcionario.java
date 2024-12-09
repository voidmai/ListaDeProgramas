public class Funcionario {
    String nome;
    String dataNascimento;
    String rg;
    String cpf;
    String endereco;
    String naturalidade;
    double salario;
    String profissao;
    String grauInstrucao;
    int matricula;

    void cadastrar(String nome, String dataNascimento, String rg, String cpf, String endereco, String naturalidade,
                   double salario, String profissao, String grauInstrucao, int matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    void alterar(String endereco, double salario) {
        this.endereco = endereco;
        this.salario = salario;
    }

    void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Profissão: " + profissao);
        System.out.println("Grau de Instrução: " + grauInstrucao);
        System.out.println("Matrícula: " + matricula);
    }
}
