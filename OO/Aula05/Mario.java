package OO.Aula05;

public class Mario {
    private String nome;
    private int idade;
    private double altura;
    private double velocidade;
    private double forca;
    private String cor;
    private String poderes;
    private int estamina;

    public Mario() {
        setNome("Mario Bros");
        setIdade(40);
        setEstamina(100);
        setAltura(1.5);
        setVelocidade(1);
        setForca(5);
        setCor("vermelho");
        setPoderes("soco, chute, salto");
    }

    public Mario(String n, int i, int e, double a) {
        setNome(n);
        setIdade(i);
        setEstamina(e);
        setAltura(a);
        setVelocidade(1);
        setForca(5);
        setCor("vermelho");
        setPoderes("soco, chute, salto");
    }

    public void perdeEstamina() {
        if(this.getEstamina() > 0) {
            this.setEstamina(this.getEstamina() - 10);
            if (this.getEstamina() < 0) {
                this.setEstamina(0);
            }
        }
    }

    public void recuperaEstamina() {
        this.setEstamina(this.getEstamina() + 5);
        if(this.getEstamina() > 100) {
            this.setEstamina(100);
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
        System.out.println("--------------------------");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidade() {
        return  this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getForca() {
        return this.forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPoderes() {
        return this.poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    public int getEstamina() {
        return this.estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
}