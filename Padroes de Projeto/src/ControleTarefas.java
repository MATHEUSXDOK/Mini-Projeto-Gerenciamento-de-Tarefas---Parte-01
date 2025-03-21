import java.util.Scanner;

public class ControleTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        int opcao;

        do {
            System.out.println("\n=== Controle de Tarefas ===");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Remover Tarefa");
            System.out.println("3 - Marcar como Concluída");
            System.out.println("4 - Listar Tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("Informe os detalhes da tarefa: ");
                        String descricao = scanner.nextLine();
                        gerenciador.adicionarTarefa(descricao);
                        break;
                    case 2:
                        gerenciador.listarTarefas();
                        System.out.print("Informe o número da tarefa que deseja excluir: ");
                        int indiceRemover = Integer.parseInt(scanner.nextLine());
                        gerenciador.removerTarefa(indiceRemover);
                        break;
                    case 3:
                        gerenciador.listarTarefas();
                        System.out.print("Informe o número da tarefa que foi finalizada: ");
                        int indiceConcluir = Integer.parseInt(scanner.nextLine());
                        gerenciador.marcarConcluida(indiceConcluir);
                        break;
                    case 4:
                        gerenciador.listarTarefas();
                        break;
                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção incorreta, tente novamente!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número correto.");
                opcao = -1;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
