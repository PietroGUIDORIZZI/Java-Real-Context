package Chapter2;

public class ConfiguracoesSistema {
    public static void main(String[] args) {
        final String NOME_EMPRESA = "TechNova Sistemas";
        final double DESCONTO_MAXIMO = 0.15;
        final int LIMITE_ITENS_CUPOM = 50;

        System.out.println("=== Configurações do Sistema ===");
        System.out.printf("Empresa : %s\nDesconto máximo permitido: %.0f%%\nLimite de itens por cupom: %d", NOME_EMPRESA, DESCONTO_MAXIMO * 100, LIMITE_ITENS_CUPOM );
    }
}