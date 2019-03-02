import java.util.Scanner;

public class switchCF {
  public static void main(String[] args) {
    System.out.println("-----switch-----");
    System.out.println("FUNCTION CALLS HAVE BEEN COMMENTED");
    //findName();
    //challenge();
    int temp = 0;
    printDayOfTheWeek(temp);
    printDayOfTheWeekIE(temp);
    System.out.println("-----END-----");
  }

  public static void findName() {
    Scanner scanner = new Scanner(System.in);
    int temp;

    while ((temp=scanner.nextInt()) != 0) {
      switch(temp) {
        case 1: case 2:
          System.out.println("Khaiser Pasha");
          System.out.println("Tasneem Khaiser");
          break;
        case 3: case 4: case 5:
          System.out.println("Minhaz Khaiser");
          System.out.println("Mohammed Pasha");
          System.out.println("Abdullah Pasha");
          break;
        default:
          System.out.println("Enter from 1 to 5, or 0 to close.");
          break;
      }
    }
  }

  public static void challenge() {
    Scanner scanner = new Scanner(System.in);
    char temp;

    while((temp=scanner.next().charAt(0)) != 'Q') {
      switch(temp) {
        case 'A':
          System.out.println("You found letter: " + temp);
          break;
        case 'B':
          System.out.println("You found letter: " + temp);
          break;
        case 'C':
          System.out.println("You found letter: " + temp);
          break;
        case 'D':
          System.out.println("You found letter: " + temp);
          break;
        case 'E':
          System.out.println("You found letter: " + temp);
          break;
        default:
          System.out.println("Enter A - E, or Q to close.");
          break;
      }
    }
  }

  public static void printDayOfTheWeek(int num) {
    switch(num) {
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Invalid day");
        break;
    }
  }

  public static void printDayOfTheWeekIE(int num) {
    if (num == 0) {
      System.out.println("Sunday");
    } else if (num == 1) {
      System.out.println("Monday");
    } else if (num == 2) {
      System.out.println("Tuesday");
    } else if (num == 3) {
      System.out.println("Wednesday");
    } else if (num == 4) {
      System.out.println("Thursday");
    } else if (num == 5) {
      System.out.println("Friday");
    } else if (num == 6) {
      System.out.println("Saturday");
    } else {
      System.out.println("Invalid day");
    }
  }
}
