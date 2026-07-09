package Chapter3;

public class CalculadoraDesconto {
    static void main(String[] args) {
        double preco = 149.90;
        int percentualDesconto = 10;

        double precoFinal = preco * ((100 - 10) / 100.00);
        double desconto = preco * (10/100.00);

        System.out.printf("Preço original: R$ %.2f\n", preco);
        System.out.printf("Desconto: %d %%\n" , percentualDesconto  );
        System.out.printf("Valor do desconto: R$  %.2f\n" , desconto);
        System.out.printf("Preço final: R$ %.2f\n" , precoFinal);
    }
}
