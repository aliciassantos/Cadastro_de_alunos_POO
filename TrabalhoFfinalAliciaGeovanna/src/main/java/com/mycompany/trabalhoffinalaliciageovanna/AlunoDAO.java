/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoffinalaliciageovanna;

import com.mycompany.trabalhoffinalaliciageovanna.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DTIC
 */
public class AlunoDAO {

    public Aluno salvarHibernate(Aluno novo) {
        Transaction transaction = null;
        Session session = null;
        Aluno alunoGerenciado = null; //para armazenar a entidade retornada pelo merge

        try {
            //Obtém uma sessão do HibernateUtil
            session = HibernateUtil.openSession();

            //inicia uma transação
            transaction = session.beginTransaction();

            //Salva o projeto
            alunoGerenciado = (Aluno) session.merge(novo);
            //confirma a transação, enviando as mudanças para o banco
            transaction.commit();

            String operacao = (novo.getMatricula() != null) ? "atualizado" : "salvo";
            System.out.println("Aluno " + operacao + " com sucesso! Matrícula: " + alunoGerenciado.getMatricula());
        } catch (HibernateException e) {
            //se houver erro, desfaz a transação
            if (transaction != null) {
                transaction.rollback();
            }

            //imprime o erro detalhado
            e.printStackTrace();
        } catch (Exception e) {
            //captura outras exceções
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return alunoGerenciado;
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
        Session session = null;
        boolean sucesso = false;

        try {
            session = HibernateUtil.openSession();
            transaction = session.beginTransaction();

            //encontra e anexa a entidade à sessão 
            Aluno alunoParaExcluir = session.get(Aluno.class, matricula);

            if (alunoParaExcluir != null) {
                session.remove(alunoParaExcluir);

                //confirma a transação
                transaction.commit();
                sucesso = true;
                System.out.println("Aluno com matrícula " + matricula + " removido com sucesso!");
            } else {
                System.out.println("Erro: Aluno com matrícula " + matricula + " não encontrado.");
                transaction.rollback();
            }
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            if (session != null && session.isOpen()) {
                session.close();         
            }
        }
            return sucesso;        
    }
}
