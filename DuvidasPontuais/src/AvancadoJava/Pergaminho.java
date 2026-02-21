package AvancadoJava;

public class Pergaminho {
    private String magia;
    private int danoMagico;
    private int custoMana;
    private boolean consumido;

    public Pergaminho(String magia) {
        this.magia = magia;

    }

    public int usar(int manaAtual) {

        if (consumido) {
            System.out.println("O pergaminho já foi usado.");
            return 0;
        }

        if (manaAtual < custoMana) {
            System.out.println("Mana insuficiente!");
            return 0;
        }

        consumido = true;

        System.out.println("Você lançou " + magia + " causando " + danoMagico + " de dano!");
        return danoMagico;
    }

    public int getCustoMana() {
        return custoMana;
    }

    public boolean isConsumido() {
        return consumido;
    }

    @Override
    public String toString() {
        return "Pergaminho{" +
                "magia='" + magia + '\'' +
                '}';
    }
}
