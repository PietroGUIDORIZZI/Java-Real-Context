package Chapter1.SistemaCaixa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class SistemaCaixa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exibirCabecalho();

        String nomeProduto = lerTexto(scanner, "Nome do produto: ");
        BigDecimal precoUnitario = lerValorMonetario(scanner, "Preço unitário (ex: 24.90): ");
        BigDecimal quantidade = lerValorMonetario(scanner, "Quantidade: ");
        BigDecimal percentualDesconto = lerValorMonetario(scanner, "Percentual de desconto (ex: 0.10 para 10%): ");

        BigDecimal subtotal = calcularSubtotal(precoUnitario, quantidade);
        BigDecimal valorDesconto = calcularDesconto(subtotal, percentualDesconto);
        BigDecimal total = calcularTotalComTaxa(subtotal.subtract(valorDesconto));

        exibirCupom(nomeProduto, subtotal, valorDesconto, total);

        scanner.close();
    }

    public static void exibirCabecalho() {
        System.out.println("==================================");
        System.out.println("   SISTEMA DE CAIXA - TECHNOVA");
        System.out.println("==================================");
    }

    public static String lerTexto(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static BigDecimal lerValorMonetario(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return new BigDecimal(scanner.nextLine());
    }

    public static BigDecimal calcularSubtotal(BigDecimal preco, BigDecimal quantidade) {
        return preco.multiply(quantidade);
    }

    public static BigDecimal calcularDesconto(BigDecimal subtotal, BigDecimal percentual) {
        return subtotal.multiply(percentual);
    }

    public static BigDecimal calcularTotalComTaxa(BigDecimal subtotalComDesconto) {
        final BigDecimal TAXA_SERVICO = new BigDecimal("0.05");
        BigDecimal valorTaxa = subtotalComDesconto.multiply(TAXA_SERVICO);
        return subtotalComDesconto.add(valorTaxa).setScale(2, RoundingMode.HALF_UP);
    }

    public static void exibirCupom(String produto, BigDecimal subtotal, BigDecimal desconto, BigDecimal total) {
        System.out.println();
        System.out.println("=== Cupom de Venda ===");
        System.out.println("Produto: " + produto);
        System.out.println("Subtotal: R$ " + subtotal.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Desconto: R$ " + desconto.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Total com taxa de serviço: R$ " + total);
    }
}
