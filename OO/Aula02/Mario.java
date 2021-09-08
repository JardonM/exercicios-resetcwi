package OO.Aula02;

public class Mario {
    String tamanho;
    boolean correr;
    boolean andar;
    String cor;
    String poderes;

    void status() {
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Está correndo: " + this.correr);
        System.out.println("Está andando: " + this.andar);
        System.out.println("Cor: " + this.cor);
        System.out.println("Poderes: " + this.poderes);
    }

    void correndo() {
        if(this.andar == true){
            this.andar = false;
            this.correr = true;
            System.out.println("Correndo...");
        }else{
            System.out.println("Mas ja estou correndo...");
        }
    }

    void andando() {
        if(this.correr == true){
            this.andar = true;
            this.correr = false;
            System.out.println("Andando...");
        }else{
            System.out.println("Ja estou andando...");
        }
    }
}
