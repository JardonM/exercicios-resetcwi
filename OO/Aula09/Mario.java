package OO.Aula09;

public class Mario extends Personagem {
    private Yoshi yoshi;

    public Mario() {
        this.setNome("Mario");
        this.setAltura(1.5);
        this.setIdade(40);
    }

    public void estaMontado() {
        if (this.yoshi != null) {
            System.out.println("Mario está montado no Yoshi.");
        } else {
            System.out.println("Mario não está montado no Yoshi.");
        }
    }

    public void montarNoYoshi(Yoshi yoshi) {
        this.yoshi = yoshi;
    }

    public void saltar() {
        System.out.println("Este personagem pula " + (this.getAltura() * 0.5) + "m.");
    }



}
