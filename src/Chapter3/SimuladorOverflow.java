package Chapter3;

public class SimuladorOverflow {
    static void main(String[] args) {
        int contador = Integer.MAX_VALUE;
        System.out.println("Valor máximo de int: " + contador);
        try {
        Math.addExact(contador, 1);

        }catch (ArithmeticException ae){
            System.out.println("Overflow Capturado!");
            contador++;
            System.out.println("Após somar 1: " + contador +  " (overflow!)");
        }
        contador--;
        long contadorL = contador;
        System.out.println("Valor de long: " + contadorL);

        contadorL++;
        System.out.println("Soma-se 1 sem overflow: " + contadorL);
    }
}
