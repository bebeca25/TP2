package Administracao;

public class Vereador extends Cargo implements Validar{

    public Vereador(String email, Partido partido, String numero_Candidato, String nome, String titulo, String data_nascimento, String secao, String zona) {
        super(email, partido, numero_Candidato, nome, titulo, data_nascimento, secao, zona);
        super.setNumero_digitos(4);
    }

  

   

   @Override
    public boolean Validar(String voto) {
          return voto.length()== super.getNumero_digitos();
    }
}
