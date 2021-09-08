package OO.Aula03;

public class Mario {
    protected String tamanho;
    private int velocidade;
    private  String forca;
    boolean correr;
    boolean andar;
    String cor;
    String poderes;

    protected void comerCogumelo() {
        this.mudaForca();
        this.mudaTamanho();
        this.mudaVelocidade();
    }

    private void mudaForca() {
        this.forca = "Forte";
    }

    private void mudaVelocidade() {
        this.velocidade = 50;
    }

    private void mudaTamanho() {
        this.tamanho = "Grande";
    }

    public void status() {
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Força: " + this.forca);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Está correndo: " + this.correr);
        System.out.println("Está andando: " + this.andar);
        System.out.println("Cor: " + this.cor);
        System.out.println("Poderes: " + this.poderes);
    }

    public void correndo() {
        if(this.andar == true){
            this.andar = false;
            this.correr = true;
            System.out.println("Correndo...");
        }else{
            System.out.println("Mas ja estou correndo...");
        }
    }

    public void andando() {
        if(this.correr == true){
            this.andar = true;
            this.correr = false;
            System.out.println("Andando...");
        }else{
            System.out.println("Ja estou andando...");
        }
    }
}
