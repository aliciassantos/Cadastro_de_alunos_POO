/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoffinalaliciageovanna;

import com.mycompany.trabalhoffinalaliciageovanna.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author geova
 */
public class AlunoDAO {

    public boolean salvarHibernate(Aluno aluno) {
        Transaction transaction = null; //transação do banco - inicializado como nulo.
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {//sessão de comunicação com o banco
            transaction = session.beginTransaction();//Inicia a transação no banco de dados. Qualquer operação de salvar ou excluir precisa estar dentro de uma transação
            session.save(aluno); // salva ou atualiza no banco
            transaction.commit();// confirma a transação
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    public Aluno buscarPorMatricula(String matricula) {
        try (Session session = HibernateUtil.openSession()) {
            // O get() é um método simples para buscar pelo ID (chave primária)
            // O primeiro argumento é a classe, o segundo é o ID.
            return session.get(Aluno.class, matricula);
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean excluirHibernate(String matricula) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            // Busca o aluno pela matrícula
            Aluno aluno = session.createQuery("FROM Aluno a WHERE a.matricula = :matricula", Aluno.class)
                    .setParameter("matricula", matricula)
                    .uniqueResult();// executa a consulta e retorna um unico obj 

            if (aluno != null) {
                session.delete(aluno); // marca para remover
                transaction.commit();   // confirma a remoção no banco
                return true;
            } else {
                if (transaction != null) {
                    transaction.rollback();
                }
                return false;
            }

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    public boolean existePorMatricula(String matricula) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Aluno aluno = session.get(Aluno.class, matricula);
        session.close();
        return aluno != null;
    }
}
