package AvancadoJava;

public class Adaga {
    private String nome;
    private int danoBase;
    private double chanceCritico;
    private double multiplicadorCritico;

    public Adaga(String nome) {
        this.nome = nome;
    }



    public void afiar() {
        danoBase += 2;
        System.out.println("A adaga foi afiada! Novo dano: " + danoBase);
    }

    @Override
    public String toString() {
        return "Adaga{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
