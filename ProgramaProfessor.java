public class ProgramaProfessor {
    public static void main(String[] args) {

        Professor professor1 = new Professor();
        Professor professor2 = new Professor();

        professor1.cadastrar("Dr. Jailson", "Doutorado", "Matemática", 40, 8000.00, "Álgebra e Geometria");
        professor2.cadastrar("Prof. Silvia", "Mestrado", "Física", 20, 5000.00, "Mecânica e Termodinâmica");

        professor1.alterarDisciplina("Álgebra Avançada");

        System.out.println("Dados do Professor 1:");
        professor1.imprimirDados();

        System.out.println("\nDados do Professor 2:");
        professor2.imprimirDados();
    }
}
