package Chapter1.SistemaCaixa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *Header do Sistema
 * Hardcoded
 */
public class SistemaCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   SISTEMA DE CAIXA - TECHNOVA");
        System.out.println("==================================");

        final BigDecimal TAXA_SERVICO = new BigDecimal("0.05");

        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Preço unitário (ex: 24.90): ");
        BigDecimal precoUnitario = new BigDecimal(scanner.nextLine());

        System.out.print("Quantidade: ");
        BigDecimal quantidade = new BigDecimal(scanner.nextLine());

        System.out.print("Percentual de desconto (ex: 0.10 para 10%): ");
        BigDecimal percentualDesconto = new BigDecimal(scanner.nextLine());

        BigDecimal subtotal = precoUnitario.multiply(quantidade);
        BigDecimal valorDesconto = subtotal.multiply(percentualDesconto);
        BigDecimal subtotalComDesconto = subtotal.subtract(valorDesconto);
        BigDecimal valorTaxa = subtotalComDesconto.multiply(TAXA_SERVICO);
        BigDecimal total = subtotalComDesconto.add(valorTaxa)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println();
        System.out.println("=== Cupom de Venda ===");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Subtotal: R$ " + subtotal.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Desconto: R$ " + valorDesconto.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Total com taxa de serviço: R$ " + total);

        scanner.close();
    }
}
