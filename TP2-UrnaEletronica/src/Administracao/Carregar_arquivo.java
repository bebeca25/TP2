package Administracao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;


public class Carregar_arquivo {
    public static void carregar_arquivo( ArrayList<Eleitor> ListaEleitor ) throws FileNotFoundException, IOException{
   
    Eleitor e;
    String nome, titulo, data_nascimento, secao, zona;
    int cond2 = 0;
    File arquivo = new File ("ListaEleitor.txt");
    
    boolean existe = arquivo.exists();
            if(!existe){
                arquivo.createNewFile();
            }  
   
        //Carrega todo conteúdo do arquivo
    Scanner scanner = new Scanner(new FileReader("ListaEleitor.txt")).useDelimiter("\\||\\n");
                                while (scanner.hasNext()) {
                                   nome = scanner.next();
                                   titulo = scanner.next();
                                   data_nascimento = scanner.next();
                                   secao = scanner.next();
                                   zona = scanner.next();
                                   
                                  e = new Eleitor(nome,titulo,data_nascimento,secao,zona);
                              
                                  ListaEleitor.add(e);
                                 
                                }
                                
    }
}
