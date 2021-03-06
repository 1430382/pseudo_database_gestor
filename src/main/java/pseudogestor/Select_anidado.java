package pseudogestor;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

///////////

public class Select_anidado <T>{
	public int conta=0;
	public class Select_clase<T>
	{
		public void Select_ani_funcion(Vector vectorconsulta, Vector vcolumnas,Vector vcolumnas1, Vector vdefinitivo, Vector vdefinitivo1)
		{

			if(vectorconsulta.get(2).toString().equals("as"))
			{
				boolean found = false;
                int indexofsignal=0;
                int indexofendsignal=0;
                String signo="";
				Vector signos = new Vector();
                /////////////////////
                while (found==false) {
                	Pattern pattern = Pattern.compile("[\\=<>!=]");
                    String s= pattern.toString();
                    Matcher matcher = pattern.matcher(vectorconsulta.get(10).toString());
                    while (matcher.find()) {
                    	signos.add(matcher.start());
                        signos.add(matcher.end());
                        found = true;
					}
                    String indezstring = signos.get(0).toString(); //6
                    indexofsignal = Integer.parseInt(indezstring); //int 6
                    int w= (signos.size()-1); //tamanio del vector signos para saber la ultima posicion //2
                    String temp=signos.get(w).toString();
                    indexofendsignal= Integer.parseInt(temp);
                    //////////////////
                    signo=vectorconsulta.get(10).toString().substring(indexofsignal,indexofendsignal);
                    //System.out.println("SIGNO: "+signo );
				}
                if (signo.equals("="))
                {
                	conta=1;
                    igual(vectorconsulta,vcolumnas,vcolumnas1,vdefinitivo,vdefinitivo1);
				}else if (signo.equals("<"))
                {
                	conta=2;
                    //menor(vectorconsulta,vcolumnas,vdefinitivo);
                }else if(signo.equals(">"))
                {
                	conta=3;
                    //mayor(vectorconsulta,vcolumnas,vdefinitivo);
				}else if(signo.equals("!="))
                {
                	conta=4;
                    //diferente(vectorconsulta,vcolumnas,vdefinitivo);
				}

			}/// endifprincipal
		}
		///
		public  void igual(Vector vectorconsulta,Vector vcolumnas,Vector vcolumnas1, Vector vdefinitivo, Vector vdefinitivo1)
            {
                if (conta==1)
                {
                	////
                	String[] strArr0 = vectorconsulta.get(1).toString().split("\\.");
                    Vector vwherecolumna	= new Vector();
                    Vector vwherecolumna1	= new Vector();
                    for(String str:strArr0) {
                        vwherecolumna.add(str);
                        //vwhere1.add(str);
                        //System.out.println(str);
                    }
                    //System.out.println(vwherecolumna);
                    String[] strArr4 = vwherecolumna.get(1).toString().split("\\,");
                    Vector vwherebuscar= new Vector();
                    //Vector vwhere = new Vector();
                    for(String str:strArr4) {
                        vwherebuscar.add(str);
                        //System.out.println(str);
                    }
                    ////
                    String[] strArr5 = vectorconsulta.get(4).toString().split("\\.");
                    
                    for(String str:strArr5) {
                        vwherecolumna1.add(str);
                        //vwhere1.add(str);
                        //System.out.println(str);
                    }
                    //System.out.println(vwherecolumna1);
                    String[] strArr6 = vwherecolumna1.get(1).toString().split("\\,");
                    Vector vwherebuscar1= new Vector();
                    //Vector vwhere = new Vector();
                    for(String str:strArr6) {
                        vwherebuscar1.add(str);
                        //System.out.println(str);
                    }
                	////
                	//System.out.println(vwherebuscar); // index 1
                	//System.out.println(vwherebuscar1); // index 4
                    String[] strArr1 = vectorconsulta.get(10).toString().split("\\=");
                    Vector vwhere = new Vector();
                    Vector vwhere1 = new Vector();
                    for(String str:strArr1) {
                        vwhere.add(str);
                        vwhere1.add(str);
                        //System.out.println(str);
                    }
                    //////////////////////
                    String[] strArr2 = vwhere.get(0).toString().split("\\.");
                    vwhere.clear();
                    //Vector vwhere = new Vector();
                    for(String str:strArr2) {
                        vwhere.add(str);
                        //System.out.println(str);
                    }
                    String consultadatowhere=vwhere.get(1).toString(); //Matricula
                    ////
                    String[] strArr3 = vwhere1.get(1).toString().split("\\.");
                    vwhere1.clear();
                    //Vector vwhere = new Vector();
                    for(String str:strArr3) {
                        vwhere1.add(str);
                        //System.out.println(str);
                    }
                    //System.out.println(consultadatowhere);
                    String consultadato2=vwhere1.get(1).toString();
                    String consultadato3=vwherebuscar.get(0).toString();
                    String consultadato4=vwherebuscar1.get(0).toString();
                    // System.out.println(consultadatowhere);
                    //System.out.println(": "+consultadato3);
                    //System.out.println(":1 "+consultadato4);
                    //System.out.println(consultadato2);
                    // VWHEREBUSCAR 1 Y 2 SON LOS QUE SE VAN A MOSTRAR
                    // VWHERE SON EL DE LA CONDICION DEL WHERE
                    int indexcolumnas1=0;
                    int indexcolumnas2=0;
                    int indexcolumnas3=0;
                    int indexcolumnas4=0;
                    for(int i=0;i<vcolumnas.size();i++)
                    {
                        if (consultadatowhere.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));

                        }
                        if(consultadato3.equals(vcolumnas.get(i)))
                        {
                        	indexcolumnas3=vcolumnas.indexOf(vcolumnas.get(i));
                        }
                    }
                    ////
                  // System.out.println(vcolumnas1);
                    for(int i=0;i<vcolumnas1.size();i++)
                    {
                        if (consultadato2.equals(vcolumnas1.get(i)))
                        {
                            indexcolumnas2=vcolumnas1.indexOf(vcolumnas1.get(i));
                        }
                        if (consultadato4.equals(vcolumnas1.get(i)))
                        {
                            indexcolumnas4=vcolumnas1.indexOf(vcolumnas1.get(i));
                        }
                    }
                    /////////////////
                    //System.out.println(indexcolumnas1);
                    //System.out.println(indexcolumnas2);
                    ////////////////////
                    //System.out.println(vwhere.get(1));
                    if (vwhere.get(1).toString().equals(vcolumnas.get(indexcolumnas1).toString())
                    && vwhere1.get(1).toString().equals(vcolumnas1.get(indexcolumnas2).toString()))
                    {
                        for(int i=0;i<vdefinitivo.size();i++)
                        {
                            String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                            //System.out.println("DATO: "+s);
                            for(int e=0;e<vdefinitivo1.size();e++)
                            {
                            	String s1 = (String) ((Vector) vdefinitivo1.get(e)).get(indexcolumnas2);
                            	//System.out.println(s1);
                            	if(s.equals(s1))
                            	{
                            		
                            		System.out.print((String) ((Vector) vdefinitivo1.get(e)).get(indexcolumnas3)+"\t");
                            		System.out.println("\t"+(String) ((Vector) vdefinitivo1.get(e)).get(indexcolumnas4));
                            	}
                            }
                            //System.out.println(s);
                          
                        }
                    }

                }
            }//end iif
	}

}