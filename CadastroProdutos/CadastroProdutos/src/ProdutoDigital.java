public class ProdutoDigital extends Produto{

    public ProdutoDigital(String nome, double preco, int quantidade, int TamanhoEmMB) {
        super(nome, preco, quantidade);
        this.TamanhoEmMB = TamanhoEmMB;
    }

    int TamanhoEmMB;


    @Override
   public void exibirDetalhes(){
        System.out.println("Produto: " + getNome() +
                " | Preço: R$" + getPreco() +
                "| Quantidade: " + getQuantidade() +
                "| Tamanho: " + TamanhoEmMB + "MB");

    }
}

