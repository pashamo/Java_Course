import java.util.Scanner;

public class arrayChallenges {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("-----arrayChallenges-----");

    int count = scanner.nextInt();
    int[] userArr = readIntegers(count);
    System.out.println("Min value = "+findMin(userArr));

    System.out.println("-----");

    reverse(userArr);
    printArray(userArr);

    System.out.println("-----END-----");
  }

  public static int[] readIntegers(int count) {
    int[] temp = new int[count];
    System.out.println("Enter "+count+" Integer Values:");
    for(int i = 0; i < count; i++) {
      temp[i] = scanner.nextInt();
    }
    return temp;
  }

  public static int findMin(int[] arr) {
    int lowest = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[lowest]) {
        lowest = i;
      }
    }

    return arr[lowest];
  }

  public static void reverse(int[] arr) {
    int[] temp = arr;

    for (int i = 0; i < arr.length/2; i++) {
      int num = temp[i];
      temp[i] = temp[arr.length-1-i];
      temp[arr.length-1-i] = num;
    }
  }

  public static void printArray(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.print("\n");
  }
}
