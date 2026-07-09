package Chapter3;

import java.util.Scanner;

public class CifraDeCesar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Forneça o número do deslocamento dos caracteres: ");
        int cript = Integer.parseInt(sc.nextLine());
        System.out.println("Palavra a ser encriptada: ");
        String password = sc.nextLine();
        sc.close();
        char[] pw = new char[password.length()];
        for (int i = 0; i < password.length(); i++) {
            pw[i] = password.charAt(i);
            pw[i] += cript;
            System.out.printf(String.valueOf(pw[i]));
        }
    }}