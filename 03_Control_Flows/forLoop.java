public class forLoop {
  public static void main(String[] args) {
    System.out.println("-----forLoop-----");
    System.out.println(calcInt(1000, 10));

    for (int i = 2; i < 9; i++) {
      System.out.println("1000*" + i + "% = " + calcInt(1000,i));
    }
    System.out.println("-----");
    for (int i = 8; i > 1; i--) {
      System.out.println("1000*" + i + "% = " + calcInt(1000,i));
    }
    System.out.println("-----END-----");
  }

  public static double calcInt(double amount, double rate) {
    return amount*rate/100;
  }
}
