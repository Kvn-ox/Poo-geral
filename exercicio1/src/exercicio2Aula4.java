import java.util.Random;
import java.util.Scanner;

public class exercicio2Aula4 {

    public static void main(String[] args){


        Scanner entrada_numero = new Scanner(System.in);

        Random rand = new Random();
        int comparacao = rand.nextInt();
        Scanner entradanumero = new Scanner(System.in);

        do{
            System.out.println("Qual numero?");
            if (entradanumero.nextInt() != comparacao)
            {
                System.out.println("valor errado!");
            }
            else {
                System.out.println("Valor Certo!");
            }
        } while (comparacao == entradanumero.nextInt());

        entrada_numero.close();
    }

}
