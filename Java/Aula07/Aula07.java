import java.util.Scanner;

public class Aula07 {
    public static void main(String[] args) {
        System.out.println("Olá! Gostaria de fazer qual operação?");
        System.out.println("SOMA[1]   MEDIA[2]   SALARIO[3]");

        Scanner input = new Scanner(System.in);

        int op = input.nextInt();

        switch (op){
            case 1:
                System.out.println("Digite o primeiro número: ");
                double primeiroNumero = input.nextDouble();
                System.out.println("Digite o segundo número: ");
                double segundoNumero = input.nextDouble();
                double soma = primeiroNumero + segundoNumero;
                System.out.println("Soma: " + soma);
                break;
            case 2:
                double[] nota = new double[5];
                for (int i = 1; i < nota.length; i++){
                    System.out.println("Digite a " + i + "ª nota: ");

                    nota[i] = input.nextDouble();
                }
                double media = (nota[1] + nota[2] + nota[3] + nota[4])/4;
                System.out.println("Sua média é: " + media);
                break;
            case 3:
                System.out.println("Qual o valor que você recebe por hora trabalhada? ");
                double valorHora = input.nextDouble();
                System.out.println("Quantas horas você trabalhou neste mês? ");
                double horasTrabalhadas = input.nextDouble();
                double salario = valorHora * horasTrabalhadas;
                System.out.println("O seu Salário será de: " + salario);
                break;
        }
        input.close();
    }
}
