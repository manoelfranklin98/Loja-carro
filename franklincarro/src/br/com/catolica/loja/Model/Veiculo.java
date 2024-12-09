package br.com.catolica.loja.Model;

public abstract class Veiculo {
    private String placa;
    private String cor;
    private int ano;
    private double preco;
    private String chassi;
    private boolean disponivel;

    public Veiculo(String placa, String cor, int ano, double preco, String chassi, boolean disponivel) {
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.chassi = chassi;
        this.disponivel = disponivel;
    }

    public abstract double calcularImposto();

    public String getPlaca() { return placa; }
    public String getCor() { return cor; }
    public int getAno()
    { return ano; }

    public double getPreco()
    { return preco; }

    public String getChassi()
    { return chassi; }

    public boolean isDisponivel()
    { return disponivel; }

    public void setDisponivel(boolean disponivel)
    { this.disponivel = disponivel; }
}
