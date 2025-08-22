public class Main {
    public static void main(String[] args) {

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        Motor m1 = new Motor();
        Motor m2 = new Motor();

        Kart k1 = new Kart(m1);
        Kart k2 = new Kart(m2);

        k1.piloto = p1;
        k2.piloto = p2;

        p1.nome = "Kevin";
        p2.nome = "Kratos";

        p1.vilao = false;
        p2.vilao = true;

        m1.velocidadeMaxima = 135;
        m2.velocidadeMaxima = 65;

        m1.cilindradas = "150";
        m2.cilindradas = "100";

        k1.pular();
        k2.pular();

        k1.soltarTurbo();
        k2.soltarTurbo();

        k1.fazerDrift();
        k2.fazerDrift();

        m1.mostraInfo();
        m2.mostraInfo();














    }
}