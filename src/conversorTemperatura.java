import java.util.Scanner;

public class conversorTemperatura {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor em celsius: ");
        float c = leitor.nextFloat();
        float f = 1.8f*c+32;
        System.out.println("O resultado é:"+f+" Fahrenheit");
    }
}