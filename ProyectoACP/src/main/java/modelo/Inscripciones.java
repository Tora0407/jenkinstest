package modelo;
public class Inscripciones {
    
    int codigo;
    int num_auto;
    String piloto;
    String copiloto;
    String codp;
    String codcop;

    public Inscripciones() {
    }

       
    public Inscripciones(int num_auto, String piloto, String copiloto) {
        this.num_auto = num_auto;
        this.piloto = piloto;
        this.copiloto = copiloto;
    }

    public String getCodp() {
        return codp;
    }

    public void setCodp(String codp) {
        this.codp = codp;
    }

    public String getCodcop() {
        return codcop;
    }

    public void setCodcop(String codcop) {
        this.codcop = codcop;
    }
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNum_auto() {
        return num_auto;
    }

    public void setNum_auto(int num_auto) {
        this.num_auto = num_auto;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }
    
    
    
}
