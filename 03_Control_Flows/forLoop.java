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
    System.out.println("-----");
    int count = 0;
    for (int i = 10; i < 50 ; i++) {
      if (isPrime(i)) {
        count++;
        System.out.println(i);
      }
      if (count==3) {
        break;
      }
    }
    System.out.println("-----");
    int sum = 0;
    count = 0;
    for (int i = 1; i < 1001 ; i++) {
      if (i%3==0 && i%5==0) {
        System.out.println(i);
        sum+=i;
        count++;
      }
      if (count == 5) {
        break;
      }
    }
    System.out.println("SUM: "+sum);
    System.out.println("-----END-----");
  }

  public static double calcInt(double amount, double rate) {
    return amount*rate/100;
  }



  public static boolean isPrime (int n) {
    if (n==1) {
      return false;
    }
    for (int i = 2; i < n/2; i++) {
      if(n%i==0) {
        return false;
      }
    }
    return true;
  }
}
