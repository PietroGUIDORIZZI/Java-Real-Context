package Chapter1;

public class E2 {
    static void main(String[] args){
        System.out.println("=== Diagnóstico do Ambiente ===");
        System.out.printf("Versão do Java: ");
        System.out.println(System.getProperty("java.version"));
        System.out.printf("Sistema Operacional: ");
        System.out.println(System.getProperty("os.name"));
        System.out.println("Diretório do usuário: ");
        System.out.printf(System.getProperty("user.dir"));

    }
}
