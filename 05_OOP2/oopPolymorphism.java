public class oopPolymorphism {
  public static void main(String[] args){
    System.out.println("-----oopPolymorphism-----");

    for(int i = 1; i<11; i++) {
        Movie movie = randomMovie();
        System.out.println("Movie #"+i+": "+movie.getName()+"\n\t"+movie.plot()+"\n");
    }


    System.out.println("-----END-----");
  }

  public static Movie randomMovie() {
    int randomNumber = (int) (Math.random()*5)+1;
    String movie;

    switch(randomNumber) {
      case 1:
        movie = "Jaws";
        System.out.println("randomNumber: "+randomNumber+"\t movie: "+movie);
        return new Jaws();
      case 2:
        movie = "The Last Samurai";
        System.out.println("randomNumber: "+randomNumber+"\t movie: "+movie);
        return new LastSamurai();
      case 3:
        movie = "Casino Royale";
        System.out.println("randomNumber: "+randomNumber+"\t movie: "+movie);
        return new CasinoRoyale();
      case 4:
        movie = "John Wick";
        System.out.println("randomNumber: "+randomNumber+"\t movie: "+movie);
        return new JohnWick();
      case 5:
        movie = "Forgetable";
        System.out.println("randomNumber: "+randomNumber+"\t movie: "+movie);
        return new Forgetable();
      default:
        movie = "NULL";
        System.out.println("randomNumber: "+randomNumber+"\t movie: "+movie);
        return null;
    }
  }

  public static class Movie {
    private String name;

    public Movie(String name) {
      this.name = name;
    }
    public String getName() {
      return name;
    }
    public String plot() {
      return "No plot here";
    }
  }

  public static class Jaws extends Movie {

    public Jaws() {
      super("Jaws");
    }

    public String plot() {
      return "A shark eats lots of people";
    }
  }


  public static class LastSamurai extends Movie {

    public LastSamurai() {
      super("The Last Samurai");
    }

    public String plot() {
      return "White man becomes samurai";
    }
  }


  public static class CasinoRoyale extends Movie {

    public CasinoRoyale() {
      super("Casino Royale");
    }

    public String plot() {
      return "007 Agent James Bond gambles";
    }
  }


  public static class JohnWick extends Movie {

    public JohnWick() {
      super("John Wick");
    }

    public String plot() {
      return "Man avenges puppy's death";
    }
  }


  public static class Forgetable extends Movie {

    public Forgetable() {
      super("Forgetable");
    }

    //No Overriden plot method
  }


}
