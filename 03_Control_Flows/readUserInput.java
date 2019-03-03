import java.util.Scanner;

public class readUserInput{
  public static void main(String[] args) {
    System.out.println("-----readUserInput-----");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Name: ");
    String name = scanner.nextLine();

    System.out.println("Year of birth: ");
    int years = scanner.nextInt();

    System.out.println("Hello "+name+", you are "+ (2019-years)+" yrs old.");
    //scanner.close();

    System.out.println("-----");

  //  Scanner scanner2 = new Scanner(System.in);
    int count = 1;
    int sum = 0;

    while(count < 2) {
      System.out.println("Enter number #" + count + ":");

      if(scanner.hasNextInt()) {
        int number = scanner.nextInt();
        sum += number;
        count++;
      } else {
        System.out.println("Invalid Number");
      }
      scanner.nextLine();//important to avoid infinite loop
    }
    System.out.println("Sum of 10 numbers is equal to " + sum);
    //scanner.close();

    System.out.println("-----");

    //readInputMinMax();

    int max = 0;
    int min = 0;
    int temp = 0;
    int count2 = 1;
    //Scanner scanner2 = new Scanner(System.in);

    while(true) {
      System.out.println("Enter number: ");

      if(scanner.hasNextInt()) {
        temp = scanner.nextInt();
        if (count2 == 1) {
          min = temp;
          max = temp;
        } else if (temp > max) {
          max = temp;
        } else if (temp < min) {
          min = temp;
        }
      } else {
        break;
      }
      scanner.nextLine();
      count2++;
    }
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);

    scanner.close();

    System.out.println("-----END-----");
  }

  public static void readInputMinMax() {
    int max = 0;
    int min = 0;
    int temp = 0;
    int count2 = 1;
    Scanner scanner2 = new Scanner(System.in);

    while(true) {
      boolean hn = scanner2.hasNextInt();

      if(hn) {
        temp = scanner2.nextInt();
        if (temp >= max) {
          max = temp;
        } else if (temp <= min || count2 == 1) {
          min = temp;
        }
      } else {
        break;
      }
      scanner2.nextLine();
      count2++;
    }
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
  }
}
