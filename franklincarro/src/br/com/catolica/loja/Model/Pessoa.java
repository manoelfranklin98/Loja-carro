package br.com.catolica.loja.Model;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    public Pessoa(String nome, String cpf, String telefone, String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public abstract void exibirInformacoes();

    public String getNome()
    { return nome; }

    public String getCpf()
    { return cpf; }

    public String getTelefone()
    { return telefone; }
    public String getEmail()
    { return email; }

    public String getEndereco()
    { return endereco; }
}

