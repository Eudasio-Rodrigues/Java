//Classe Empregado
public class Empregado extends Pessoa {
    private int codSetor;
    private float salario;

    public Empregado(String Nome, String Endereco, String Telefone, int codSetor, float salario) {
        super(Nome, Endereco, Telefone);
        this.codSetor = codSetor;
        this.salario = salario;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public float getSalario() {
        return salario;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Codigo do setor: "+codSetor);
        System.out.println("Salario: "+salario);

    }
}
