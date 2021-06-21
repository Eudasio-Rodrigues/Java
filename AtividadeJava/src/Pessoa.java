//classe Pessoa
public class Pessoa {
    private String Nome;
    private String Endereco;
    private String Telefone;

    public Pessoa(String Nome, String Endereco, String Telefone) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.Telefone = telefone;
    }

    public void exibir(){
        System.out.println("Nome: "+Nome);
        System.out.println("Endereço: "+Endereco);
        System.out.println("Telefone: "+Telefone);
    }
}
