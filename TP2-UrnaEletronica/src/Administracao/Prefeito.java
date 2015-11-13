package Administracao;


public class Prefeito extends Cargo implements Validar {
    

    Candidato vice_prefeito;

    public Prefeito(Candidato vice_prefeito, String email, Partido partido, String numero_Candidato, String nome, String titulo, String data_nascimento, String secao, String zona) {
        super(email, partido, numero_Candidato, nome, titulo, data_nascimento, secao, zona);
        this.vice_prefeito = vice_prefeito;
        super.setNumero_digitos(2); 
    }

   

  
    
    
    @Override
    public boolean Validar(String voto) {
          return voto.length()== this.getNumero_digitos();
    }
    
            
    
}
