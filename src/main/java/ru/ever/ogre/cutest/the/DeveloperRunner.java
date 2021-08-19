package ru.ever.ogre.cutest.the;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import ru.ever.ogre.cutest.the.model.Developer;

import java.util.List;

public class DeveloperRunner {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory = new Configuration().configure().buildSessionFactory();

        DeveloperRunner developerRunner = new DeveloperRunner();

    }

    public Integer addDeveloper(String firstName, String lastName, String speciality, int experience) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Integer developerId = null;

        transaction = session.beginTransaction();
        Developer developer = new Developer(firstName, lastName, speciality, experience);
        developerId = (Integer) session.save(developer);
        transaction.commit();
        session.close();

        return developerId;
    }

    public void listDeveloper() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List<Developer> developers = session.createQuery("FROM Developer").list();
        for (Developer developer : developers)
            System.out.println(developer + "\n");
        session.close();
    }

    public void updateDeveloper() {}

    public void removeDeveloper() {}
}
