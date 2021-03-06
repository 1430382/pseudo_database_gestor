package pseudogestor;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Insert <T>{
	public int conta=0;
	public class insert_clase<T> //implements menor,mayor,igual,diferente
	{
		public void insert_function(Vector vectorconsulta, Vector vcolumnas, Vector vdefinitivo)
		{
			///////////
			
			if (vectorconsulta.get(0).toString().equals("insert"))
			{
			//	System.out.println("Insert");
				//int tamanioconsulta=vectorconsulta.size()-1;
				/////////
				//////////
				boolean found = false;
				int indexofsignal=0;
				int indexofendsignal=0;
				//String signo="";
				Vector insertcolum = new Vector();
				String resultado="";
				/////////////////////    \(([^)]+)\)
				//  String[] strArr1 = vectorconsulta.get(3).toString().split("");
				/////////
			   while (found==false)
			   {
				   Pattern pattern = Pattern.compile("\\((.*?)\\)");
				   String s= pattern.toString();
				   Matcher matcher = pattern.matcher(vectorconsulta.get(3).toString());
				   while (matcher.find()) {
					   insertcolum.add(matcher.start());
					   insertcolum.add(matcher.end());
					   found = true;
				   }

					String indezstring = insertcolum.get(0).toString(); //
					indexofsignal = Integer.parseInt(indezstring); //
					int w= (insertcolum.size()-1); //tamanio del vector signos para saber la ultima posicion //2
					String temp=insertcolum.get(w).toString();
					indexofendsignal= Integer.parseInt(temp);
				   // //////////////////
					resultado=vectorconsulta.get(3).toString().substring(indexofsignal+1,indexofendsignal-1);
					//System.out.println(resultado);
					///////////
					//////////
					////////////
			   }
			   String[] strArr1 = resultado.toString().split("\\,");
			   Vector vinsert = new Vector();
			   for(String str:strArr1) {
					vinsert.add(str);
					//System.out.println(str);
			   }
			   ////////////
			   found = false;
			   String resultado1=null;
			   ///////////// insert into pruebas (Nombre,ApellidoP) values (1,2)
			//   System.out.println("SI");
			   int indexofsignal1=(vectorconsulta.get(5).toString().length()-1);
			   resultado1=vectorconsulta.get(5).toString().substring(1,indexofsignal1); 
			   String[] strArr2 = resultado1.toString().split("\\,");
			   Vector valuesins = new Vector();
			   for(String str:strArr2) {
					valuesins.add(str);
					//System.out.println(str);
				}
				//int sizeofinsert=vinsert.size();
				for(int i=0;i<vcolumnas.size()-1;i++)
				{
	                    for(int e=0;e<vinsert.size();e++)
	                    {
			                 if (vinsert.get(e).toString().equals(vcolumnas.get(i).toString())) {
	                    		//System.out.println(vcolumnas.get(i));
	                    		System.out.println(vinsert.get(e));
			                 	//System.out.println(vinsert);
	                    		
	                    		
	                    			vdefinitivo.add(valuesins);



	                    	}
	                    	break;
	                    }

				}
				for(int e=0;e<vdefinitivo.size();e++)
				{
					System.out.println("data :"+vdefinitivo.get(e));
				}
				/////////////
				///////////////////////
			}
			//////////
		}
	}

}
