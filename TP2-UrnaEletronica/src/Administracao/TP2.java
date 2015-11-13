
package Administracao;

import static Administracao.Carregar_arquivo.carregar_arquivo;
import static Administracao.Escrever_arquivo.escrever_arquivo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;


public class TP2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       Scanner in = new Scanner(System.in);
               
        
        int cond = 0;
        
       /* do{
            System.out.println("Módulo Administrador");
            System.out.println("1.Partido");
            System.out.println("2.Candidato");
            System.out.println("3.Eleitor");
            System.out.println("4.Relatório");
            System.out.println("5.Sair");
            System.out.println("Opção:");
            cond = in.nextInt();
            switch(cond){
                case 1:
                
                case 2:
                    
                case 3:
                    
                case 4:
                    
                }
            
        }while(cond!=5);*/
        
    ArrayList<Eleitor> ListaEleitor = new ArrayList <>();
    Iterator i = ListaEleitor.iterator();
    Eleitor e = new Eleitor();
    String nome, titulo, data_nascimento, secao, zona;
    int cond2 = 0;
   // File arquivo = new File ("ListaEleitor.txt");
    
    //Método estático da classe Carregar_arquivo responsável por carrgar todo conteúdo do arquivo e atribuir no arrayList;
    carregar_arquivo(  ListaEleitor );
                                
    
    do{
                        System.out.println("Módulo Eleitor");
                        System.out.println("1.Cadastrar");
                        System.out.println("2.Excluir");
                        System.out.println("3.Listar");
                        System.out.println("4.Pesquisar");
                        System.out.println("5.Alterar");
                        System.out.println("6.Sair");
                        System.out.println("Opção:");
                        cond2 = in.nextInt();
                        switch(cond2){
                            case 1://Cadastrar Eleitor
                                e.cadastrarEleitor( ListaEleitor, e);
                                escrever_arquivo(ListaEleitor);                                         
                                break;
                             
                            case 2://Excluir
                                System.out.println("Entre com o título do eleitor a ser excluído: \n");
                                titulo = in.next();
                                Eleitor.excluir(ListaEleitor, titulo);
                                break;
                                
                            case 3://Listar
                                System.out.println("Lista de cadastrados: \n");
                                Eleitor.imprimirArrayList(ListaEleitor);
                                break;
                            
                            case 4://Pesquisar
                                System.out.println("Pesquisar eleitor: \n");
                                System.out.println("Entre com o título do eleitor a ser pesquisado: ");
                                titulo = in.next();
                                Eleitor.pesquisar(ListaEleitor, titulo);
                                break;
                           
                            case 5://Alterar  
                               // nome, titulo, data_nascimento, secao, zona
                                System.out.println("Alterar dados: \n");
                                System.out.println("1.Nome");
                                System.out.println("2.Data de Nascimento");
                                System.out.println("3.Seção");
                                System.out.println("4.Zona");
                                System.out.println("5.Opção:");
                                int condicao = in.nextInt();
                                System.out.println("Insira o título do eleitor:");
                                titulo = in.next();
                                                    
                          //  alterar(ListaEleitor,titulo,condicao);
                        
                        }
                    }while(cond2!=6);
  
}//Chave TP2
}//Chave main
