package Chapter1;

public class SaudacaoCLI {
    static void main(String[] args){

        if(args.length == 0){
            System.out.println("Nenhum nome informado. Uso: SaudacaoCLI <nome>");
        }else if(args.length == 1){
            String nome = args[0];
            System.out.println("Olá " + nome + "! Seja bem-vindo(a) à TechNova.");
        }else {
            System.out.println("Olá " + args[0] + " " + args[1] + "! Seja bem-vindo(a) à TechNova.");
            for(int i = 2; i < args.length; i++){
                if(i != args.length - 1 ){
                    System.out.printf(" ");
                }
                System.out.printf(args[i]);
            }
        }

    }

}
