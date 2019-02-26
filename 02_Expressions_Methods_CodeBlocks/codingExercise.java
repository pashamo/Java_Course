public class codingExercise {
  public static void main(String[] args) {
    System.out.println("-----codingExercise-----");

    checkNumber(10);
    checkNumber(-10);
    checkNumber(0);

    System.out.println("---------------END---------------");
  }

  public static void checkNumber (int number) {
    if (number > 0) {
      System.out.println("positive");
    } else if (number == 0) {
      System.out.println("zero");
    } else {
      System.out.println("negative");
    }

  }
}
