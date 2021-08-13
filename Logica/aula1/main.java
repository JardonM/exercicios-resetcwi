package Logica.aula1;


import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);

        System.out.println("Bom dia, você acaba de acordar e são 5:00 da manhã.");
        System.out.println("Você ja levantou da cama?");
        String estaEmPe = resp.nextLine();
        do {
            if (estaEmPe.equals("sim")){
                System.out.println("Você ja está de pé! Tá esperando a alma voltar pro corpo?");
            }else if(estaEmPe.equals("nao")){
                System.out.println("Levantando...");
                estaEmPe = "sim";
            }else{
                System.out.println("Digite apenas sim ou nao.");
            }
        }while (!estaEmPe.equals("sim"));
        System.out.println("Vamo bota uma roupa!");
        System.out.println("Você ja tem uma roupa em mãos?");
        String temRoupa = resp.nextLine();
        if(temRoupa.equals("sim")){
            System.out.println("Vestindo...");
        }else{
            System.out.println("Abrindo armario...");
            System.out.println("Vestindo...");
        }
        System.out.println("Bora passar um café?");
        String passarCafe = resp.nextLine();
        if(passarCafe.equals("sim")){
            System.out.println("A cafeteira ja está preparada?");
            String prontoCafeteira = resp.nextLine();
            if(prontoCafeteira.equals("sim")){
                System.out.println("Passando café..");
            }else{
                System.out.println("Bora bota o filtro, o café e a água então!");
                System.out.println("Passando café...");
            }
        }else{
            System.out.println("Então vai escovar os dentes!");
        }
        System.out.println("Já escovou os dentes?");
        String escovouDente = resp.nextLine();
        if(passarCafe.equals("nao") && escovouDente.equals("sim")){
            System.out.println("Nem tomou café, claro que ja.");
        }else if(escovouDente.equals("nao")){
            System.out.println("Então vai la!");
        }
        if(escovouDente.equals("nao") && passarCafe.equals("nao")){
            System.out.println("Ta esperando o que?");
        }

    }
}
