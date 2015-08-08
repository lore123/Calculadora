public class CalcMod {

  public static void calculate(){
    System.out.print("Operador 1 = ");
    double opt1 = new Scanner(System.in).nextDouble();
    System.out.print("Operador 2 = ");
    double opt2 = new Scanner(System.in).nextDouble();
    System.out.println("Mod = " + compute(opt1, opt2));
  }

  private static double compute(double opt1, double opt2){
    return opt1 % opt2;
  }
}
