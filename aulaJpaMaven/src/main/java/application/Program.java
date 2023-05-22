package application;

import domain.Pessoa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        Pessoa pessoa = em.find(Pessoa.class,2);
        System.out.println(pessoa);
        //addObject(em);

       em.close();
       emf.close();
        System.out.println("Finished!");
    }

    public static void addObject(EntityManager em){
        Pessoa test = new Pessoa(null,"test name","email@test.com");
        em.getTransaction().begin();
         em.persist(test);
        em.getTransaction().commit();
        System.out.println("add finished!");

    }
}
