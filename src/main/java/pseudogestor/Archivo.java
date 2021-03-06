package pseudogestor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
public class Archivo {

    public class Leer_archivo_clase <T>
    {
        public Vector vdefinitivo = new Vector();
        public Vector vdefinitivo1 = new Vector();
        public Vector vcolumnas = new Vector();
        public Vector vcolumnas1 = new Vector();
        public void Leer_archivo(Vector vectorconsulta, String pathdir) throws IOException {
            BufferedReader br = null;
            BufferedReader br1 = null;
            String sCurrentLine;

            try {
                if(vectorconsulta.get(2).toString().equals("from"))
                {

                    br = new BufferedReader(new FileReader(pathdir+vectorconsulta.get(3)+".txt"));//file name with path

                }else if(vectorconsulta.get(0).toString().equals("update"))
                {
                    br = new BufferedReader(new FileReader(pathdir+vectorconsulta.get(1)+".txt"));//file name with path
                }else if(vectorconsulta.get(0).toString().equals("delete"))
                {
                    br = new BufferedReader(new FileReader(pathdir+vectorconsulta.get(2)+".txt"));//file name with path

                }else if(vectorconsulta.get(0).toString().equals("insert"))
                {

                    br = new BufferedReader(new FileReader(pathdir+vectorconsulta.get(2)+".txt"));//file name with path

                }else if(vectorconsulta.get(2).toString().equals("as"))
                {
                    String[] strArr0 = vectorconsulta.get(8).toString().split("\\,");
                    Vector varchivos = new Vector();
                    for(String str:strArr0) {
                        //System.out.println(str);
                        varchivos.add(str);
                    }
                    br = new BufferedReader(new FileReader(pathdir+varchivos.get(0)+".txt"));//file name with path
                    br1 = new BufferedReader(new FileReader(pathdir+varchivos.get(1)+".txt"));//file name with path
                    //////////
                    while ((sCurrentLine = br1.readLine()) != null) {
                        String[] strArr5 = sCurrentLine.split("\\;");
                        for(String str:strArr5)
                        {
                            vcolumnas1.add(str);
                        }
                    }
                    vcolumnas1.subList(1,vcolumnas1.size()).clear();
                    String[] strArr6 = vcolumnas1.get(0).toString().split("\\s");
                    vcolumnas1.clear();
                    for(String str:strArr6) {
                        vcolumnas1.add(str);
                    }
                    /////////////
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while ((sCurrentLine = br.readLine()) != null) {
                String[] strArr3 = sCurrentLine.split("\\;");
                for(String str:strArr3) {
                    vcolumnas.add(str);
                }
            }
            ///////////
           
            vcolumnas.subList(1,vcolumnas.size()).clear();
            //////////
            String[] strArr4 = vcolumnas.get(0).toString().split("\\s");
            vcolumnas.clear();
            for(String str:strArr4) {
                vcolumnas.add(str);
            }
            sCurrentLine="";
            if (vectorconsulta.get(2).toString().equals("from"))
            {

                br = new BufferedReader(new FileReader(pathdir+vectorconsulta.get(3)+".txt"));//file name with path
            }else if(vectorconsulta.get(0).toString().equals("update"))
            {
                br = new BufferedReader(new FileReader(pathdir+vectorconsulta.get(1)+".txt"));//file name with path
            }else if(vectorconsulta.get(0).toString().equals("delete"))
            {
                br = new BufferedReader(new FileReader(pathdir+vectorconsulta.get(2)+".txt"));//file name with path

            }else if(vectorconsulta.get(0).toString().equals("insert"))
            {
                br = new BufferedReader(new FileReader(pathdir+vectorconsulta.get(2)+".txt"));//file name with path

            }else if(vectorconsulta.get(2).toString().equals("as"))
                {
                    String[] strArr7 = vectorconsulta.get(8).toString().split("\\,");
                    Vector varchivos1 = new Vector();
                    for(String str:strArr7) {
                        //System.out.println(str);
                        varchivos1.add(str);
                    }
                    br = new BufferedReader(new FileReader(pathdir+varchivos1.get(0)+".txt"));//file name with path
                    br1 = new BufferedReader(new FileReader(pathdir+varchivos1.get(1)+".txt"));//file name with path
                     while ((sCurrentLine = br1.readLine()) != null) {
                        String[] strArr8 = sCurrentLine.split("\\,");
                        Vector v1 = new Vector();
                        for(String str:strArr8) {
                            v1.add(str);
                        }
                        vdefinitivo1.add(v1);
                    }
                    vdefinitivo1.remove(0);
                }

            while ((sCurrentLine = br.readLine()) != null) {

                String[] strArr2 = sCurrentLine.split("\\,");
                Vector v = new Vector();
                for(String str:strArr2) {
                    v.add(str);
                }
                vdefinitivo.add(v);
            }
            vdefinitivo.remove(0);
            //////////
       
        }
    }
}
