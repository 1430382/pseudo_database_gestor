package pseudogestor;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//////////////////


///
/////////////////
public class DotNew<T>{
    public static void main(String[] args) {
        //Archivo.LeerArchivo in = new Archivo().new LeerArchivo();
        //in.show();
        boolean bandera=false;
        //////////////////
//        System.out.println("PATH");
//        Scanner myObj1 = new Scanner(System.in);
        String pathdir = "";
        ////
        System.out.println("Ingresar La Consulta || QUERY");
        while(bandera==false)
        {

        BufferedReader br = null;
        int count =0;
        Vector vectorconsulta = new Vector();
        Scanner myObj = new Scanner(System.in);
        String consulta = myObj.nextLine();
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
        /////////////
        try {


            Archivo.Leer_archivo_clase archivos=new Archivo().new Leer_archivo_clase();
            archivos.Leer_archivo(vectorconsulta,pathdir);
            //////////////              
            Select.Select_clase in = new Select().new Select_clase();
            in.Select_funcion(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
            //
            Update.update_clase ina = new Update().new update_clase();
            ina.update_function(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
            //
            Delete.delete_clase ino = new Delete().new delete_clase();
            ino.delete_function(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
            ///
            Insert.insert_clase ins = new Insert().new insert_clase();
            ins.insert_function(vectorconsulta,archivos.vcolumnas,archivos.vdefinitivo);
            ///
            Select_anidado.Select_clase sani = new Select_anidado().new Select_clase();
            sani.Select_ani_funcion(vectorconsulta,archivos.vcolumnas,archivos.vcolumnas1,archivos.vdefinitivo,archivos.vdefinitivo1);


            //
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
            System.out.println("Ingresar La Consulta || query:");
        }
        
        ////////////////
    }

}
