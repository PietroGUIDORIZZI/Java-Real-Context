package Chapter2;

public class CadastroProduto {

    static void main(String[] args){
        String name = "Computador";
        double price = 2000.00;
        int stockQuantity = 0;
        boolean available = stockQuantity > 0 ? true : false;
        System.out.println("Produto: " + name);
        System.out.printf("R$: %.2f\n",  price);
        System.out.println("Estoque: " + stockQuantity);
        System.out.println("Disponível: " + available);

    }

}
