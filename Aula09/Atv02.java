import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[2];
        numeros[0] = 1;
        numeros[1] = 0;
        while (numeros[0] >= numeros[1]) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Digite o " + (i + 1) + "° valor:");
                numeros[i] = input.nextInt();
            }
        }
        if (numeros[0] < numeros[1]) {
            for (int cont = numeros[0]; cont <= numeros[1]; cont++) {
                System.out.println(cont);
            }
        }

    }
}