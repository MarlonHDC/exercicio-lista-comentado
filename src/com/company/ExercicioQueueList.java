package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueueList {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println("A fila atual é " + filaBanco);

        String clienteASerAtendido = filaBanco.poll(); // O Poll faz com que o primeiro da fila seja atendido;
        System.out.println("O primeiro cliente a ser atendido é " + clienteASerAtendido);

        System.out.println("Agora restaram na fila " + filaBanco);

        String primeiCliente = filaBanco.peek();//O "peek" serve apenas saber quem é o primeiro da fila atualmente, sem tirá-lo;
        System.out.println("Agora o próximo é " + primeiCliente);

        filaBanco.element();//O método "element" também retorna a fila, PORÉM, ele tem outra funcionalidade principal;
        System.out.println("Buscando com element temos " + filaBanco);

        //filaBanco.clear();// Agora vamos esvaziar a lista para aplicar o método "element" que retorna um erro caso não exista ninguém na fila;

        String primeitoClienteOuErro = filaBanco.element();//O "element" deve retornar um erro caso a fila esteja vazia ou inexista o primeiro da fila;
        System.out.println( primeitoClienteOuErro);

        // Podemos navegar da mesma forma como navegamos em "listas", por exemplo com um "for" ;

        for (String client: filaBanco) { //exibindo fila com um "for each"
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();// Exibindo com iterator, "hasNext" e "next";
        //while (iteratorFilaBanco.hasNext())
            System.out.println("Exibindo fila com iterator " + iteratorFilaBanco.next());

        // "size" para saber quantos elementos na fila;
        System.out.println("A fila possui " + filaBanco.size() + " elementos ");
        // "isEmpty" para saber se a fila está vazia;
        System.out.println("A fila está vazia? " + filaBanco.isEmpty());

        // Adicionando uma pessoa verificaremos que ela irá para o final da fila;
        filaBanco.add("Adalberto");
        System.out.println(filaBanco);

    }
}
