
import static org.junit.Assert.*;

import org.junit.Test;
import pseudogestor.Archivo;
import pseudogestor.Select_anidado;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
public class Select_anidadoTest {
    @Test
    public void evaluateselect_anidado() throws IOException
    {
        Archivo archivo= new Archivo();
        //System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "select pruebas.Nombre as pruebas, pruebas1.Matricula as pruebas1 from pruebas,pruebas1 where pruebas.Matricula=pruebas1.Matricula";
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
        Select_anidado.Select_clase sani = new Select_anidado().new Select_clase();
        sani.Select_ani_funcion(vectorconsulta,archivos.vcolumnas,archivos.vcolumnas1,archivos.vdefinitivo,archivos.vdefinitivo1);


    }

}