public class whileLoop {
  public static void main(String[] args) {
    System.out.println("-----whileLoop-----");

    int count = 1;
    while (count != 5) {
      System.out.println(count);
      count++;
    }

    System.out.println("-----");

    count = 1;
    while (true) {
      if (count == 5) {
        break;
      }
      System.out.println(count);
      count++;
    }

    System.out.println("-----");

    count = 1;
    do {
      System.out.println(count);
      count++;
    } while (count != 5);

    System.out.println("-----");

    int n1 = 4;
    int n2 = 20;
    int ce = 0;
    while(n1 <= n2) {
      n1++;
      if (!isEvenNumber(n1)) {
        continue;
      }
      System.out.println(n1);
      ce++;
      if(ce==5) {
        break;
      }
    }
    System.out.println("Total Even numbers found: "+ce);

    System.out.println("-----");

    System.out.println(sumDigits(123456));
    System.out.println("-----END-----");
  }

  public static int sumDigits (int number) {
    int sum = 0;
    if (number > 9) {
      while (number > 0) {
        sum += number%10;
        number/=10;
      }
      return sum;
    }
    return -1;
  }

  public static boolean isEvenNumber(int number) {
    if (number%2 ==0) {return true;}
    else {return false;}
  }
}
