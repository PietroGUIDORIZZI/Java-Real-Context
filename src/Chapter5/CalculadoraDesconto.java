package Chapter5;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculadoraDesconto {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor do produto: ");
        double itemValue = Double.parseDouble(sc.nextLine());
        BigDecimal itemValueBD = new BigDecimal(itemValue);
        System.out.println("Valor pago: ");
        double paidValue = Double.parseDouble(sc.nextLine());
        BigDecimal paidValueBD = new BigDecimal(paidValue);
        final BigDecimal SERVICE_TAX = new BigDecimal("0.05");
        BigDecimal change = BigDecimal.ZERO;
        if (paidValueBD.compareTo(itemValueBD) >= 0) {
            change = paidValueBD.subtract(itemValueBD);
            BigDecimal changeMinusTax = change.multiply((BigDecimal.ONE.subtract(SERVICE_TAX)));
            System.out.printf("Você pagou R$ %.2f pelo produto " +
                            "que custa R$ %.2f.\nseu troco é de R$ %.2f.\n" +
                            "Troco após a taxa de serviço(%% %.2f): R$ %.2f "
                    , paidValueBD, itemValueBD, change, SERVICE_TAX, changeMinusTax);
        }
        if (paidValueBD.compareTo(itemValueBD) < 0){
            System.out.println("Valor insuficiente.");
        }
        sc.close();
    }
}
