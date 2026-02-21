package AvancadoJava;
import java.util.ArrayList;
import  java.util.List;

public class BolsaNinja<T> { //pode ser qualquer coisa dentro do <>
    private List<T> ferramentas;

    //Construtor:
    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

    //colocar ferramentas no nosso aray:
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    public void exxcluirFerramenta(int numero){
        ferramentas.remove(numero);
    }

    //mostrar a lista
    public void mostrarFerramenta(){
        for(T ferramenta: ferramentas){
            System.out.println(ferramenta);
        }
    }
}
