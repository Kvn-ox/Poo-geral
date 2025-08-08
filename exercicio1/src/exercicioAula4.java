import java.util.Scanner;

public class exercicioAula4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o num de alunos");
        int numAlunos = entrada.nextInt();

        switch (numAlunos) {
            case 10:
            case 20:
                System.out.println("aula na sala I-16");
                break;

            case 30:
                System.out.println("aula na sala I-22");
                break;

            default:
                System.out.println("Sala nao encontrada");
        }
        entrada.close();
    }
}