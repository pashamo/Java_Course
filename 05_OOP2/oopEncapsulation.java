public class oopEncapsulation {
  public static void main(String[] args){
    System.out.println("-----oopEncapsulation-----");

    Player p1 = new Player();
    p1.name = "Mohammed";
    p1.health = 24;
    p1.weapon = "katana";
    System.out.println("Player: "+p1.name+" with health "+p1.health+" and weapon "+p1.weapon);
    p1.loseHealth(10);
    System.out.println("Player: "+p1.name+" with health "+p1.health+" and weapon "+p1.weapon);
    p1.loseHealth(10);
    System.out.println("Player: "+p1.name+" with health "+p1.health+" and weapon "+p1.weapon);
    p1.loseHealth(10);
    p1.health = 24;
    System.out.println("Player: "+p1.name+" with health "+p1.health+" and weapon "+p1.weapon);

    EnchancedPlayer ep1 = new EnchancedPlayer("Motu", 77, "Excalibur");
    System.out.println(ep1.getHealth());

    System.out.println("-----");

    Printer pr1 = new Printer(75,33,true);
    System.out.println("Current toner level: "+pr1.getTonerLevel());
    pr1.addToner(20);
    System.out.println("Current toner level: "+pr1.getTonerLevel());
    System.out.println("Current page count: "+pr1.getPagesPrinted());
    pr1.printPage(200);
    System.out.println("Current page count: "+pr1.getPagesPrinted());

    Printer pr3 = new Printer(90,10,false);
    System.out.println("Current toner level: "+pr3.getTonerLevel());
    pr3.addToner(20);
    System.out.println("Current toner level: "+pr3.getTonerLevel());
    System.out.println("Current page count: "+pr3.getPagesPrinted());
    pr3.printPage(200);
    System.out.println("Current page count: "+pr3.getPagesPrinted());

    System.out.println("-----END-----");
  }


  public static class Player {
    //This is an example of wrong practice of encapsulation
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
      this.health -= damage;
      if (this.health <= 0) {
        System.out.println("Player dead.");
      }
    }
    public int healthRemaining() {
      return this.health;
    }
  }

  public static class EnchancedPlayer {
    //This is an example of GOOD practice of encapsulation
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnchancedPlayer(String name, int health, String weapon) {
      this.name = name;
      this.weapon = weapon;
      if (health > 0 && health <= 100) {
        this.hitPoints = health;
      }
    }

    public void loseHealth(int damage) {
      this.hitPoints -= damage;
      if (this.hitPoints <= 0) {
        System.out.println("Player dead.");
      }
    }
    public int getHealth() {
      return hitPoints;
    }
  }

  public static class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
      this.tonerLevel = tonerLevel;
      this.pagesPrinted = pagesPrinted;
      this.duplex = duplex;

      if (tonerLevel < 0) {
        this.tonerLevel = 0;
      }
    }
    public void addToner(int tonerLevel) {
      this.tonerLevel += tonerLevel;
      if (this.tonerLevel > 100) {
        this.tonerLevel = 100;
      }
    }
    public void printPage(int pages) {
      if (duplex) {
        this.pagesPrinted += pages*2;
      } else {
        this.pagesPrinted += pages;
      }

    }
    public int getTonerLevel() {
      return tonerLevel;
    }
    public int getPagesPrinted() {
      return pagesPrinted;
    }
    public boolean isDuplex() {
      return duplex;
    }
  }
}
