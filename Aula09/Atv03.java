import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] valores = new double[5];
        double maior = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i+1) + "° valor:");
            valores[i] = input.nextDouble();
            if(valores[i] > maior){
                maior = valores[i];
            }
        }
        System.out.println("O maior número foi: " + maior);

    }
}
