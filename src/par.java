import java.util.Scanner;
public class par {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = leitor.nextInt();
        if(num%2==0){
            System.out.println("Par");
        }else{
            System.out.print("É impar\n");
        }
    }
}
