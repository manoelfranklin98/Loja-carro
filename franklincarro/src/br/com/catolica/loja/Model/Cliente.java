package br.com.catolica.loja.Model;

public class Cliente extends Pessoa {
    private boolean vip;

    public Cliente(String nome, String cpf, String telefone, String email, String endereco, boolean vip) {
        super(nome, cpf, telefone, email, endereco);
        this.vip = vip;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente: " + getNome() + ", CPF: " + getCpf() + ", VIP: " + (vip ? "Sim" : "Não"));
    }

    public boolean isVip() { return vip; }
    public void setVip(boolean vip) { this.vip = vip; }
}

