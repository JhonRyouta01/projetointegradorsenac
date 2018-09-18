
package br.com.senac.academico.bean;

import br.com.senac.academico.dao.AlunoDAO;
import br.com.senac.academico.model.Aluno;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.PostActivate;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value = "pesquisaAlunoBean")
@ViewScoped
public class PesquisarAlunoBean extends Bean{
    private Aluno alunoSelec;
    private List<Aluno> lista;
    private AlunoDAO dao;
    
    private String id;
    private String nome;

    public PesquisarAlunoBean(){
        
    }
    
    @PostConstruct
    public void init(){
        try {
            dao = new AlunoDAO();
            alunoSelec = new Aluno();
            lista = dao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            this.addMessageErro("Falha para carregar os itens");
        }
    }

    public void pesquisa(){
        try {
            this.lista = this.dao.findByFiltro(id,nome);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Aluno getAlunoSelec() {
        return alunoSelec;
    }

    public void setAlunoSelec(Aluno alunoSelec) {
        this.alunoSelec = alunoSelec;
    }

    public List<Aluno> getLista() {
        return lista;
    }

    public void setLista(List<Aluno> lista) {
        this.lista = lista;
    }

    public AlunoDAO getDao() {
        return dao;
    }

    public void setDao(AlunoDAO dao) {
        this.dao = dao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  public void salvar(){
      if(this.alunoSelec.getId() == 0){
          dao.save(alunoSelec);
          this.addMessageInfo("Salvo com sucesso");
          
      }else{
          dao.update(alunoSelec);
          this.addMessageInfo("Alterado com sucesso");
          
      }
      this.pesquisa();
  }
}
