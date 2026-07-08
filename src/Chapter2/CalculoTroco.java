package Chapter2;

public class CalculoTroco {
    static void main(String[]args){
        double itemValue = 4.97;
        double paidValue = 10.00;
        final double SERVICE_TAX = 0.05;
        double change = paidValue - itemValue;
        double changeMinusTax = change * (1.0 - SERVICE_TAX);

        System.out.printf("Você pagou %.2f pelo produto " +
                "que custa %.2f.\nseu troco é de R$%.2f.\n" +
                        "Troco após a taxa de serviço(%% %.2f): %.2f "
        , paidValue, itemValue, change, SERVICE_TAX, changeMinusTax);
    }
}
