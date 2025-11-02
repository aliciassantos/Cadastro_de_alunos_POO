/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoffinalaliciageovanna;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author geova
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // O .configure() procura automaticamente o arquivo hibernate.cfg.xml que criei
            return new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            System.err.println("Erro na criação da SessionFactory na inicialização. " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    // Método para fornecer a SessionFactory para outras classes
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    // Método para fechar os recursos do Hibernate quando a aplicação for encerrada
    public static void shutdown() {
        getSessionFactory().close();
    }
}
