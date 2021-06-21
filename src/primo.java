import java.util.Scanner;
public class primo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Numero: ");
        int num = leitor.nextInt();
        int cont = 0;
        for (int i = 1; i<=num ; i++ ) {
            if (num%i==0)
                cont++;
        }
        if(cont<=2)
            System.out.println("E primo");
        else
            System.out.println("Nao é primo");
    }
}
