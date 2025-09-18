package pcmania.model;

public class Computador {
    private String marca;
    private float preco;

    private HardwareBasico[] hardwares; // sem ArrayList
    private int qtdHardwares = 0;

    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB; // 0..1

    public Computador(String marca, float preco, int capacidadeDeHardwares) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = new HardwareBasico[capacidadeDeHardwares];
    }

    public void setSistemaOperacional(SistemaOperacional so) {
        this.sistemaOperacional = so;
    }

    public boolean adicionarHardwareBasico(HardwareBasico hb) {
        if (qtdHardwares < hardwares.length) {
            hardwares[qtdHardwares++] = hb;
            return true;
        }
        return false;
    }

    // conforme o diagrama
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    // conforme o diagrama
    public void mostrarPCConfigs() {
        System.out.println("----- Computador (" + marca + ") -----");
        System.out.printf("Preço: R$ %.2f%n", preco);

        if (sistemaOperacional != null) {
            System.out.println("Sistema Operacional: " + sistemaOperacionalToString());
        }

        System.out.println("Hardware Básico(s):");
        for (int i = 0; i < qtdHardwares; i++) {
            System.out.println("  - " + hardwares[i]);
        }

        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB);
        }
        System.out.println("--------------------------------------");
    }

    private String sistemaOperacionalToString() {
        return (sistemaOperacional == null) ? "-" : sistemaOperacional.toString();
    }

    public float getPreco() {
        return preco;
    }
}
