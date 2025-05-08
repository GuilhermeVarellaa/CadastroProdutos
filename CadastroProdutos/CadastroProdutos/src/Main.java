public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Monitor", 150, 2);

        Produto p2 = new ProdutoDigital("GTA VI", 600, 1, 100000);

        Produto p3 = new ProdutoFisico("Mesa gamer", 600, 1, 50000);

        p1.exibirDetalhes();

        p2.exibirDetalhes();

        p3.exibirDetalhes();



    }
}