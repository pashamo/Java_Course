public class Car{

  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String colour;

  Car() {
    this.doors = 2;
    this.wheels = 4;
    this.model = "Challenger";
    this.engine = "392 Hemi";
    this.colour = "Yellow Jacket";
  }

  public String toString() {
    return "Doors: "+this.doors+
    "\nWheels: "+this.wheels+
    "\nModel: "+this.model+
    "\nEngine: "+this.engine+
    "\nColour: "+this.colour;
  }
}
