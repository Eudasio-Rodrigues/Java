import java.util.Scanner;
class soma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite primeiro valor");
        float num1 = leitor.nextFloat();
        System.out.println("Digite o segundo valor");
        float num2 = leitor.nextFloat();
        float soma = num1 + num2;
        System.out.println("A soma dos numeros e:"+soma);

    }
}