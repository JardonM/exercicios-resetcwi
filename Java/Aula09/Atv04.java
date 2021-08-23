import java.util.Scanner;

public class Atv04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Você gostaria de ver a tabúada de qual número?");
        int numero = input.nextInt();

        int tabuada;

        System.out.println("Tabuada do " + numero + ": ");
        for(int i = 1; i <= 10; i++){
            tabuada = i * numero;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }
    }
}
