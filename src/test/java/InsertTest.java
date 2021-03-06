import static org.junit.Assert.*;
import org.junit.Test;
import pseudogestor.Archivo;
import pseudogestor.Insert;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
public class InsertTest {
    @Test
    public void evaluateselect() throws IOException
    {
        Archivo archivo= new Archivo();
       // System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "insert into pruebas (Nombre,ApellidoP,Matricula) values (Albert,Camus,9999999)";
        ////////////
        try {
            String[] strArr1 = consulta.split("\\s");
            for(String str:strArr1) {
                vectorconsulta.add(str);
            }
            Iterator itr = vectorconsulta.iterator();
            while (itr.hasNext()) {
                System.out.println("index: "+count+" value: "+itr.next());
                count++;
            }
        }  finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        Archivo.Leer_archivo_clase archivos=new Archivo().new Leer_archivo_clase();
        archivos.Leer_archivo(vectorconsulta,pathdir);
        Insert.insert_clase ins = new Insert().new insert_clase();
        ins.insert_function(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }

}