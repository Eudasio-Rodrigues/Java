import java.util.Scanner;
public class areaPerimetro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        float r = leitor.nextFloat();
        float p = 2 * 3.14f * r;
        float a = 3.14f * r * r;
        System.out.println("Area:"+a);
        System.out.println("Perimentro:"+p);


    }
}