package CursoJava;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        boolean executando = true;

        while (executando){
            System.out.println("\n====== MENÚ BANCÁRIO =======");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Listar contas");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Numero da conta: ");
                    long numero = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Titular da conta: ");
                    String titular = scanner.nextLine();

                    System.out.println("Saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();

                    ContaBancaria novaConta = new ContaBancaria(numero, titular, saldoInicial);
                    banco.adicionarConta(novaConta);
                    System.out.println("✅ Conta criada com sucesso!");
                    break;

                case 2:
                    System.out.println("Numero da conta: ");
                    long numDeposito = scanner.nextLong();
                    ContaBancaria contaDep = banco.buscarConta(numDeposito);
                    if (contaDep != null){
                        System.out.println("Valor a depositar: ");
                        double valorDep = scanner.nextDouble();
                        contaDep.depositar(valorDep);
                        System.out.println("Deposito Realizado!");
                    }else{
                        System.out.println("Conta não encontrada.");
                    }
                        break;

                case 3:
                    System.out.println("Número da conta: ");
                    Long numSaque = scanner.nextLong();
                    ContaBancaria contaSaque = banco.buscarConta(numSaque);
                    if (contaSaque != null){
                        System.out.println("Valor a sacar: ");
                        double valorSaque = scanner.nextDouble();
                        boolean sucesso = contaSaque.sacar(valorSaque);
                        if (sucesso){
                            System.out.println("Saque realizado!");
                        }else {
                            System.out.println("Saldo insuficiente ou valor inválido!");
                        }
                    }else{
                        System.out.println("Conta não encontrada");
                    }
                    break;

                case 4:
                    System.out.println("Número da conta: ");
                    Long numConsulta = scanner.nextLong();
                    ContaBancaria contaConsulta = banco.buscarConta(numConsulta);
                    if(contaConsulta != null){
                        contaConsulta.exibirDados();
                    }else {
                        System.out.println("Conta não encontrada");
                    }
                    break;

                case 5:
                    banco.Listarcontas();
                    break;

                case 6:
                    executando = false;
                    System.out.println("Encerrando o programa");
                    break;

                default:
                    System.out.println(" ! Opção invalida");
                    break;



            }
        }
        scanner.close();
    }
}
