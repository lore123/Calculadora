
import java.io.*;

public class Potencia {
    
    public static BufferedReader en=new BufferedReader(new InputStreamReader(System.in));
    
    public static int res, num1, poten;
   
    public void potencia()throws IOException
    {
        System.out.println("Dame el numero");
        num1=Integer.parseInt(en.readLine());
        
        System.out.println("Damela potencia");
        poten=Integer.parseInt(en.readLine());
        res=num1;
        for (int i=1;i<poten;i++)
        {            
            res=res*num1;            
        }  
        System.out.println("El exponencial es: "+res);
    }
    
    public static void main(String []args)throws Exception
    {
        Potencia obj=new Potencia();
        obj.potencia();
    }
}
