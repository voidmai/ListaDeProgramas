public class Carro {
    int codigo;
    String marca;
    String cor;
    String modelo;
    int anoFabricacao;
    int numeroPortas;
    String tipoCombustivel;
    int quantidadeDisponivel;
    double preco;
    boolean completo;

    void cadastrar(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numeroPortas, 
                   String tipoCombustivel, int quantidadeDisponivel, double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completo = completo;
    }

    void alterar(String marca, String cor, String modelo, int anoFabricacao, double preco) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    void listar() {
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Quantidade Disponível: " + quantidadeDisponivel);
        System.out.println("Preço: R$" + preco);
        System.out.println("Carro Completo: " + (completo ? "Sim" : "Não"));
    }
}
