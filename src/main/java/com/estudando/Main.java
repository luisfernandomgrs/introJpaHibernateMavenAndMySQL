package com.estudando;

import com.estudando.dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Ana Paula Silva", "ana.silva@gmail.com");
        Pessoa p2 = new Pessoa(2, "João Carlos Santos", "joao.santos@gmail.com");
        Pessoa p3 = new Pessoa(3, "Maria Eduarda Oliveira", "maria.oliveira@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}