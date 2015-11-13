package tp2;


public abstract class Cargo extends Candidato{

    public Cargo(String email, Partido partido, String numero_Candidato, String nome, String titulo, String data_nascimento, String secao, String zona) {
        super(email, partido, numero_Candidato, nome, titulo, data_nascimento, secao, zona);
        
    }

   

   
     private int numero_digitos;

    public int getNumero_digitos() {
        return numero_digitos;
    }

    public void setNumero_digitos(int numero_digitos) {
        this.numero_digitos = numero_digitos;
    }
     
     
         
     
     
}
