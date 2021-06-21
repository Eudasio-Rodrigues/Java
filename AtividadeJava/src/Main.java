//classe main
public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor1= new Fornecedor("Joao", "rua Jose Augusto Sobrinho, nº 83", "12345678", 100, 45 );
        fornecedor1.exibir();
        System.out.println("Saldo: "+fornecedor1.obterSaldo());
        System.out.println("\n");
        Empregado empregado1= new Empregado("Maria", "rua Júlio César, nº 104", "987654321", 246,1100);
        empregado1.exibir();
    }
}
