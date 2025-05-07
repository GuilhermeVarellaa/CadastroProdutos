public class Main {
    public static void main(String[] args) {

        Produto Produto1 = new Produto("Monitor", 150, 2);

        Produto Produto2 = new Produto("Moto", 15000, 1);

        Produto Produto3 = new Produto("Carro", 150000, 1);
        Produto1.exibirDetalhes();
        Produto2.exibirDetalhes();
        Produto3.exibirDetalhes();

    }
}