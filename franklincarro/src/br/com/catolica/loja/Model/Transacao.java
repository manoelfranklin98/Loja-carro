package br.com.catolica.loja.Model;

public abstract class Transacao {
    private String idTransacao;
    private String data;
    private double valor;

    public Transacao(String idTransacao, String data, double valor) {
        this.idTransacao = idTransacao;
        this.data = data;
        this.valor = valor;
    }

    public abstract void realizarTransacao();

    public String getIdTransacao()
    { return idTransacao; }

    public String getData()
    { return data; }

    public double getValor()
    { return valor; }
}

