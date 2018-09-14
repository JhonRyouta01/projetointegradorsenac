/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.academico.bean;

import br.com.senac.academico.dao.ProfessorDAO;
import br.com.senac.academico.model.Professor;
import com.sun.javafx.logging.PulseLogger;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value = "professorBean")
@ViewScoped
public class ProfessorBean implements Serializable{
    
    private Professor professor;
    private ProfessorDAO dao;
    
    public ProfessorBean (){
        this.professor = new Professor();
        this.dao = new ProfessorDAO();
    }
    
    public void salvar(){
        if(this.professor.getId() == 0){
            dao.save(professor);
            
            
        }else{
            dao.update(professor);
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    
    
    
}
