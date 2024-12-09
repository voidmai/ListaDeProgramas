public class ProgramaCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.cadastrar(1, "Toyota", "Preto", "Corolla", 2022, 4, "Gasolina", 10, 10000.00, true);
        carro2.cadastrar(2, "Volkswagen", "Branco", "Gol", 2021, 4, "Álcool", 5, 15000.00, false);

        carro1.alterar("Toyota", "Vermelho", "Corolla", 2023, 55000.00);
        System.out.println("Dados do Carro 1:");
        carro1.listar();

        System.out.println("\nDados do Carro 2:");
        carro2.listar();
    }
}
