
package br.com.senac.academico.dao;

import br.com.senac.academico.model.Aluno;

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
    
    
}
