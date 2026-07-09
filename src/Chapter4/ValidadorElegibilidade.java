package Chapter4;

import java.util.Scanner;

public class ValidadorElegibilidade {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao programa de fidelidade TechNova");
        System.out.println("Possui cadastro ativo? (s/n)");
        String resp = sc.nextLine();
        boolean cadastroAtivo = resp.equalsIgnoreCase("s");
        System.out.println("Cadastro ativo: "+cadastroAtivo);
        System.out.println("Informe sua idade: ");
        int idade = Integer.parseInt(sc.nextLine());
        System.out.println("Maior de idade: " + (idade >= 18));
        String situacao = (cadastroAtivo && idade >= 18) ? "Elegível" : "Não Elegível";
        System.out.println(situacao);
    }
}
