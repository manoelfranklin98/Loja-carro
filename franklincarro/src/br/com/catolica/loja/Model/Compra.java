package br.com.catolica.loja.Model;

public class Compra extends Transacao {
    private Funcionario comprador;
    private Veiculo veiculoComprado;

    public Compra(String idTransacao, String data, double valor, Funcionario comprador, Veiculo veiculoComprado) {
        super(idTransacao, data, valor);
        this.comprador = comprador;
        this.veiculoComprado = veiculoComprado;
    }

    @Override
    public void realizarTransacao() {
        veiculoComprado.setDisponivel(true);
        System.out.println("Compra realizada com sucesso!");
    }

    public Funcionario getComprador()
    { return comprador; }

    public Veiculo getVeiculoComprado()
    { return veiculoComprado; }

    @Override
    public String toString() {
        return "Compra{" +
                "comprador=" + comprador +
                ", veiculoComprado=" + veiculoComprado +
                '}';
    }
}

