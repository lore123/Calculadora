
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Cain Casas
 */
public class Division_Entera {

    /**
     * @param args the command line arguments
     */
    public static void DIV()
    {
        double num1=0, num2=0,r;
        int res;
        num1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
        num2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
        r=num1/num2;
        res=(int) r;
        JOptionPane.showMessageDialog(null, "RESULTADO: "+res);
        
    }
    public static void main(String[] args) {
        DIV();
    }
    
}
