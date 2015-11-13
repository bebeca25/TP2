package tp2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import java.util.Scanner;


public class Carregar_arquivo {
    public static void carregar_arquivo( ArrayList<Eleitor> ListaEleitor ) throws FileNotFoundException{
   
    Eleitor e;
    String nome, titulo, data_nascimento, secao, zona;
    int cond2 = 0;
    File arquivo = new File ("ListaEleitor.txt");
   
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
