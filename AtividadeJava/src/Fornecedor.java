//Classe Fornecedor
public class Fornecedor extends Pessoa{
    private float valorCredito;
    private float valorDivida;

    public Fornecedor(String Nome, String Endereco, String Telefone, float valorCredito, float valorDivida) {
        super(Nome, Endereco, Telefone);
        this.valorCredito=valorCredito;
        this.valorDivida=valorDivida;
    }

    public float getValorCredito() {
        return valorCredito;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public float obterSaldo(){
        float saldo = valorCredito-valorDivida;
        return saldo;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Valor credito: "+valorCredito);
        System.out.println("Valor divida: "+valorDivida);
    }
}
