

import java.util.Scanner;

public class Aula08Atv02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Digite um número: ");
            numero = input.nextInt();
            if((numero > 0)&&(numero < 8)){
                switch (numero){
                    case 1:
                        System.out.println("Domingo");
                        break;
                    case 2:
                        System.out.println("Segunda-feira");
                        break;
                    case 3:
                        System.out.println("Terça-feira");
                        break;
                    case 4:
                        System.out.println("Quarta-feira");
                        break;
                    case 5:
                        System.out.println("Quinta-feira");
                        break;
                    case 6:
                        System.out.println("Sexta-feira");
                        break;
                    case 7:
                        System.out.println("Sábado");
                        break;
                }
            }else{
                System.out.println("Valor inválido!");
            }
        }while (numero > 7);
        input.close();
    }
}
