package pseudogestor;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Delete <T>{
    public class delete_clase<T> implements menor,mayor,igual,diferente{
    public int conta=0;
    public void delete_function(Vector vectorconsulta, Vector vcolumnas, Vector vdefinitivo)
    {
        //System.out.println("DELETE");
        String consultadato=vectorconsulta.get(1).toString();
        int indexcolumnas=0;
        for(int i=0;i<vcolumnas.size();i++)
        {
            if (consultadato.equals(vcolumnas.get(i)))
            {
                indexcolumnas=vcolumnas.indexOf(vcolumnas.get(i));
            }
        }
        if (vectorconsulta.get(0).toString().equals("delete"))
        {
            //int tamanioconsulta=vectorconsulta.size()-1;
            /////////
            //////////
            boolean found = false;
            int indexofsignal=0;
            int indexofendsignal=0;
            String signo="";
            Vector signos = new Vector();
            /////////////////////
            while (found==false)
            {
                Pattern pattern = Pattern.compile("[^a-zA-Z\\d\\s:]");
                String s= pattern.toString();
                Matcher matcher = pattern.matcher(vectorconsulta.get(4).toString());
                while (matcher.find()) {
                    signos.add(matcher.start());
                    signos.add(matcher.end());
                    found = true;
                }
                String indezstring = signos.get(0).toString(); //
                indexofsignal = Integer.parseInt(indezstring); //
                int w= (signos.size()-1); //tamanio del vector signos para saber la ultima posicion //2
                String temp=signos.get(w).toString();
                indexofendsignal= Integer.parseInt(temp);
                //////////////////
                signo=vectorconsulta.get(4).toString().substring(indexofsignal,indexofendsignal);

            }
            //System.out.println("signo :"+signo);

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

    }
    /////////
    public  void igual(Vector vectorconsulta,Vector vcolumnas, Vector vdefinitivo)
    {
        /////////////////
       // System.out.println("igual delete");
        String[] strArr5 = vectorconsulta.get(4).toString().split("\\=");
        Vector vwhere = new Vector();
        for(String str:strArr5) {
            vwhere.add(str);
        }
        //////////////
        String[] strArr1 = vectorconsulta.get(4).toString().split("\\=");
        Vector vupdate = new Vector();
        for(String str:strArr1) {
            vupdate.add(str);
        }
        //////////////////////
        String consultadatowhere=vwhere.get(0).toString();
        System.out.println(consultadatowhere);
        String consultadato2=vupdate.get(0).toString();
        int indexcolumnas1=0;
        int indexcolumnas2=1;
        for(int i=0;i<vcolumnas.size();i++)
        {
            if (consultadatowhere.equals(vcolumnas.get(i)))
            {
                indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));

            }

        }
        System.out.println(indexcolumnas1);
        if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
        {
            for(int i=0;i<vdefinitivo.size();i++)
            {
                String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                //System.out.println(s);
                if (s.equals(vwhere.get(1)))
                {
                    vdefinitivo.subList(indexcolumnas1, indexcolumnas2).clear();
                }
                System.out.println(vectorconsulta.get(0).toString()+" : "+((Vector) vdefinitivo.get(i)));
            }
        }
    }
    ///////
    public  void menor(Vector vectorconsulta,Vector vcolumnas, Vector vdefinitivo)
    {
        /////////////////
       // System.out.println("menor delete");
        String[] strArr5 = vectorconsulta.get(4).toString().split("\\<");
        Vector vwhere = new Vector();
        for(String str:strArr5) {
            vwhere.add(str);
        }
        //////////////
        String[] strArr1 = vectorconsulta.get(4).toString().split("\\=");
        Vector vupdate = new Vector();
        for(String str:strArr1) {
            vupdate.add(str);
        }
        //////////////////////
        String consultadatowhere=vwhere.get(0).toString();
        System.out.println(consultadatowhere);
        String consultadato2=vupdate.get(0).toString();
        int indexcolumnas1=0;
        int indexcolumnas2=vcolumnas.size()-1;
        for(int i=0;i<vcolumnas.size();i++)
        {
            if (consultadatowhere.equals(vcolumnas.get(i)))
            {
                indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));

            }

        }
        System.out.println(indexcolumnas1);
        if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
        {
            for(int i=0;i<vdefinitivo.size();i++)
            {
                String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                //System.out.println(s);
                int x = Integer.parseInt(s);
                String temp= vwhere.get(1).toString();
                int w= Integer.parseInt(temp);
                if (x<w)
                {
                    vdefinitivo.subList(indexcolumnas1,indexcolumnas2).clear();
                    //((Vector) vdefinitivo.get(i)).set(indexcolumnas2,vupdate.get(1).toString());
                    System.out.println(vectorconsulta.get(0).toString()+" : "+((Vector) vdefinitivo.get(i)));
                }

            }
        }
    }
    ///////
    public  void mayor(Vector vectorconsulta,Vector vcolumnas, Vector vdefinitivo)
    {
        /////////////////
      //  System.out.println("mayor delete");
        String[] strArr5 = vectorconsulta.get(4).toString().split("\\<");
        Vector vwhere = new Vector();
        for(String str:strArr5) {
            vwhere.add(str);
        }
        //////////////
        String[] strArr1 = vectorconsulta.get(4).toString().split("\\=");
        Vector vupdate = new Vector();
        for(String str:strArr1) {
            vupdate.add(str);
        }
        //////////////////////
        String consultadatowhere=vwhere.get(0).toString();
        System.out.println(consultadatowhere);
        String consultadato2=vupdate.get(0).toString();
        int indexcolumnas1=0;
        int indexcolumnas2=vcolumnas.size()-1;
        for(int i=0;i<vcolumnas.size();i++)
        {
            if (consultadatowhere.equals(vcolumnas.get(i)))
            {
                indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));

            }

        }
        System.out.println(indexcolumnas1);
        if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
        {
            for(int i=0;i<vdefinitivo.size();i++)
            {
                String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                //System.out.println(s);
                int x = Integer.parseInt(s);
                String temp= vwhere.get(1).toString();
                int w= Integer.parseInt(temp);
                if (x>w)
                {
                    vdefinitivo.subList(indexcolumnas1,indexcolumnas2).clear();
                    //((Vector) vdefinitivo.get(i)).set(indexcolumnas2,vupdate.get(1).toString());
                    System.out.println(vectorconsulta.get(0).toString()+" : "+((Vector) vdefinitivo.get(i)));
                }

            }
        }
    }
    public void diferente(Vector vectorconsulta,Vector vcolumnas, Vector vdefinitivo)
    {
        /////////////////
        // System.out.println("igual delete");
        String[] strArr5 = vectorconsulta.get(4).toString().split("\\!=");
        Vector vwhere = new Vector();
        for(String str:strArr5) {
            vwhere.add(str);
        }
        //////////////
        String[] strArr1 = vectorconsulta.get(4).toString().split("\\=");
        Vector vupdate = new Vector();
        for(String str:strArr1) {
            vupdate.add(str);
        }
        //////////////////////
        String consultadatowhere=vwhere.get(0).toString();
        System.out.println(consultadatowhere);
        String consultadato2=vupdate.get(0).toString();
        int indexcolumnas1=0;
        int indexcolumnas2=1;
        for(int i=0;i<vcolumnas.size();i++)
        {
            if (consultadatowhere.equals(vcolumnas.get(i)))
            {
                indexcolumnas1=vcolumnas.indexOf(vcolumnas.get(i));

            }

        }
        System.out.println(indexcolumnas1);
        if (vwhere.get(0).toString().equals(vcolumnas.get(indexcolumnas1).toString()))
        {
            for(int i=0;i<vdefinitivo.size();i++)
            {
                String s = (String) ((Vector) vdefinitivo.get(i)).get(indexcolumnas1);
                //System.out.println(s);
                if (s.equals(vwhere.get(1)))
                {
                   // vdefinitivo.subList(indexcolumnas1, indexcolumnas2).clear();
                }
                vdefinitivo.remove(i);
                System.out.println(vectorconsulta.get(0).toString()+" : "+((Vector) vdefinitivo.get(i)));
            }
        }
    }
    //////
}

}
