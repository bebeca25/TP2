package tp2;

import java.util.ArrayList;
import java.util.Scanner;

public class Eleitor {

    private String nome;
    private String titulo;
    private String data_nascimento;
    private String secao;
    private String zona;
    private String secao_sala;

    public Eleitor() {
    }

    public Eleitor(String nome, String titulo, String data_nascimento, String secao, String zona) {
        this.nome = nome;
        this.titulo = titulo;
        this.data_nascimento = data_nascimento;
        this.secao = secao;
        this.zona = zona;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void imprimir() {
        System.out.println("Nome:" + nome);
        System.out.println("Título:" + titulo);
        System.out.println("Data Nascimento:" + data_nascimento);
        System.out.println("Seção:" + secao);
        System.out.println("Zona:" + zona);
        System.out.println("\n");
    }

    /* public boolean VerificaSecao(String secaoEleitor){
     if (secaoEleitor.equals(secao_sala))
     return true;
     else
     return   false;
     } */
    Scanner in = new Scanner(System.in);

   
    public void cadastrarEleitor(ArrayList<Eleitor> ListaEleitor, Eleitor e) {
        System.out.println("Nome:");
        nome = in.next();
        System.out.println("Título:");
        titulo = in.next();
        System.out.println("data_nascimento");
        data_nascimento = in.next();
        System.out.println("Seção:");
        secao = in.next();
        System.out.println("Zona:");
        zona = in.next();
        e = new Eleitor(nome, titulo, data_nascimento, secao, zona);
        ListaEleitor.add(e);
    }

    public static void excluir(ArrayList<Eleitor> ListaEleitor, String titulo) {

        Eleitor eleitor_aux = null;
        for (Eleitor e2 : ListaEleitor) {
            if (e2.getTitulo().equals(titulo)) {
                eleitor_aux = e2;
            }
        }
        ListaEleitor.remove(eleitor_aux);
    }

        public static void pesquisar(ArrayList<Eleitor> ListaEleitor, String titulo) {

        Eleitor eleitor_aux = null;
        for (Eleitor e2 : ListaEleitor) {
            if (e2.getTitulo().equals(titulo)) {
                eleitor_aux = e2;
            }
        }
        eleitor_aux.imprimir();
    }
        
        public static Eleitor complemento_alterar(ArrayList<Eleitor> ListaEleitor, String titulo) {

        Eleitor eleitor_aux = null;
        for (Eleitor e2 : ListaEleitor) {
            if (e2.getTitulo().equals(titulo)) {
                eleitor_aux = e2;
            }
        }
            return eleitor_aux;
    }
        
        public void alterar(ArrayList<Eleitor> ListaEleitor, String titulo,int condicao){
            Eleitor e1 = complemento_alterar(ListaEleitor,titulo);    
            if(condicao==1){
                    System.out.println("Insira o novo nome:");
                    nome = in.next();
                    e1.setNome(nome);
                }
            else if(condicao==2){
                    System.out.println("Insira a nova data de nascimento:");
                    data_nascimento = in.next();
                    e1.setData_nascimento(data_nascimento);
                }
            else if(condicao==3){
                    System.out.println("Insira a nova seção:");
                    secao = in.next();
                    e1.setSecao(secao);
            }
            else if(condicao==4){
                    System.out.println("Insira a nova zona:");
                    zona = in.next();
                    e1.setZona(zona);
            }
        }
    
    public static void imprimirArrayList(ArrayList<Eleitor> ListaEleitor) {

        for (Eleitor e1 : ListaEleitor) {

            e1.imprimir();
        }
    }

    
}
