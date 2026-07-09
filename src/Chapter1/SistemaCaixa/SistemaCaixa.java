package Chapter1.SistemaCaixa;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        final BigDecimal TAXA_SERVICO = new BigDecimal("0.05");

        String nomeProduto = "Caderno Universitário";
        BigDecimal precoUnitario = new BigDecimal("24.90");
        BigDecimal quantidade = new BigDecimal("3");
        BigDecimal percentualDesconto = new BigDecimal("0.10"); // 10%

        BigDecimal subtotal = precoUnitario.multiply(quantidade);
        BigDecimal valorDesconto = subtotal.multiply(percentualDesconto);
        BigDecimal subtotalComDesconto = subtotal.subtract(valorDesconto);
        BigDecimal valorTaxa = subtotalComDesconto.multiply(TAXA_SERVICO);
        BigDecimal total = subtotalComDesconto.add(valorTaxa)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println("Empresa: " + NOME_EMPRESA);
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Subtotal: R$ " + subtotal.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Desconto (10%): R$ " + valorDesconto.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Total com taxa de serviço: R$ " + total);
    }
}
