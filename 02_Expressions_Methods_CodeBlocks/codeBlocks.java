public class codeBlocks {
  public static void main(String[] args) {
    System.out.println("-----codeBlocks-----");

    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    int score2 = 10000;
    int levelCompleted2 = 8;
    int bonus2 = 200;

    if (score == 5000) {
      System.out.println("Score = 5000");
    }

    if (gameOver) {
      System.out.println("Final Score: " + (score+(levelCompleted*bonus)));
      System.out.println("Final Score: " + (score2+(levelCompleted2*bonus2)));
    }

    System.out.println("---------------END---------------");
  }
}
