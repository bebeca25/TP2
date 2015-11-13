package Administracao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;

public class Escrever_arquivo {

    public static void escrever_arquivo(ArrayList<Eleitor> ListaEleitor) throws IOException {
        Iterator i = ListaEleitor.iterator();
        File arquivo = new File("ListaEleitor.txt");
                  
   
             while (i.hasNext()) {
            Eleitor e = (Eleitor) i.next();
            try (
                    //construtor recebe como argumento o objeto do tipo FileWriter                  
                    FileWriter fw = new FileWriter(arquivo,true);
                    BufferedWriter bw = new BufferedWriter(fw)) {
           
                //escreve o conteúdo no arquivo
                bw.write(e.getNome());
                bw.write("|");
                bw.write(e.getTitulo());
                bw.write("|");
                bw.write(e.getData_nascimento());
                bw.write("|");
                bw.write(e.getSecao());
                bw.write("|");
                bw.write(e.getZona());

                //quebra de linha
                bw.newLine();

                //fecha os recursos
                bw.close();
                fw.close();
                }
            
             }

    }
    
}
