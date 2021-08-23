import java.util.Scanner;

public class Aula10Atv02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] idade = new int[10];
        int maiores = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Digite a " + (i+1) + "ª idade: ");
            idade[i] = input.nextInt();
            if(idade[i] >= 18){
                maiores++;
            }
        }
        System.out.println("Idades: ");
        for(int i = 0; i < 10; i++){
            System.out.print(idade[i] + " ");
        }
        System.out.println();
        System.out.println("Quantidade de pessoas com mais de 18 anos: " + maiores);

    }
}
