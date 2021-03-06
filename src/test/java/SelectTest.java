import static org.junit.Assert.*;


import org.junit.Test;
import pseudogestor.Archivo;
import pseudogestor.Select;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
public class SelectTest {

    @Test
    public void evaluateselect() throws IOException
    {
        Archivo archivo= new Archivo();
      //  System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "select * from pruebas";
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
        Select.Select_clase in = new Select().new Select_clase();
        in.Select_funcion(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    //////
    @Test
    public void evaluateselectallwhereigual() throws IOException
    {
        Archivo archivo= new Archivo();
       // System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "select * from pruebas where Nombre=Rebeca";
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
        Select.Select_clase in = new Select().new Select_clase();
        in.Select_funcion(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    //
    @Test
    public void evaluateselectallwheremenor() throws IOException
    {
        Archivo archivo= new Archivo();
      //  System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "select * from pruebas where Matricula<1430382";
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
        Select.Select_clase in = new Select().new Select_clase();
        in.Select_funcion(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    ///
    @Test
    public void evaluateselectallwheremayor() throws IOException
    {
        Archivo archivo= new Archivo();
      //  System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "select * from pruebas where Matricula>1430382";
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
        Select.Select_clase in = new Select().new Select_clase();
        in.Select_funcion(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    ///
    @Test
    public void evaluateselectallwherediferente() throws IOException
    {
        Archivo archivo= new Archivo();
      //  System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "select * from pruebas where Matricula!=1430382";
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
        Select.Select_clase in = new Select().new Select_clase();
        in.Select_funcion(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    //////
    @Test
    public void evaluateselectcolumnwhereigual() throws IOException
    {
        Archivo archivo= new Archivo();
      //  System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "select Nombre from pruebas where Matricula=1430382";
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
        Select.Select_clase in = new Select().new Select_clase();
        in.Select_funcion(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    ///
    //////
    @Test
    public void evaluateselectcolumnwheremenor() throws IOException
    {
        Archivo archivo= new Archivo();
     //   System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "select Nombre from pruebas where Matricula<1430382";
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
        Select.Select_clase in = new Select().new Select_clase();
        in.Select_funcion(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    ///
    //////
    @Test
    public void evaluateselectcolumnwheremayor() throws IOException
    {
        Archivo archivo= new Archivo();
    //    System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "select Nombre from pruebas where Matricula>1430382";
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
        Select.Select_clase in = new Select().new Select_clase();
        in.Select_funcion(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    ///
    //////
    @Test
    public void evaluateselectcolumnwherediferente() throws IOException
    {
        Archivo archivo= new Archivo();
    //    System.out.println("Ingresar La Consulta");
        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        //Scanner myObj = new Scanner(System.in);
        String pathdir = "/home/angel/IdeaProjects/pseudogestor/";
        //String consulta = myObj.nextLine();
        String consulta = "select Nombre from pruebas where Matricula!=1430382";
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
        Select.Select_clase in = new Select().new Select_clase();
        in.Select_funcion(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
    }
    ///

}