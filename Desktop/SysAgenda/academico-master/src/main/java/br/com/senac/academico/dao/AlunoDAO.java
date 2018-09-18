
package br.com.senac.academico.dao;

import br.com.senac.academico.model.Aluno;
import java.util.List;
import javax.persistence.Query;

public class AlunoDAO extends DAO<Aluno>{
    
    public AlunoDAO() {
        super(Aluno.class);
    }
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Daniel");
        aluno.setCidade("Serra");
        aluno.setEmail("danielscpereira@gmail.com");
        aluno.setCpf("06999664");
        aluno.setEndereco("Rua j ");
        aluno.setNumero(100);
        
        
        AlunoDAO dao = new AlunoDAO(); 
        
        dao.save(aluno);
        
    }
    
    public List<Aluno> findByFiltro(String codigo, String nome){
        this.em = JPAUtil.getEntityManager();
        List<Aluno> lista;
        em.getTransaction().begin();
    
    
        StringBuilder sql = new StringBuilder("from Aluno a where 1=1 ");
        
        if (codigo != null && !codigo.isEmpty()) {
            sql.append(" amd a.id = :Id ");
        }
        
        if (nome != null && !nome.isEmpty()) {
            sql.append(" and a.nome like :Nome ");
        }
        
        Query q = em.createQuery(sql.toString());
        
        if (codigo != null && !nome.isEmpty()){
            q.setParameter("Nome", "%" + nome + "%");
        }
        
        lista = q.getResultList();
        
        em.getTransaction().commit();
        em.close();
        
        return lista;     
        
        
    }
    
}
