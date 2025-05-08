public class Tarefa {

    String descricao;
    boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getConcluido() {
        return concluida;
    }

    public void marcarComoConcluida(){
       this.concluida = true;
    }

    public void exibir(){
        String status = concluida ? "✔" : "✖";
        System.out.println(status + " " + descricao);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
