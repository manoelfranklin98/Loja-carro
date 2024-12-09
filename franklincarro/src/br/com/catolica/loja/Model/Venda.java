package br.com.catolica.loja.Model;

import java.util.List;

public class Venda extends Transacao {
    private Cliente cliente;
    private Funcionario vendedor;
    private List<Veiculo> veiculosVendidos;

    public Venda(String idTransacao, String data, double valor, Cliente cliente, Funcionario vendedor, List<Veiculo> veiculosVendidos) {
        super(idTransacao, data, valor);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.veiculosVendidos = veiculosVendidos;
    }

    @Override
    public void realizarTransacao() {
        for (Veiculo veiculo : veiculosVendidos) {
            veiculo.setDisponivel(false);
        }
        System.out.println("Venda realizada com sucesso!");
    }

    public Cliente getCliente()
    { return cliente; }

    public Funcionario getVendedor()
    { return vendedor; }

    public List<Veiculo> getVeiculosVendidos()
    { return veiculosVendidos; }
}

