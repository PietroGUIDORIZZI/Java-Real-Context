package Chapter1;

/**
 * Classe de demonstração para o exercício de comentários em Java.
 * <p>
 * Seu objetivo é exibir um relatório simples no console, servindo como
 * exemplo prático de como documentar código com Javadoc, comentários de
 * linha e blocos.
 * </p>
 * <p>
 * Este código não recebe entrada e apenas imprime duas linhas fixas:
 * a data/hora do relatório e o nome do responsável.
 * </p>
 *
 * @author PietroGuidorizzi
 * @version 1.0
 * @since 2026-07-08
 */
public class RelatorioComentado {

    /**
     * Método principal que é executado ao iniciar o programa.
     * <p>
     * Realiza a saída formatada para o console. Embora simples, demonstra
     * a importância de comentários para explicar a intenção do código,
     * facilitando a manutenção futura.
     * </p>
     *
     * @param args Argumentos de linha de comando (Utilizado no SaudacaoCLI)
     */
    public static void main(String[] args) {

        /*
         * BLOCO DE COMENTÁRIO:
         * A mensagem abaixo simula a geração de um relatório. Em um sistema real,
         * aqui seria obtida a data/hora atual do sistema, mas para fins didáticos
         * usamos um texto fixo para manter o foco no propósito do exercício.
         */
        // Exibe a data/hora de geração do relatório – essa informação é essencial
        // para rastrear quando o documento foi criado.
        System.out.println("Relatório gerado às: 5:39");

        // Exibe o nome do responsável – identifica quem produziu o relatório,
        // o que é útil para auditoria e atribuição de tarefas.
        System.out.println("Responsável: Pietro");
    }
}