package pcmania.util;

import pcmania.model.Computador;

public class ProcessarPedido {
    private ProcessarPedido() {} // classe utilitária

    // métdo helper utilitário (estático) que recebe o array de computadores do cliente
    public static void enviarPedido(Computador[] pcs) {
        // Aqui poderia ter lógica de envio real; para o exercício, apenas a mensagem:
        System.out.println("Pedido enviado...");
    }
}
