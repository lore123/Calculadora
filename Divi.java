
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yimpey
 */
public class Divi {

    public static Division objP = new Division();
    public static Scanner sc = new Scanner(System.in);
    public static double num1, num2;

    public static void main(String[] args) {
        Divi obj = new Divi();
        obj.datos();

    }

    public static void datos() {
        System.out.println("Dame el primer numero");
        num1 = sc.nextDouble();
        System.out.println("Dame el segundo numero");
        num2 = sc.nextDouble();
        
        objP.division(num1,num2);
    }
}
