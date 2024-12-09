public class ProgramaAnimal {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.cadastrar("Gorila", "01/01/2020", "Kong", 1001, "África");
        animal2.cadastrar("Orca", "15/03/2019", "Jimbe", 1002, "Japão");

        animal1.alterar("George.", "Brasil");

        System.out.println("Informações do Animal 1:");
        animal1.imprimirInformacoes();

        System.out.println("\nInformações do Animal 2:");
        animal2.imprimirInformacoes();
    }
}
