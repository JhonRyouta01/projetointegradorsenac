package livros;

public class Livro {
   private String titulo;
   private String editora;
   private int isbn;
   private int anoEdicao;
   
    public Livro(String titulo, String editora, int isbn, int anoEdicao) {
        this.titulo = titulo;
        this.editora = editora;
        this.isbn = isbn;
        this.anoEdicao = anoEdicao;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }
   
}
