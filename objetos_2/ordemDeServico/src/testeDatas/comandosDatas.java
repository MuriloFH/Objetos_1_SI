package testeDatas;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class comandosDatas {
    public static void main(String[] args){
        Date data = new Date();
        System.out.println(data);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println(formato.format(data));
        
        try{
            Date nascimento = formato.parse("23/05/1999");
            System.out.println("Data Nascimento -> " + nascimento);
        }catch(ParseException erro){
            System.out.println("erro -> " + erro); 
        }
       

        
        System.out.println("");
    }
}
