
package br.com.senac.academico.dao;

import br.com.senac.academico.model.Professor;


public class ProfessorDAO extends DAO<Professor>{
    
    public ProfessorDAO() {
        super(Professor.class);
    }
    
    
    
    public static void main(String[] args) {
        
        ProfessorDAO dao = new ProfessorDAO() ; 
        Professor professor = new Professor(); 
      
        
        professor.setNome("Daniel");
        professor.setCidade("Serra");
        professor.setEmail("danielscpereira@gmail.com");
        professor.setCpf("06999664");
        professor.setEndereco("Rua j ");
        professor.setNumero(100);
        
        
        dao.save(professor);
        
        
    }
    
}
