
package br.com.senac.academico.dao;

import br.com.senac.academico.model.Aluno;
import br.com.senac.academico.model.Curso;
import br.com.senac.academico.model.Professor;
import java.util.List;


public class CursoDAO extends DAO<Curso>{
    
    public CursoDAO() {
        super(Curso.class);
    }
    
    
     public static void main(String[] args) {
     
         CursoDAO dao = new CursoDAO() ; 
         ProfessorDAO professorDAO = new ProfessorDAO();
         AlunoDAO alunoDAO = new AlunoDAO() ; 
         
         Professor professor = professorDAO.find(1) ; 
         
         List<Aluno> alunos = alunoDAO.findAll() ; 
         
         Curso curso = new Curso() ; 
         curso.setNome("Tecnico de Informatica");
         curso.setProfessor(professor);
         curso.setAlunos(alunos);
         
         
         dao.save(curso);
         
         
         
         
     
     }
    
    
    
}
