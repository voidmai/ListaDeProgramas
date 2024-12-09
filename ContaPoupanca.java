public class ContaPoupanca {
    String nomeCorrentista;
    String rg;
    String cpf;
    double saldo;
    String numero;
    String agencia;

    void cadastrar(String nomeCorrentista, String rg, String cpf, double saldo, String numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    void alterar(String nomeCorrentista, String rg, String cpf, double saldo) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    void imprimirSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }
}