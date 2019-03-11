import java.util.Scanner;

public class arrays {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("-----arrays-----");
/*
    int[] intArray = new int[10];
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = i+1;
      System.out.println(intArray[i]);
    }

    int[] intArray2 = {10,9,8,7,6,5,4,3,2,1};
    for (int i = 0; i < intArray2.length; i++) {
      System.out.println(intArray2[i]);
    }


    int[] myarr = getIntegers(5);
    printArray(myarr);
    System.out.println("average: "+getAverage(myarr));
*/
    System.out.println("-----");

    int[] challengeArray = getIntegers(10);
    int[] challengeSorted = sortArray(challengeArray);
    System.out.println("-----Sorted-----");
    printArray(challengeSorted);
    printArray(challengeArray);

    System.out.println("-----END-----");
  }

  public static int[] getIntegers(int num) {
    System.out.println("Enter "+num+" Integer values:");
    int[] temparr = new int[num];
    for (int i = 0; i<num; i++) {
      temparr[i] = scanner.nextInt();
    }
    return temparr;
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.print("\n");
  }

  public static double getAverage(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum/arr.length;
  }

  public static int[] sortArray(int[] arr) {
    int[] temp = new int[arr.length];

    for(int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }

    int highIndx = 0;

    printArray(temp);
    for (int i = 0; i < arr.length-1; i++) {
      highIndx = i;
      for (int j = i; j < arr.length; j++) {
        if(temp[j] > temp[highIndx]) {
          highIndx = j;
        }
      }
      int num = temp[highIndx];
      temp[highIndx] = temp[i];
      temp[i] = num;
      printArray(temp);
    }

    return temp;
  }
}
