import java.util.Scanner;
public class conversor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor em polegadas: ");
        float pol = leitor.nextFloat();
        float cm = pol* 2.54f;
        System.out.println("Resultado: "+cm+" centimentros");
    }
}