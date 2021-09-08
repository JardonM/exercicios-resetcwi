package OO.Aula10;

public abstract class Personagem {
    private String nome;
    private int idade;

    protected double altura;
    protected double velocidade;
    private double forca;
    private String poderes;
    private int estamina;
    private int moedas;
    private int vidas;

   public Personagem() {
       this.estamina = 100;
       this.velocidade = 1;
       this.forca = 5;
       this.moedas = 0;
       this.vidas = 1;
       this.poderes = "soco, chute, salto";
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


    public abstract void comerCogumelo();

    protected void mudaForca() {
        this.forca = this.forca * 3;
    }

    protected void mudaVelocidade() {
        this.velocidade = this.velocidade * 3;
    }

    protected abstract void crescer();

    public void status() {
        System.out.println("--------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Estamina: " + this.estamina);
        System.out.println("Tamanho: " + this.altura);
        System.out.println("Força: " + this.forca);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Poderes: " + this.poderes);
        System.out.println("Moedas: " + this.moedas);
        System.out.println("Vidas: " + this.vidas);
        System.out.println("--------------------------");
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void saltar() {
        System.out.println("Este personagem pula " + (this.getAltura() * 0.5) + "m.");
    }

    public void saltar(double altura) {
        System.out.println("O " + this.getNome() + " pulou " + altura * 1.5 + "m.");
    }
}
