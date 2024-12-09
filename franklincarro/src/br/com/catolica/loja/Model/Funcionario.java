package br.com.catolica.loja.Model;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cpf, String telefone, String email, String endereco, String cargo) {
        super(nome, cpf, telefone, email, endereco);
        this.cargo = cargo;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Funcionário: " + getNome() + ", Cargo: " + cargo);
    }

    public String getCargo() { return cargo; }
}

