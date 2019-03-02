/*
Write a method named getEvenDigitSum with one parameter of type int called number.

The method should return the sum of the even digits within the number.

If the number is negative, the method should return -1 to indicate an invalid value.


EXAMPLE INPUT/OUTPUT:

* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20

* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4

* getEvenDigitSum(-22); → should return -1 since the number is negative


NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
*/

public class codingExercise17 {
  public static void main(String[] args) {
    System.out.println("-----codingExercise17-----");
    System.out.println(getEvenDigitSum(12345));
    System.out.println(getEvenDigitSum(6));
    System.out.println(getEvenDigitSum(123456789));
    System.out.println("-----END-----");
  }

  public static int getEvenDigitSum(int number) {
    int even = 0;
    int mod = 10;
    if(number >= 0) {
      for(int i=0; i < (""+number).length(); i++) {
        if(i==0) {
          even = (number%mod)%2==0?number%mod:0;
          System.out.println("if  :"+even+"\tmod:"+mod);
        } else {
          even += (number%mod)/(mod/10)%2==0?(number%mod)/(mod/10):0;
          System.out.println("else:"+even+"\tmod:"+mod);
        }
        mod = mod*10;
      }
      return even;
    }
    return -1;
  }
}
