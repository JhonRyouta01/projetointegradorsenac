/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.academico.bean;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author sala302b
 */
public class Bean implements Serializable{
    
    public void addMessageInfo(String message){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage("Sucesso", new FacesMessage(FacesMessage.SEVERITY_INFO, message,"Sucesso"));
    }
    public void addMessageErro(String message){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage("Erro", new FacesMessage(FacesMessage.SEVERITY_ERROR, message, "Erro"));
    }
    
    public void addMessageWarnning(String message){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage("Aviso", new FacesMessage(FacesMessage.SEVERITY_WARN, message, "Aviso"));
    }
}
