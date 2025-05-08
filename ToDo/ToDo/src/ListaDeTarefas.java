import java.util.ArrayList;

public class ListaDeTarefas {

    private ArrayList<Tarefa> tarefas;


    public ListaDeTarefas(){
        tarefas = new ArrayList<>();
    }

    //Adicionar tarefa
    public void adicionarTarefa(String descricao){
        Tarefa nova = new Tarefa(descricao);
        tarefas.add(nova);
    }

    //listar todas tarefas
    public void ListarTarefas(){
        if (tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa encontrada");
        }else {
            for (int i = 0; i < tarefas.size(); i++){
                System.out.print(i + 1 + ". ");
                tarefas.get(i).exibir();
            }
        }
    }

    //Marcar tarefa como concluida
    public void concluirTarefa(int indice){
        if (indice >= 0 && indice < tarefas.size()){
            tarefas.get(indice).marcarComoConcluida();
            System.out.println("Tarefa marcada como concluida");
        } else {
            System.out.println("Indice invalido");
        }
    }

    public void editarTarefa(int indice, String novaDescricao){
        if (indice >= 0 && indice < tarefas.size()){
            tarefas.get(indice).setDescricao(novaDescricao);
            System.out.println("Tarefa editada com sucesso");
        }else {
            System.out.println("Índice invalido");
        }
    }

    public void removerTareda(int indice){
        if (indice > 0 && indice < tarefas.size()){
            tarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso!");
        }else {
            System.out.println("Índice invalido");
        }
    }



}
