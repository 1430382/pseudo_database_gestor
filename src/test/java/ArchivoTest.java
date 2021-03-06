import static org.junit.Assert.*;
import org.junit.Test;
import pseudogestor.Archivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ArchivoTest {
	@Test
	public void evaluatesArchivo() throws IOException {
		Archivo archivo= new Archivo();
	//	System.out.println("Ingresar La Consulta");
		BufferedReader br = null;
		int count =0;
		Vector vectorconsulta = new Vector();
		//Scanner myObj = new Scanner(System.in);
		System.out.println("PATH");
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


	}

}