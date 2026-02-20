package AvancadoJava;
import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello Word");
        List<String> lista = new ArrayList<>();
        lista.add("Hello");
        lista.add("Fernanda");
        lista.add("Francisco");
        lista.add("Francisco roberto");
        lista.add("Francisco Souza");
        lista.add("Francisco seila");
        lista.add("Lucas");
        lista.add("Sei la");

        System.out.println(lista.get(2));
        System.out.println("Lista " + lista);
        System.out.println("////////////////");

        Set<String> setStrings = new HashSet<>();
        setStrings.add("Joao");
        setStrings.add("Fiote");
        setStrings.add("Friv");
        System.out.println("Hash " + setStrings);
        System.out.println("////////////////");

        Map<String, String> map = new HashMap<>();
        map.put("Nome","  Francisco");
        map.put("Sobrenome","  Tonissi");
        System.out.println(map.get("Sobrenome"));


        System.out.println("////////////////");
        Queue<String> queue = new LinkedList<>();
        queue.add("Francisco");
        queue.add("Loiro");
        queue.add("Acampamento");
        System.out.println("Queue" + queue);
        String variavel = queue.poll();
        System.out.println(variavel);
        System.out.println("Queue" + queue);
        /*
        * poll: remove o primeiro valor
        * peek: pega o primeiro valor sem remove-lo
        * remove: ele remove a primeira pessoa, mas e diferente do poll, pq ele nao permite remover se a fila estiver vazia
        ja o pool permite remover, ai ele retorna NULL
        * */
        System.out.println("////////////////");

        LinkedList<String> linkedList = new LinkedList<>();//Isso é uma lista encadeada

        List<String> franciscos = lista.stream().filter(nome -> nome.startsWith("Francisco")).map(String::toUpperCase).toList();
        System.out.println("Lista de francisco: " + franciscos);


    }
    //principais estruturas de dados:
    /*
    * Map:
    * Set: Nao pode ter duplicadas
    * Mylist: pode ter duplicadas
    *Queue: Usadas para processamentos em ordem
    *
    * records são classes imutaveis, e a sintase é public record Nome('aqui poe os atributos'){}
    *
    * Stream API serve para realizar operaçoes funcionais nas nossas collections
    (estruturas de dados), usando ela da pra usar:MAP, FILTER, REDUCE, agregacao

    filter: filtra os elementos de uma colecao
    map: transforma os elementos de uma colecao
    * reduce: reduz os elementos de uma colecao
    * agregacoes: soma, media, contagem
    * */

}