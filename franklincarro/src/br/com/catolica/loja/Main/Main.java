package br.com.catolica.loja.Main;

import br.com.catolica.loja.Enuns.MarcaCarro;
import br.com.catolica.loja.Enuns.ModeloCarro;
import br.com.catolica.loja.Model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();
        List<Transacao> transacoes = new ArrayList<>();
        Map<String, Cliente> clientes = new HashMap<>();
        Set<Funcionario> funcionarios = new HashSet<>();

        Funcionario funcionario1 = new Funcionario("João Silva", "12345678900", "11999999999", "joao@loja.com", "Rua A, 123", "Vendedor");
        Cliente cliente1 = new Cliente("Maria Oliveira", "98765432100", "21988888888", "maria@gmail.com", "Rua B, 456", true);

        Veiculo carro1 = new Carro("ABC1234", "Preto", 2022, 80000.0, "CH123456", true, MarcaCarro.TOYOTA, ModeloCarro.SUV);
        Veiculo carro2 = new Carro("DEF5678", "Branco", 2021, 60000.0, "CH987654", true, MarcaCarro.FORD, ModeloCarro.SEDAN);

        funcionarios.add(funcionario1);
        clientes.put(cliente1.getCpf(), cliente1);
        veiculos.add(carro1);
        veiculos.add(carro2);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Loja de Carros ===");
            System.out.println("1. Listar Veículos");
            System.out.println("2. Vender Veículo");
            System.out.println("3. Registrar Compra de Veículo");
            System.out.println("4. Listar Transações");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("\nVeículos Disponíveis:");
                for (Veiculo veiculo : veiculos) {
                    if (veiculo.isDisponivel()) {
                        System.out.println("- " + veiculo.getClass().getSimpleName() + " (" + veiculo.getPlaca() + ")");
                    }
                }
            } else if (opcao == 2) {
                System.out.print("Digite o CPF do cliente: ");
                String cpf = scanner.nextLine();
                Cliente cliente = clientes.get(cpf);

                if (cliente == null) {
                    System.out.println("Cliente não encontrado!");
                    continue;
                }

                System.out.print("Digite a placa do veículo: ");
                String placa = scanner.nextLine();
                Veiculo veiculo = veiculos.stream()
                        .filter(v -> v.getPlaca().equals(placa) && v.isDisponivel())
                        .findFirst()
                        .orElse(null);

                if (veiculo == null) {
                    System.out.println("Veículo não encontrado ou já vendido!");
                    continue;
                }

                Venda venda = new Venda(
                        UUID.randomUUID().toString(),
                        new Date().toString(),
                        veiculo.getPreco(),
                        cliente,
                        funcionario1,
                        List.of(veiculo)
                );
                venda.realizarTransacao();
                transacoes.add(venda);
            } else if (opcao == 3) {
                System.out.print("Digite a placa do veículo a ser comprado: ");
                String placa = scanner.nextLine();

                System.out.print("Digite o valor da compra: ");
                double valor = scanner.nextDouble();
                scanner.nextLine();

                Compra compra = new Compra(
                        UUID.randomUUID().toString(),
                        new Date().toString(),
                        valor,
                        funcionario1,
                        new Carro(placa, "Indefinida", 2023, valor, "NovoChassi", true, MarcaCarro.HONDA, ModeloCarro.HATCHBACK)
                );
                compra.realizarTransacao();
                transacoes.add(compra);
            } else if (opcao == 4) {
                System.out.println("\nTransações Realizadas:");
                for (Transacao transacao : transacoes) {
                    System.out.println("- " + transacao.getClass().getSimpleName() + " (ID: " + transacao.getIdTransacao() + ")");
                }
            } else if (opcao == 5) {
                System.out.println("Encerrando o sistema...");
                continuar = false;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
