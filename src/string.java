import java.util.Scanner;
public class string {
    public static void main(java.lang.String[] args) {
        Scanner leitor= new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        java.lang.String nome = leitor.next();
        System.out.println(nome.length());
        System.out.println(nome.charAt(4));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
    }
}