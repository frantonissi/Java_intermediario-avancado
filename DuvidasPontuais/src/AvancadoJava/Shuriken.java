package AvancadoJava;


public class Shuriken {
    private String nome;
    private int dano;
    private int quantidade;
    private boolean envenenada;

    public Shuriken(String nome) {
       this.nome = nome;
    }

    public int arremessar() {
        if (quantidade <= 0) {
            System.out.println("Você não tem mais shurikens!");
            return 0;
        }

        quantidade--;

        int danoFinal = dano;

        if (envenenada) {
            danoFinal += 5;
            System.out.println("A shuriken estava envenenada!");
        }

        System.out.println("Shuriken arremessada! Dano causado: " + danoFinal);
        return danoFinal;
    }

    public void recarregar(int qtd) {
        quantidade += qtd;
        System.out.println("Você recebeu " + qtd + " shurikens. Total: " + quantidade);
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Shuriken{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

