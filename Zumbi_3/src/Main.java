public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Kevin";
        zumbi2.nome = "Obiwan";

        zumbi1.vida = 100;
        zumbi2.vida = 80;

        int quantia = 20;

        zumbi1.vida = zumbi2.vida;

        zumbi1.mostrarVida();
        zumbi2.mostrarVida();



    }
}