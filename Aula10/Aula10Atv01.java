
import java.util.Scanner;

public class Aula10Atv01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] numeros = new double[5];
        double [] numerosx2 = new double[5];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + "° valor: ");
            numeros[i] = input.nextDouble();
            numerosx2[i] = numeros[i] * 2;
        }
        System.out.println("Primeiro vetor: ");
        for(int i = 0; i < 5; i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        System.out.println("Segundo vetor: ");
        for(int i = 0; i < 5; i++){
            System.out.print(numerosx2[i]+" ");
        }

    }
}
