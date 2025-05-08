package CursoJava;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public void adicionarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public ContaBancaria buscarConta(long numero) {
        for (ContaBancaria c : contas) {
            if (c.getNumero() == numero) {
                return c;
            }
        }
        return null;
    }
    public void Listarcontas(){
        for (ContaBancaria c : contas){
            c.exibirDados();
            System.out.println("--------------");
        }
    }
}
