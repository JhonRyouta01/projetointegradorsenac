
package br.com.senac.academico.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    
     private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("AcademicoPU");
     
     
     public static EntityManager getEntityManager(){
         try{
             return emf.createEntityManager() ; 
         }catch(Exception ex){
             ex.printStackTrace(); 
             throw new RuntimeException("Erro ao acessar banco de dados.") ; 
         }
     }
     
  
}
