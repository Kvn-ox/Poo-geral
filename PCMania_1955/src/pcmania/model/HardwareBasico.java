package pcmania.model;

public class HardwareBasico {
    private String nome;       // Ex.: "Processador Core i3", "Memória RAM", "HD"
    private int capacidade;    // Mhz ou Gb (apenas número)

    public HardwareBasico(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() { return nome; }
    public int getCapacidade() { return capacidade; }

    // Exibe unidade amigável (Mhz para processador; Gb para o resto)
    public String descricaoCapacidade() {
        if (nome != null && nome.toLowerCase().contains("processador")) {
            return capacidade + " Mhz";
        }
        return capacidade + " Gb";
    }

    @Override
    public String toString() {
        return nome + " (" + descricaoCapacidade() + ")";
    }
}
