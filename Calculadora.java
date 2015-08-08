package calculadora;

import java.io.*;
import java.util.Scanner;

public class Calculadora {

    public static int seleccionado;
    public static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("Elige una opcion");
        System.out.println("1: SUMA");
        System.out.println("2: RESTA");
        System.out.println("3: MULTIPLICACION");
        System.out.println("4: DIVICION");
        System.out.println("5: EXPONENCIAL");
        System.out.println("6: DIVICION ENTERA");
        System.out.println("7: MOD");
        System.out.println("8: RAIZ");
        System.out.println("9: SALIR");
        seleccionado = sc.nextInt();
        switch (seleccionado) {
            case 1:
                System.out.println("estoy en suma");
                Suma obj = new Suma();
                obj.ope();
                menu();
                break;
            case 2:
                System.out.println("estoy en resta");
                Clase_Resta.resta();
                menu();
                break;
            case 3:
                System.out.println("estoy en multiplicacion");
                Multi multi = new Multi();
                multi.setVisible(true);
                menu();
                break;
            case 4:
                System.out.println("estoy en divicion");
                Divi objD = new Divi();
                objD.datos();
                menu();
                break;
            case 5:
                System.out.println("estoy en exponencial");
                Potencia poten = new Potencia();
                poten.potencia();
                menu();
                break;
            case 6:
                System.out.println("estoy en divicion entera");
                Division_Entera.DIV();
                menu();
                break;
            case 7:
                System.out.println("estoy en modulo");
                CalcMod.calculate();
                menu();
                break;
            case 8:
                System.out.println("estoy en raiz");
                Calculadora_SQR sqr = new Calculadora_SQR();
                sqr.setVisible(true);
                menu();
                break;
            case 9:
                System.out.println("adios");
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        menu();
    }

}
