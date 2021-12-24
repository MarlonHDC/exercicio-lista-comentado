package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        // Adicionando a lista pelo método "add";
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println("Nomes na ordem de criação " + nomes);

        nomes.set(2, "Larissa"); // "set" substitui o nome na Arrays;
        System.out.println("Larissa na segunda posição" + nomes);
        // OBS: Sempre lembrar que Arrays e listas começa a conta do número "0";
        Collections.sort(nomes); // "sort" coloca os nomes em ordem alfabética;

        System.out.println("Nomes em ordem alfabética " + nomes);

        nomes.set(2, "Godofredo");
        System.out.println("Agora Godofredo ocupa a posição nº 2 " + nomes);

        //Removendo o elemento do índice
        nomes.remove(4);// remove o "elemento" do índice de posição 4. Neste caso, Maria.
        System.out.println("Removendo Maria da posição 4" + nomes);

        //Para saber a posição de um nome na lista;
        int posicao = nomes.indexOf("Godofredo");
        System.out.println("Qual a posição de Godofredo na lista? " + posicao);

        //Ao colocar um objeto que não existe na lista, o programa retorna "-1";
        posicao = nomes.indexOf("Clodoildo");
        System.out.println("Qual a posição de Clodoildo na lista? " + posicao);

        // Removendo o próprio objeto (nome);
        nomes.remove("Godofredo");
        System.out.println("Removendo o Godofredo pelo nome (objeto) " + nomes);

        //Usando Get
        String nome = nomes.get(1); // puxando pela string "nome";
        System.out.println("Imprimindo apenas o objeto de posição " + nome);

        //Para percorrer a lista (For);
        for (String nomeDoItem: nomes) {
            System.out.println("--->" + nomeDoItem);
        }

        // OUTRA forma de percorrer a lista (Iterator);
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) { // Retorna um boleano (True) sempre que houver mais um elemento na lista;
            System.out.println("-----> " + iterator.next());
        }


        // Para saber quantos elementos tem na lista;
        int tamanho = nomes.size();
        System.out.println("O tamanho atual da lista é " + tamanho);

        nomes.remove("Pedro");// Removendo 1 elemento;
        nomes.remove("Larissa");// Removendo outro elemento;
        tamanho = nomes.size();// Passando novamente o "size" veremos que existem 2 elementos a menos;
        System.out.println("O tamanho da lista agora é " + tamanho);

        // Para saber se existe um elemento na lista;
        System.out.println(nomes);// Temos Anderson e Carlos. Vamos verificar no código;

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println("Existe um Anderson na lista? -" + temAnderson);// Vai indicar "true" indicando que tem Anderson;
        // Agora vamos ver um nome que não tem;
        boolean temFernando = nomes.contains("Fernando");//Vai retornar falso
        System.out.println("Existe um Fernando na lista? -" + temFernando);

        // PAra saber se a lista está vazia;
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println("A lista está vazia -" + listaEstaVazia);

        //Para limpar a lista;
        nomes.clear(); //Comando para limpar a lista;
        listaEstaVazia = nomes.isEmpty();//passando mais uma vez o argumento;
        System.out.println(listaEstaVazia);//Agora a lista está vazia;


    }
}
