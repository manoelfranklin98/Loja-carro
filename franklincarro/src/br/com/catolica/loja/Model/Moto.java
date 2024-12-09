package br.com.catolica.loja.Model;

public class Moto extends Veiculo {
    private String cilindrada;

    public Moto(String placa, String cor, int ano, double preco, String chassi, boolean disponivel, String cilindrada) {
        super(placa, cor, ano, preco, chassi, disponivel);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.02; // 2% de imposto
    }

    public String getCilindrada() { return cilindrada; }
}

