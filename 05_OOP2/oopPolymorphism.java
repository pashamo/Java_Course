public class oopPolymorphism {
  public static void main(String[] args){
    System.out.println("-----oopPolymorphism-----");

    for(int i = 0; i<5; i++) {
        Movie movie = randomMovie();
        System.out.println("Movie #"+i+": "+movie.getName()+"\n\t"+movie.plot()+"\n");
    }

    System.out.println("-----");

    for(int i = 0; i<6; i++) {
      Car car = randomCar();
      System.out.println("Car #"+i+": "+car.manufacturer+" "+car.model+"");
      System.out.println("\tCylinders: "+car.getCylinders());
      System.out.println("\tDoors: "+car.getDoors());
      System.out.println("\t"+ car.startEngine());
      System.out.println("\t"+ car.accelerate());
      System.out.println("\t"+ car.brake() +"\n");
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

  public static Car randomCar() {
    int randomNumber = (int) (Math.random()*3)+1;
    switch(randomNumber) {
      case 1:
        return new Patrol();
      case 2:
        return new Challenger();
      case 3:
        return new Venza();
      default:
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




  //Car Challenge
  public static class Car {
    private String manufacturer;
    private String model;
    private boolean engine = true;
    private int cylinders;
    private int wheels = 4;
    private int doors;

    public Car(String manufacturer, String model, int cylinders, int doors) {
      this.manufacturer = manufacturer;
      this.model = model;
      this.cylinders = cylinders;
      this.doors = doors;
    }
    public String getManufacturer() {
      return manufacturer;
    }
    public String getModel() {
      return model;
    }
    public boolean getEngine() {
      return engine;
    }
    public int getCylinders() {
      return cylinders;
    }
    public int getWheels() {
      return wheels;
    }
    public int getDoors() {
      return doors;
    }
    public String startEngine() {
      return "CAR engine starts";
    }
    public String accelerate() {
      return "CAR increases speed";
    }
    public String brake() {
      return "CAR brake applied";
    }
  }


  public static class Patrol extends Car{
    public Patrol() {
      super("Nissan","Patrol",8,4);
    }
    @Override
    public String startEngine() {
      return "PATROL engine starts and makes me feel good :)";
    }
    @Override
    public String brake() {
      return "PATROL brake applied, Body tilts forward";
    }
  }


  public static class Challenger extends Car{
    public Challenger() {
      super("Dodge","Challenger",8,2);
    }
    @Override
    public String startEngine() {
      return "Challenger engine roars";
    }
    @Override
    public String accelerate() {
      return "Challenger increases speed and engine roars!";
    }
  }


  public static class Venza extends Car{
    public Venza() {
      super("Toyota","Venza",4,4);
    }
  }

}
