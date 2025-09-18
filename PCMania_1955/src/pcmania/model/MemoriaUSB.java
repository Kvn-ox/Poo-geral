package pcmania.model;

public class MemoriaUSB {
    private String nome;      // Ex.: "Pen-drive", "HD Externo"
    private int capacidade;   // Em Gb

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() { return nome; }
    public int getCapacidade() { return capacidade; }

    @Override
    public String toString() {
        return nome + " (" + capacidade + " Gb)";
    }
}
