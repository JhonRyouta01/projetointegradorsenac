package Generos;


public class Generos {
   private String biografia ; 
   private String memoria ; 
   private String conto ; 
   private String cronica ; 
   private String ficcaoCientifica ; 
   private String fantasia ; 
   private String poesia ; 
   private String romance ; 
   private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Generos(String biografia, String memoria, String conto, String cronica, String ficcaoCientifica, String fantasia, String poesia, String romance) {
        this.biografia = biografia;
        this.memoria = memoria;
        this.conto = conto;
        this.cronica = cronica;
        this.ficcaoCientifica = ficcaoCientifica;
        this.fantasia = fantasia;
        this.poesia = poesia;
        this.romance = romance;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getConto() {
        return conto;
    }

    public void setConto(String conto) {
        this.conto = conto;
    }

    public String getCronica() {
        return cronica;
    }

    public void setCronica(String cronica) {
        this.cronica = cronica;
    }

    public String getFiccaoCientifica() {
        return ficcaoCientifica;
    }

    public void setFiccaoCientifica(String ficcaoCientifica) {
        this.ficcaoCientifica = ficcaoCientifica;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getPoesia() {
        return poesia;
    }

    public void setPoesia(String poesia) {
        this.poesia = poesia;
    }

    public String getRomance() {
        return romance;
    }

    public void setRomance(String romance) {
        this.romance = romance;
    }
   
}
