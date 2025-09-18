package pcmania.model;

public class SistemaOperacional {
    private String nome;   // Ex.: "macOS Sequoia", "Windows 8", "Windows 10"
    private int tipo;      // 64 (bits)

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nome + " (" + tipo + " bits)";
    }
}
