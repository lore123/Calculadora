

package suma;

import java.lang.*;
import java.io.*;
import java.util.*;
public class Suma {
     int a,b,c;
     public void ope(){
         
      Scanner Teclado = new Scanner (System.in);
      System.out.println("Inseta el numero a");
      a=Teclado.nextInt();
      
      System.out.println("Inseta el numero b");
      b=Teclado.nextInt();
      
       c=a+b;
     System.out.println("el resultado es: " +c);
}
    
    public static void main(String[] args) {
     Suma obj=new Suma();
             obj.ope();
    }
    
}