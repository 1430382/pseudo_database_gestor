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
    public class Select <T> {
        public int conta=0;
        public class Select_clase<T> implements menor,mayor,igual,diferente {
            public void Select_funcion(Vector vectorconsulta, Vector vcolumnas, Vector vdefinitivo) {
                ///
                String consultadato=vectorconsulta.get(1).toString();
                int indexcolumnas=0;
                for(int i=0;i<vcolumnas.size();i++)
                {
                    if (consultadato.equals(vcolumnas.get(i)))
                    {
                        indexcolumnas=vcolumnas.indexOf(vcolumnas.get(i));
                    }
                }
                if (vectorconsulta.get(0).toString().equals("select"))
                {
                    if (vectorconsulta.get(1).toString().equals("*") )
                    {
                        int tamanioconsulta=vectorconsulta.size()-1;
                        if (tamanioconsulta>3 && vectorconsulta.get(4).toString().equals("where"))
                        {
                            //////////
                            boolean found = false;
                            int indexofsignal=0;
                            int indexofendsignal=0;
                            String signo="";
                            Vector signos = new Vector();
                            /////////////////////
                            while (found==false) {
                                Pattern pattern = Pattern.compile("[^a-zA-Z\\d\\s:]");
                                String s= pattern.toString();
                                Matcher matcher = pattern.matcher(vectorconsulta.get(5).toString());
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
                                signo=vectorconsulta.get(5).toString().substring(indexofsignal,indexofendsignal);

                            }
                            if (signo.equals("="))
                            {
                                conta=1;
                                igual(vectorconsulta,vcolumnas,vdefinitivo);
                            }else if (signo.equals("<"))
                            {
                                conta=2;
                                menor(vectorconsulta,vcolumnas,vdefinitivo);
                            }else if(signo.equals(">"))
                            {
                                conta=3;
                                mayor(vectorconsulta,vcolumnas,vdefinitivo);

                            }else if(signo.equals("!="))
                            {
                                conta=4;
                                diferente(vectorconsulta,vcolumnas,vdefinitivo);
                            }
                            ///////////////////////
                        }
                        else
                        {
                            System.out.println("FULL DATA");
                            System.out.println(vdefinitivo);
                        }
                    }else if(vectorconsulta.get(1).toString().equals(vcolumnas.get(indexcolumnas).toString()))
                    {
                        ///////////
                        int tamanioconsulta=vectorconsulta.size()-1;
                        if (tamanioconsulta>3 && vectorconsulta.get(4).toString().equals("where"))
                        {
                            //////////
                            //System.out.println("Columna WHERE");
                            boolean found = false;
                            int indexofsignal=0;
                            int indexofendsignal=0;
                            String signo="";
                            Vector signos = new Vector();
                            /////////////////////
                            while (found==false) {
                                Pattern pattern = Pattern.compile("[^a-zA-Z\\d\\s:]");
                                String s= pattern.toString();
                                Matcher matcher = pattern.matcher(vectorconsulta.get(5).toString());
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
                                signo=vectorconsulta.get(5).toString().substring(indexofsignal,indexofendsignal);

                            }
                            ///////////////////////
                            if (signo.equals("="))
                            {
                                conta=11;
                                igual(vectorconsulta,vcolumnas,vdefinitivo);
                            }else if (signo.equals("<"))
                            {
                                conta=12;
                                menor(vectorconsulta,vcolumnas,vdefinitivo);
                            }else if(signo.equals(">"))
                            {
                                conta=13;
                                mayor(vectorconsulta,vcolumnas,vdefinitivo);

                            }else if(signo.equals("!="))
                            {
                                conta=14;
                                diferente(vectorconsulta,vcolumnas,vdefinitivo);
                            }
                        }else
                        {
                            //GENERIC  column
                            for(int i=0;i<vdefinitivo.size();i++)
                            {
                                String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas);
                                System.out.println(vcolumnas.get(indexcolumnas)+": "+s);
                            }

                        }
                        //   else
                        //   {
                        //       System.out.println("FULL DATA");
                        //       System.out.println(vdefinitivo);
                        //   }


                        //////////////
                    }
                }
                try {
                    ///
                }  finally {
                }
            }
            public  void igual(Vector vectorconsulta,Vector vcolumnas, Vector vdefinitivo)
            {
                if (conta==1)
                {
                    String[] strArr5 = vectorconsulta.get(5).toString().split("\\=");
                    Vector vwhere = new Vector();
                    for(String str:strArr5) {
                        vwhere.add(str);
                    }
                    //////////////////////
                    String consultadatowhere=vwhere.get(0).toString();
                    int indexcolumnas1=0;
                    for(int i=0;i<vcolumnas.size();i++)
                    {
                        if (consultadatowhere.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));

                        }
                    }
                    if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
                    {
                        for(int i=0;i<vdefinitivo.size();i++)
                        {
                            String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                            if (s.equals(vwhere.get(1)))
                            {
                                System.out.println(vdefinitivo.get(i));

                            }
                        }
                    }

                }else if(conta==11)
                {
                    String[] strArr5 = vectorconsulta.get(5).toString().split("\\=");
                    Vector vwhere = new Vector();
                    for(String str:strArr5) {
                        vwhere.add(str);
                    }
                    //////////////////////
                    String consultadatowhere=vwhere.get(0).toString();
                    System.out.println(consultadatowhere);
                    String consultadato2=vectorconsulta.get(1).toString();
                    int indexcolumnas1=0;
                    int indexcolumnas2=0;
                    for(int i=0;i<vcolumnas.size();i++)
                    {
                        if (consultadatowhere.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));

                        }
                        if(consultadato2.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas2=vcolumnas.indexOf(vcolumnas.get(i));

                        }
                    }
                    if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
                    {
                        for(int i=0;i<vdefinitivo.size();i++)
                        {
                            String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                            //System.out.println("DATO: "+s);
                            if (s.equals(vwhere.get(1)))
                            {
                                System.out.println(((Vector) vdefinitivo.get(i)).get(indexcolumnas2));

                            }
                        }
                    }
                }
            }
            /////////////
            public  void menor(Vector vectorconsulta,Vector vcolumnas, Vector vdefinitivo)
            {
                if(conta==2)
                {
                    String[] strArr5 = vectorconsulta.get(5).toString().split("\\<");
                    Vector vwhere = new Vector();
                    for(String str:strArr5) {
                        System.out.println(str);
                        vwhere.add(str);
                    }
                    //////////////////////
                    String consultadatowhere=vwhere.get(0).toString();
                    int indexcolumnas1=0;
                    for(int i=0;i<vcolumnas.size();i++)
                    {
                        if (consultadatowhere.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));
                        }
                    }
                    if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
                    {
                        for(int i=0;i<vdefinitivo.size();i++)
                        {
                            String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                            int x = Integer.parseInt(s);
                            String temp= vwhere.get(1).toString();
                            int w= Integer.parseInt(temp);
                            if ( x<w )
                            {
                                System.out.println(vdefinitivo.get(i));

                            }
                        }
                    }
                }else if(conta==12)
                {
                    String[] strArr5 = vectorconsulta.get(5).toString().split("\\<");
                    Vector vwhere = new Vector();
                    for(String str:strArr5) {
                        System.out.println(str);
                        vwhere.add(str);
                    }
                    //////////////////////
                    String consultadatowhere=vwhere.get(0).toString();
                    int indexcolumnas1=0;
                    String consultadato2=vectorconsulta.get(1).toString();
                    int indexcolumnas2=0;
                    for(int i=0;i<vcolumnas.size();i++)
                    {
                        if (consultadatowhere.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));
                        }
                        if(consultadato2.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas2=vcolumnas.indexOf(vcolumnas.get(i));

                        }
                    }
                    if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
                    {
                        for(int i=0;i<vdefinitivo.size();i++)
                        {
                            String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                            int x = Integer.parseInt(s);
                            String temp= vwhere.get(1).toString();
                            int w= Integer.parseInt(temp);
                            if ( x<w )
                            {
                                System.out.println(((Vector) vdefinitivo.get(i)).get(indexcolumnas2));

                            }
                        }
                    }


                }
            }
            ////////////
            public  void mayor(Vector vectorconsulta,Vector vcolumnas, Vector vdefinitivo)
            {
                if(conta==3)
                {
                    String[] strArr5 = vectorconsulta.get(5).toString().split("\\>");
                    Vector vwhere = new Vector();
                    for(String str:strArr5) {
                        System.out.println(str);
                        vwhere.add(str);
                    }
                    //////////////////////
                    String consultadatowhere=vwhere.get(0).toString();
                    int indexcolumnas1=0;
                    for(int i=0;i<vcolumnas.size();i++)
                    {
                        if (consultadatowhere.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));
                        }
                    }
                    if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
                    {
                        for(int i=0;i<vdefinitivo.size();i++)
                        {
                            String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                            int x = Integer.parseInt(s);
                            String temp= vwhere.get(1).toString();
                            int w= Integer.parseInt(temp);

                            if ( x>w )
                            {
                                System.out.println(vdefinitivo.get(i));

                            }
                        }
                    }

                }else if(conta==13)
                {
                    String[] strArr5 = vectorconsulta.get(5).toString().split("\\>");
                    Vector vwhere = new Vector();
                    for(String str:strArr5) {
                        System.out.println(str);
                        vwhere.add(str);
                    }
                    //////////////////////
                    String consultadatowhere=vwhere.get(0).toString();
                    int indexcolumnas1=0;
                    String consultadato2=vectorconsulta.get(1).toString();
                    int indexcolumnas2=0;
                    for(int i=0;i<vcolumnas.size();i++)
                    {
                        if (consultadatowhere.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));
                        }
                        if(consultadato2.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas2=vcolumnas.indexOf(vcolumnas.get(i));

                        }
                    }
                    if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
                    {
                        for(int i=0;i<vdefinitivo.size();i++)
                        {
                            String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                            int x = Integer.parseInt(s);
                            String temp= vwhere.get(1).toString();
                            int w= Integer.parseInt(temp);

                            if ( x>w )
                            {
                                System.out.println(((Vector) vdefinitivo.get(i)).get(indexcolumnas2));

                            }
                        }
                    }
                }
            }
            ////////////
            public  void diferente(Vector vectorconsulta,Vector vcolumnas, Vector vdefinitivo)
            {
                if(conta==4)
                {
                //    System.out.println("DIFERENTE");
                    String[] strArr5 = vectorconsulta.get(5).toString().split("\\!=");
                    Vector vwhere = new Vector();
                    for(String str:strArr5) {
                        System.out.println(str);
                        vwhere.add(str);
                    }
                    //////////////////////
                    String consultadatowhere=vwhere.get(0).toString();
                    int indexcolumnas1=0;

                    for(int i=0;i<vcolumnas.size();i++)
                    {
                        if (consultadatowhere.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));

                        }

                    }
                    if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
                    {
                        for(int i=0;i<vdefinitivo.size();i++)
                        {
                            String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                            if (s.equals(vwhere.get(1)))
                            {

                            }
                            else
                            {
                                System.out.println(vdefinitivo.get(i));
                            }
                        }
                    }

                }else if(conta==14)
                {
              //      System.out.println("DIFERENTE");
                    String[] strArr5 = vectorconsulta.get(5).toString().split("\\!=");
                    Vector vwhere = new Vector();
                    for(String str:strArr5) {
                        System.out.println(str);
                        vwhere.add(str);
                    }
                    //////////////////////
                    String consultadatowhere=vwhere.get(0).toString();
                    int indexcolumnas1=0;
                    String consultadato2=vectorconsulta.get(1).toString();
                    int indexcolumnas2=0;
                    for(int i=0;i<vcolumnas.size();i++)
                    {
                        if (consultadatowhere.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));

                        }
                        if(consultadato2.equals(vcolumnas.get(i)))
                        {
                            indexcolumnas2=vcolumnas.indexOf(vcolumnas.get(i));

                        }
                    }
                    if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
                    {
                        for(int i=0;i<vdefinitivo.size();i++)
                        {
                            String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                            if (s.equals(vwhere.get(1)))
                            {

                            }
                            else
                            {
                                System.out.println(((Vector) vdefinitivo.get(i)).get(indexcolumnas2));
                            }
                        }
                    }

                }
            }
            ////////////
        }
    }

