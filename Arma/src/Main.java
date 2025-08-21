public class Main {
    public static void main(String[] args) {

    Personagem persona = new Personagem();
    Arma arma = new Arma();

    persona.arma = arma;

    arma.resistencia = 10;
    arma.nome = "Desert Eagle";
    arma.poder = 100;
    arma.descricao = "Canhao de mao - One shot";


    persona.nome = "Kevin";
    persona.pontos = 20;

    System.out.println(" Voce é " + persona.nome + " e sua arma "+ arma.nome);

        arma.mostrarInfoArma();

        persona.usarArma();
        System.out.println(arma.resistencia);
        persona.tomarDano();
        System.out.println(persona.pontos);
    }
}