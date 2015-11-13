package tp2;

public class Candidato extends Eleitor {
    private String email;
    Partido partido;
    String numero_Candidato;

    public Candidato(String email, Partido partido, String numero_Candidato, String nome,String titulo, String data_nascimento, String secao, String zona) {
        super(nome,titulo, data_nascimento, secao, zona);
        this.email = email;
        this.partido = partido;
        this.numero_Candidato = numero_Candidato;
    }
  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public String getNumero_Candidato() {
        return numero_Candidato;
    }

    public void setNumero_Candidato(String numero_Candidato) {
        this.numero_Candidato = numero_Candidato;
    }
    
    
}
