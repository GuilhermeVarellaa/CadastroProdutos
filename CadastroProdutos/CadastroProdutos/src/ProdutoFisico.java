public class ProdutoFisico extends Produto {

    public ProdutoFisico(String nome, double preco, int quantidade, double peso) {
        super(nome, preco, quantidade);
        this.peso = peso;
    }
    double peso;

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto: " + getNome() +
                " | Preço: R$" + getPreco() +
                "| Quantidade: " + getQuantidade() +
                "| Peso: " + peso + "gramas");
    }
}
