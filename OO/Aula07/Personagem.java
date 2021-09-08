package OO.Aula07;

public class Personagem {
    private String nome;
    private int idade;
    private double altura;
    private double velocidade;
    private double forca;
    private String cor;
    private String poderes;
    private int estamina;
    private int moedas;
    private int vidas;

   public Personagem(String nome, int idade, double altura) {
       this.nome = nome;
       this.idade = idade;
       this.altura = altura;
       this.estamina = 100;
       this.velocidade = 1;
       this.forca = 5;
       this.moedas = 0;
       this.vidas = 1;
       this.poderes = "soco, chute, salto";
       if (this.nome.equals("Luigi")) {
           this.cor = "verde";
       } else {
           this.cor = "vermelho";
       }
   }

   public void saltar() {
       if (this.nome == "Mario") {
           System.out.println("Este personagem pula " + (this.altura * 0.5) + "m.");
       } else if (this.nome == "Luigi") {
           System.out.println("Este personagem pula " + (this.altura * 2) + "m.");
       }
   }

    public void revigorar() {
        this.estamina = 100;
    }

    public void morrer() {
        this.vidas--;
        this.estamina = 0;
        if (this.vidas < 0) {
            this.vidas = 0;
        } else {
            this.revigorar();
        }
    }

    public void coletarMoedas() {
        this.moedas++;
        if(this.moedas == 10) {
            this.moedas = 0;
            this.vidas++;
        }
    }

    public void perdeEstamina() {
        if(this.estamina > 0) {
            this.estamina = this.estamina - 10;
            if (this.estamina < 0) {
                this.estamina = 0;
            }
        }
    }

    public void recuperaEstamina() {
        this.estamina += 5;
        if(this.estamina > 100) {
            this.estamina = 100;
        }
    }


    protected void comerCogumelo() {
        this.mudaForca();
        this.mudaAltura();
        this.mudaVelocidade();
    }

    private void mudaForca() {
        this.forca = this.forca * 3;
    }

    private void mudaVelocidade() {
        this.velocidade = this.velocidade * 3;
    }

    private void mudaAltura() {
        this.altura = this.altura * 2;
    }

    public void status() {
        System.out.println("--------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Estamina: " + this.estamina);
        System.out.println("Tamanho: " + this.altura);
        System.out.println("Força: " + this.forca);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Cor: " + this.cor);
        System.out.println("Poderes: " + this.poderes);
        System.out.println("Moedas: " + this.moedas);
        System.out.println("Vidas: " + this.vidas);
        System.out.println("--------------------------");
    }


}
