/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.academico.bean;

import br.com.senac.academico.dao.AlunoDAO;
import br.com.senac.academico.model.Aluno;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named(value = "alunoBean")
@ViewScoped
public class AlunoBean implements Serializable{
    
    private Aluno aluno;
    private AlunoDAO dao;
    
    public AlunoBean (){
        this.aluno = new Aluno();
        this.dao = new AlunoDAO();
    }
    
    public void salvar(){
        if(this.aluno.getId() == 0){
            dao.save(aluno);
            
        }else{
            dao.update(aluno);
        }
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
}
