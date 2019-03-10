public class oopInheritance {
  public static void main(String[] args) {
    System.out.println("-----oopInheritance-----");

    Animal a1 = new Animal("Animal", 1, 1, 5, 5);

    Cat c1 = new Cat("Koolie", 8, 20, 2, 4, 1, 20, "Calico");
    c1.eat();
    c1.groom();
    c1.walk();
    c1.run();

    Fish f1 = new Fish("Gold Fish", 2, 4, 6, 2, 5);
    f1.swim();

    System.out.println("-----Challenge-----");

    Challenger myDC = new Challenger(7, "Manual", "Yellow Jacket");
    myDC.drive();

    System.out.println("-----END-----");
  }



  public static class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
      this.name = name;
      this.brain = brain;
      this.body = body;
      this.size = size;
      this.weight = weight;
    }
    public String name() {
      return this.name;
    }
    public int brain() {
      return this.brain;
    }
    public int body() {
      return this.body;
    }
    public int size() {
      return this.size;
    }
    public int weight() {
      return this.weight;
    }
    public void name(String name) {
      this.name = name;
    }
    public void brain(int brain) {
      this.brain = brain;
    }
    public void body(int body) {
      this.body = body;
    }
    public void size(int size) {
      this.size = size;
    }
    public void weight(int weight) {
      this.weight = weight;
    }
    public void eat() {
      System.out.println("Animal.eat() called");
    }
    public void move(int speed) {
      System.out.println("Animal.move() called. Animal is moving at speed "+speed);
    }

  }



  public static class Cat extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Cat(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
      super(name, 1, 1, size, weight);
      this.eyes = eyes;
      this.legs = legs;
      this.tail = tail;
      this.teeth = teeth;
      this.coat = coat;
    }

    public void groom() {
      System.out.println(super.name + " is grooming itself");
    }
    @Override
    public void eat() {
      System.out.println("Cat.eat() called");
      groom();
      super.eat();
    }
    public void walk() {
      System.out.println("Cat.walk() called");
      super.move(2);
    }
    public void run() {
      System.out.println("Cat.run() called");
      super.move(10);
    }

  }



  public static class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
      super(name, 1, 1, size, weight);
      this.gills = gills;
      this.eyes = eyes;
      this.fins = fins;
    }

    public void rest(){
      System.out.println("Fish.rest() is called");
    }
    public void moveMuscles() {
      System.out.println("Fish.moveMuscles() is called");
    }
    public void moveBackFin() {
      System.out.println("Fish.moveBackFin() is called");
    }
    public void swim() {
      System.out.println("Fish.swim() is called");
      moveMuscles();
      moveBackFin();
      super.move(5);
    }
  }



  public static class Vehicle {

    private int wheels;
    private int doors;
    private int length;
    private int engineSize;

    public Vehicle(int wheels, int doors, int length, int engineSize) {
      this.wheels = wheels;
      this.doors = doors;
      this.length = length;
      this.engineSize = engineSize;
    }

    public void drive() {
      System.out.println("Vehicle.drive() called");
    }
  }

  public static class Car extends Vehicle {

    private int passengers;
    private String type;
    private boolean SUV;
    private int range;
    private String model;

    public Car(int doors, int length, int engineSize, int passengers, String type, boolean SUV, int range, String model) {
      super(4, doors, length, engineSize);
      this.passengers = passengers;
      this.type = type;
      this.SUV = SUV;
      this.range = range;
      this.model = model;
    }

  }

  public static class Challenger extends Car {

    private String transmission;
    private String colour;

    public Challenger(int engineSize, String transmission, String colour) {
      super(2,5020,engineSize,5,"american muscle", false, 500, "Dodge");
      this.transmission = transmission;
      this.colour = colour;
    }
  }
}
