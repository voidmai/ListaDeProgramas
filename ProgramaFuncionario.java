public class ProgramaFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.cadastrar("Nathan Almeida", "10/05/1990", "11223344", "99988877766", "Rua D, 13", "Feira de Santana", 4500.00, "Desenvolvedor", "Superior", 101);
        funcionario2.cadastrar("Roque Costa", "20/07/1985", "55667788", "66655544433", "Rua B, 456", "Rio de Janeiro", 6000.00, "Professor", "Pós-Graduação", 102);

        funcionario1.alterar("Rua Nova, 789", 5000.00);

        System.out.println("Dados do Funcionário 1:");
        funcionario1.imprimirDados();

        System.out.println("\nDados do Funcionário 2:");
        funcionario2.imprimirDados();
    }
}
