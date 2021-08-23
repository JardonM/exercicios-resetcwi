import java.util.Scanner;

public class AlunoResetLeituraTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + nome);
	
	input.close();
    }
}
