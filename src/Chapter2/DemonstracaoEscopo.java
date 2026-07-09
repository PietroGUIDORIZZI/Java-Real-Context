package Chapter2;

/**
 * Classe de demonstração do conceito de escopo de variáveis em Java.
 * <p>
 * Mostra como variáveis declaradas dentro de blocos delimitados por { }
 * têm visibilidade limitada àquele bloco e seus sub-blocos, e não podem
 * ser acessadas fora deles.
 * </p>
 *
 * @author Pietro
 * @version 1.0
 * @since 2026-07-09
 */
public class DemonstracaoEscopo {

    public static void main(String[] args) {
        // Variável declarada no escopo do método main (visível em todo o método)
        int x = 10;
        System.out.println("Variável externa (x) = " + x);

        // BLOCO INTERNO ANINHADO (dentro do main)
        {
            // A variável x (externa) é visível aqui dentro
            System.out.println("Dentro do bloco interno - x = " + x);

            // Declaração de uma variável local a este bloco
            int y = 20;
            System.out.println("Dentro do bloco interno - y = " + y);

            // Podemos modificar x dentro do bloco (ainda é a mesma variável)
            x = 15;
            System.out.println("Dentro do bloco - x modificado para " + x);
        }
        // Fim do bloco interno – a variável y deixa de existir aqui

        // FORA DO BLOCO INTERNO (ainda dentro do main)
        System.out.println("Fora do bloco - x = " + x); // x ainda existe e foi alterado

        /*
         * A LINHA ABAIXO NÃO COMPILARIA SE FOSSE DESCOMENTADA:
         *
         * System.out.println("Fora do bloco - y = " + y);
         *
         * Motivo: a variável y foi declarada dentro do bloco interno { } e
         * seu escopo está restrito àquele bloco. Fora dele, y não é mais
         * reconhecida pelo compilador. Tentar usá-la geraria o erro:
         *
         * "cannot find symbol"
         *   symbol:   variable y
         *   location: class DemonstracaoEscopo
         *
         * Isso acontece porque o compilador só conhece variáveis que estão
         * no escopo atual ou em escopos externos (nunca em escopos internos
         * já finalizados).
         */
        // System.out.println("Fora do bloco - y = " + y); // <-- LINHA COMENTADA (NÃO COMPILA)

        // ------------------------------------------------------------
        // DESAFIO EXTRA: dois blocos irmãos (não aninhados)
        // ------------------------------------------------------------
        System.out.println("\n--- Desafio Extra: Blocos Irmãos ---");

        // Primeiro bloco irmão
        {
            String saudacao = "Olá do bloco A";
            System.out.println(saudacao);
            // A variável 'saudacao' só existe dentro deste bloco
        }

        // Segundo bloco irmão
        {
            // A variável 'saudacao' do bloco anterior NÃO é visível aqui
            // A linha abaixo NÃO compilaria se descomentada:
            // System.out.println(saudacao); // erro: cannot find symbol

            // Podemos declarar outra variável com o mesmo nome, pois escopos diferentes
            String saudacao = "Olá do bloco B"; // perfeitamente válido
            System.out.println(saudacao);
        }

        // Fora dos dois blocos, nenhuma das variáveis 'saudacao' existe
        // A linha abaixo NÃO compilaria:
        // System.out.println(saudacao); // erro: cannot find symbol

        System.out.println("\nFim da demonstração.");
    }
}
