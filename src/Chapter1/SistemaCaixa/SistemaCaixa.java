package Chapter1.SistemaCaixa;

/**
 *Header do Sistema
 * Hardcoded
 */
public class SistemaCaixa {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("   SISTEMA DE CAIXA - TECHNOVA");
        System.out.println("==================================");

        final String NOME_EMPRESA = "TechNova Sistemas";
        final double TAXA_SERVICO = 0.05;

        String nomeProduto = "Caderno Universitário";
        double precoUnitario = 24.90;
        int quantidade = 3;

        double subtotal = precoUnitario * quantidade;
        double total = subtotal + (subtotal * TAXA_SERVICO);

        System.out.println("Empresa: " + NOME_EMPRESA);
        System.out.println("Produto: " + nomeProduto);
        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Total com taxa de serviço: R$ %.2f%n", total);
    }
}
