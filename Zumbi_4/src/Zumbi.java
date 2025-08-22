public class Zumbi {

    String nome;
    double vida;

    void mostrarVida() {

        System.out.println(vida);
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {


        if (quantia <= vida) {
            System.out.println(nome + " Transferindo Vida para -> " + zumbiAlvo.nome);
            zumbiAlvo.vida += quantia;
            vida -= quantia;
            return true;

        } else {
            System.out.println(nome + " Nao ocorre transferencia-> " + zumbiAlvo.nome);
            return false;

        }

    }
}