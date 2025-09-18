package pcmania.model;

public class Cliente {
    private String nome;
    private String cpf;

    private Computador[] computadores; // carrinho do cliente
    private int qtdComprados = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[100]; // capacidade arbitrária
    }

    public boolean comprar(Computador pc) {
        if (qtdComprados < computadores.length) {
            computadores[qtdComprados++] = pc;
            return true;
        }
        return false;
    }

    public float calculaTotalCompra() {
        float total = 0f;
        for (int i = 0; i < qtdComprados; i++) {
            if (computadores[i] != null) {
                total += computadores[i].getPreco();
            }
        }
        return total;
    }

    public Computador[] getComputadores() {
        Computador[] usados = new Computador[qtdComprados];
        for (int i = 0; i < qtdComprados; i++) {
            usados[i] = computadores[i];
        }
        return usados;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public int getQuantidadeComprada() { return qtdComprados; }
}
