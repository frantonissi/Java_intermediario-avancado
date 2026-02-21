//Usando essa programacao para aprender generics

package AvancadoJava;

public class Main {
    public static void main (String[] args){
    BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
    bolsaNinja.adicionarFerramenta(new Adaga("Adaga boladona"));
    bolsaNinja.adicionarFerramenta(new Shuriken("Shuriken boladona"));
    bolsaNinja.adicionarFerramenta(new Pergaminho("Bola de fogoo"));
        System.out.println("Itens da bolsa ninja: ");
    bolsaNinja.mostrarFerramenta();

    bolsaNinja.exxcluirFerramenta(0);
        System.out.println("Itens atualizados da bolsa ninja: ");
        bolsaNinja.mostrarFerramenta();
        //testando o main
    }
}