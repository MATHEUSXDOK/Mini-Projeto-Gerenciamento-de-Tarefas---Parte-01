import java.util.ArrayList;

class GerenciadorTarefas {
    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void removerTarefa(int indice) {
        try {
            listaTarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido!");
        }
    }

    public void marcarConcluida(int indice) {
        try {
            listaTarefas.get(indice).marcarConcluida();
            System.out.println("Tarefa marcada como concluída!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido!");
        }
    }

    public void listarTarefas() {
        if (listaTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            System.out.println("\nLista de Tarefas:");
            for (int i = 0; i < listaTarefas.size(); i++) {
                System.out.println(i + " - " + listaTarefas.get(i));
            }
        }
    }
}