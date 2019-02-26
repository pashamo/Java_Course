public class methods {
  public static void main(String[] args) {
    System.out.println("-----methods-----");

calculate(true, 800, 5, 100);
    calculate(true, 10000, 8, 200);

    displayHighScorePosition("Mohammed Pasha", calculateHighScorePosition(1500));
    displayHighScorePosition("Mohammed Pasha", calculateHighScorePosition(900));
    displayHighScorePosition("Mohammed Pasha", calculateHighScorePosition(400));
    displayHighScorePosition("Mohammed Pasha", calculateHighScorePosition(50));


    System.out.println("---------------END---------------");
  }

  public static void calculate(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (score == 5000) {
      System.out.println("Score = 5000");
    }

    if (gameOver) {
      System.out.println("Final Score: " + (score+(levelCompleted*bonus)+1000));
    }

  }

  public static void displayHighScorePosition(String name, int position) {
    System.out.println(name + ", managed to get into position " + position + " on the high score table.");
  }

  public static int calculateHighScorePosition(int score) {
    if (score >= 1000) {
      return 1;
    } else if (score >= 500) {
      return 2;
    } else if (score >= 100) {
      return 3;
    }
    return 4;

  }
}
