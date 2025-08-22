public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;
    public Kart(Motor motor) {
        this.motor = motor;
    }

    void pular(){
        System.out.println("pular");
    }

    void soltarTurbo(){
        System.out.println("soltar turbo ====== BB´´");
    }

    void fazerDrift(){
        System.out.println("Driff==t");
    }
}
