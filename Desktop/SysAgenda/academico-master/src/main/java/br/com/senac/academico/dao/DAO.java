package br.com.senac.academico.dao;

import java.util.List;
import javax.persistence.EntityManager;

public abstract class DAO<T> {

    protected EntityManager em;

    private final Class<T> entidade;

    public DAO(Class<T> entidade) {
        this.entidade = entidade;
    }

    public void save(T entity) {
        this.em = JPAUtil.getEntityManager(); //abri conexao
        em.getTransaction().begin(); // comecei uma transacao
        em.persist(entity); // inserir
        em.getTransaction().commit(); // finalizei uma transacao
        em.close(); // fechar conexao 

    }

    public void update(T entity) {
        this.em = JPAUtil.getEntityManager(); //abri conexao
        em.getTransaction().begin(); // comecei uma transacao
        em.merge(entity); // inserir
        em.getTransaction().commit(); // finalizei uma transacao
        em.close(); // fechar conexao 
    }

    public void delete(T entity) {
        this.em = JPAUtil.getEntityManager(); //abri conexao
        em.getTransaction().begin(); // comecei uma transacao
        em.remove(em.merge(entity)); // inserir
        em.getTransaction().commit(); // finalizei uma transacao
        em.close(); // fechar conexao 
    }

    public T find(long id) {
        this.em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        T t = em.find(entidade, id);
        em.getTransaction().commit();
        em.close();
        return t;
    }

    public List<T> findAll() {
        this.em = JPAUtil.getEntityManager();
        List<T> lista;
        em.getTransaction().begin();
        lista = em.createQuery("from " + entidade.getName() + " e").getResultList();
        em.getTransaction().commit();
        em.close();

        return lista;
    }

}
