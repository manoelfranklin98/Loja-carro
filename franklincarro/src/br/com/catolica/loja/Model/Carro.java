package br.com.catolica.loja.Model;

import br.com.catolica.loja.Enuns.MarcaCarro;
import br.com.catolica.loja.Enuns.ModeloCarro;

import java.util.HashSet;
import java.util.Set;

public class Carro extends Veiculo {
    private MarcaCarro marca;
    private ModeloCarro modelo;
    private Set<String> acessorios;

    public Carro(String placa, String cor, int ano, double preco, String chassi, boolean disponivel, MarcaCarro marca, ModeloCarro modelo) {
        super(placa, cor, ano, preco, chassi, disponivel);
        this.marca = marca;
        this.modelo = modelo;
        this.acessorios = new HashSet<>();
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.04; // 4% de imposto
    }

    public void adicionarAcessorio(String acessorio) {
        acessorios.add(acessorio);
    }

    public void removerAcessorio(String acessorio) {
        acessorios.remove(acessorio);
    }

    public MarcaCarro getMarca()
    { return marca; }

    public ModeloCarro getModelo()
    { return modelo; }

    public Set<String> getAcessorios()
    { return acessorios; }

    @Override
    public String toString() {
        return "Carro{" +
                "marca=" + marca +
                ", modelo=" + modelo +
                ", acessorios=" + acessorios +
                '}';
    }
}


