import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 11;
        while ((numero < 0) || (numero > 10)){
            System.out.println("Digite um número entre 0 e 10:");
            numero = input.nextInt();
            if((numero < 0) || (numero > 10)){
                System.out.println("Número inválido!");
            }else{
                System.out.println(numero);
            }
        }
        input.close();
    }
}
