package application;

import domain.Pessoa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        //addObject(em);
        //findById(em,4);

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
    public static void findById(EntityManager em, Integer id){
        Pessoa pessoa = em.find(Pessoa.class,id);
        System.out.println(pessoa);
        System.out.println("findById finished!");
    }
}
