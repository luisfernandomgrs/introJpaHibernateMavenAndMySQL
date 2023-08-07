package com.estudando;

import com.estudando.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("intro-Jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 1);
        if (p == null) {
            System.out.println("initialing database");

            Pessoa p1 = new Pessoa(null, "Ana Paula Silva", "ana.silva@gmail.com");
            Pessoa p2 = new Pessoa(null, "João Carlos Santos", "joao.santos@gmail.com");
            Pessoa p3 = new Pessoa(null, "Maria Eduarda Oliveira", "maria.oliveira@gmail.com");

            em.getTransaction().begin();
            em.persist(p1);
            em.persist(p2);
            em.persist(p3);
            em.getTransaction().commit();

            System.out.println("initialed database");
        } else {
            System.out.println(p);
        }

        em.close();
        emf.close();
        System.out.println("Finalizado");
    }
}