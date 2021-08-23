import java.util.Scanner;

public class Aula08Atv01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota = 0;
        for(int i = 1; i <= 4; i++){
            System.out.println("Digite a " + i + "ª nota: ");
            nota += input.nextDouble();
        }
        nota = nota/4;
        System.out.println("Nota: " + nota);
        if((nota >= 7) && (nota < 10)){
            System.out.println("Aluno aprovado.");
        }else if(nota < 7){
            System.out.println("Aluno reprovado.");
        }else if(nota == 10){
            System.out.println("Aluno aprovado com louvores.");
        }
        input.close();
    }
}
