public class Zumbi {

    String nome;
    double vida;

    void mostrarVida() {

        System.out.println(vida);
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia) {
        System.out.println(nome + " Transferindo Vida para -> " +zumbiAlvo.nome);
        zumbiAlvo.vida += quantia;
        vida -= quantia;
    }
}
