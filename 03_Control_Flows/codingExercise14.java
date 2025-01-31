/*
Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.

Check that number is > 0, if it is not return false.

If number is odd return true, otherwise  return false.

Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.

The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.

It should call the method isOdd to check if each number is odd.

The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.

If those conditions are not satisfied return -1 from the method to indicate invalid input.

Example input/output:

* sumOdd(1, 100); → should return 2500

* sumOdd(-1, 100); →  should return -1

* sumOdd(100, 100); → should return 0

* sumOdd(100, -100); → should return -1

* sumOdd(100, 1000); → should return 247500


TIP: use the remainder operator to check if the number is odd

NOTE: Both methods  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
*/

public class codingExercise14 {
  public static void main(String[] args) {
    System.out.println("-----codingExercise14-----");
    System.out.println("-1 odd?\t" + isOdd(-1));
    System.out.println("0 odd?\t" + isOdd(0));
    System.out.println("1 odd?\t" + isOdd(1));
    System.out.println("2 odd?\t" + isOdd(2));
    System.out.println("0-4 odd sum =\t" + sumOdd(0,4));
    System.out.println("1-2 odd sum =\t" + sumOdd(1,2));
    System.out.println("1-5 odd sum =\t" + sumOdd(1,5));
    System.out.println("2-5 odd sum =\t" + sumOdd(2,5));
    System.out.println("-----END-----");
  }

  public static boolean isOdd(int number) {
    if (number > 0) {
      if (number%2 == 1) {
        return true;
      }
    }
    return false;
  }

  public static int sumOdd(int start, int end) {
    int sum = 0;
    if (start > 0 && end > 0 && end >= start) {
      for (int i = start; i <= end; i++){
        sum += isOdd(i)?i:0;
      }
      return sum;
     }
    return -1;
  }
}
