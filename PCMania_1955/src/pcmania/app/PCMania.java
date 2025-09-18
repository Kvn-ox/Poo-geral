package pcmania.app;

import pcmania.model.*;
import pcmania.util.ProcessarPedido;

import java.util.Scanner;

public class PCMania {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ======== PERSONALIZE AQUI SUA MATRÍCULA ========
        int matricula = 1955; // <- sua matrícula já configurada
        // =================================================

        // Cliente (dados estáticos conforme dica)
        Cliente cliente = new Cliente("Kevin Lopes", "132.767.037-26");

        // Montagem das três promoções (hardwares, SO e memória USB)
        Computador promo1 = new Computador("Apple", matricula, 3);
        promo1.adicionarHardwareBasico(new HardwareBasico("Processador Core i3", 2200));
        promo1.adicionarHardwareBasico(new HardwareBasico("Memória RAM", 8));
        promo1.adicionarHardwareBasico(new HardwareBasico("HD", 500));
        promo1.setSistemaOperacional(new SistemaOperacional("macOS Sequoia", 64));
        promo1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        Computador promo2 = new Computador("Samsung", matricula + 1234, 3);
        promo2.adicionarHardwareBasico(new HardwareBasico("Processador Core i5", 3370));
        promo2.adicionarHardwareBasico(new HardwareBasico("Memória RAM", 16));
        promo2.adicionarHardwareBasico(new HardwareBasico("HD", 1000));
        promo2.setSistemaOperacional(new SistemaOperacional("Windows 8", 64));
        promo2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        Computador promo3 = new Computador("Dell", matricula + 5678, 3);
        promo3.adicionarHardwareBasico(new HardwareBasico("Processador Core i7", 4500));
        promo3.adicionarHardwareBasico(new HardwareBasico("Memória RAM", 32));
        promo3.adicionarHardwareBasico(new HardwareBasico("HD", 2000));
        promo3.setSistemaOperacional(new SistemaOperacional("Windows 10", 64));
        promo3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        // Interface simples de compra
        System.out.println("Bem-vindo à PC Mania!");
        int opcao;
        do {
            System.out.println("\nQual promoção deseja comprar? (0 para finalizar)");
            System.out.println("1 - Promoção 1 (Apple)");
            System.out.println("2 - Promoção 2 (Samsung)");
            System.out.println("3 - Promoção 3 (Dell)");
            System.out.print("Opção: ");
            opcao = lerInteiro(in);

            switch (opcao) {
                case 1 -> {
                    cliente.comprar(promo1);
                    System.out.println("Adicionado: Promoção 1");
                }
                case 2 -> {
                    cliente.comprar(promo2);
                    System.out.println("Adicionado: Promoção 2");
                }
                case 3 -> {
                    cliente.comprar(promo3);
                    System.out.println("Adicionado: Promoção 3");
                }
                case 0 -> System.out.println("Finalizando compras...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        // Mostra resumo
        System.out.println("\n===== RESUMO DA COMPRA =====");
        System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
        System.out.println("Quantidade de PCs: " + cliente.getQuantidadeComprada());
        System.out.println();

        Computador[] pcs = cliente.getComputadores();
        for (Computador pc : pcs) {
            pc.mostrarPCConfigs();
        }

        float total = cliente.calculaTotalCompra();
        System.out.printf("TOTAL: R$ %.2f%n", total);

        // Chama o métdo utilitário conforme pedido
        ProcessarPedido.enviarPedido(pcs);

        in.close();
    }

    // Leitura segura de inteiro
    private static int lerInteiro(Scanner in) {
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Digite um número válido: ");
        }
        return in.nextInt();
    }
}
