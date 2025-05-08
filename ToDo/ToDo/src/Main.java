import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            ListaDeTarefas lista = new ListaDeTarefas();

            boolean executando = true;

            while(executando){
                System.out.println("\n ===== MENUS DE TAREFAS =====");
                System.out.println("1. Adicionar tarefas");
                System.out.println("2. Listar tarefas");
                System.out.println("3. Concluir tarefas");
                System.out.println("4. Editar tarefas");
                System.out.println("5. Remover tarefas");
                System.out.println("6. Sair");
                System.out.println("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao){
                    case 1:
                        System.out.println("Descrição da tarefa: ");
                        String descricao = scanner.nextLine();
                        lista.adicionarTarefa(descricao);
                        System.out.println("Tarefa adicionada com sucesso");
                        break;

                    case 2:
                        lista.ListarTarefas();
                        break;

                    case 3:
                        System.out.println("Numero da tarefa a concluir: ");
                        int indiceConcluir = scanner.nextInt() -1;
                        lista.concluirTarefa(indiceConcluir);
                        break;

                    case 4:
                        System.out.println("Numero da tarefa a ser editada: ");
                        int indiceEditar = scanner.nextInt() -1;
                        scanner.nextLine();
                        System.out.println("Nova descrição: ");
                        String descricaoEditarTarefa = scanner.nextLine();
                        lista.editarTarefa(indiceEditar, descricaoEditarTarefa);
                        break;


                    case 5:
                        System.out.println("Digite o numero da tarefa a ser removida: ");
                        int numeroRemover = scanner.nextInt() -1;
                        lista.removerTareda(numeroRemover);
                        break;

                    case 6:
                        executando = false;
                        System.out.println("Encerrando o programa");
                        break;

                    default:
                        System.out.println("Opção invalida");
                        break;
                }


            }
            scanner.close();
        }
    }
