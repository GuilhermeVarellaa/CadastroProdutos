import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {


        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Celular", 100, 1));
        produtos.add(new ProdutoFisico("Bicicleta", 790, 2, 5000));
        produtos.add(new ProdutoDigital("GTA VI", 700, 1, 1000000));

        for (Produto p : produtos){
            p.exibirDetalhes();
        }


//        Produto p1 = new Produto("Monitor", 150, 2);
//
//        Produto p2 = new ProdutoDigital("GTA VI", 600, 1, 100000);
//
//        Produto p3 = new ProdutoFisico("Mesa gamer", 600, 1, 50000);
//
//        p1.exibirDetalhes();
//
//        p2.exibirDetalhes();
//
//        p3.exibirDetalhes();



    }
}