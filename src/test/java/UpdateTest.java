import static org.junit.Assert.*;
import org.junit.Test;
import pseudogestor.Archivo;
import pseudogestor.Update;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
public class UpdateTest {
    @Test
    public void evaluateupdateigual() throws IOException
    {
        Archivo archivo= new Archivo();
        //System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "update pruebas set Nombre=Noob where Matricula=1730042";
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
        Update.update_clase ina = new Update().new update_clase();
        ina.update_function(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    ///
    @Test
    public void evaluateupdatemenor() throws IOException
    {
        Archivo archivo= new Archivo();
        //System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "update pruebas set Nombre=Noob where Matricula<1730042";
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
        Update.update_clase ina = new Update().new update_clase();
        ina.update_function(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    //
    @Test
    public void evaluateupdatemayor() throws IOException
    {
        Archivo archivo= new Archivo();
        //System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "update pruebas set Nombre=Noob where Matricula>1430382";
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
        Update.update_clase ina = new Update().new update_clase();
        ina.update_function(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    //
    @Test
    public void evaluateupdatediferente() throws IOException
    {
        Archivo archivo= new Archivo();
        //System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "update pruebas set Nombre=Noob where Matricula!=1730042";
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
        Update.update_clase ina = new Update().new update_clase();
        ina.update_function(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
}