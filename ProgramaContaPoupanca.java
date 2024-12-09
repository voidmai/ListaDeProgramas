public class ProgramaContaPoupanca {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca();
        ContaPoupanca conta2 = new ContaPoupanca();

        conta1.cadastrar("Nádson Pereira", "12345678", "98765432100", 1000.50, "12345-6", "001");
        conta2.cadastrar("Natália Passos", "87654321", "12345678900", 2500.75, "67890-1", "002");

        conta1.alterar("Nádson Pereira", "12345678", "98765432100", 2000.00);

        System.out.println("Saldo da Conta 1:");
        conta1.imprimirSaldo();

        System.out.println("\nSaldo da Conta 2:");
        conta2.imprimirSaldo();
    }
}
