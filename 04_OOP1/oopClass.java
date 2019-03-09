public class oopClass {

  public static void main(String[] args) {
    System.out.println("-----oopClass-----");

    Car dodge = new Car();
    dodge.setModel("Charger");
    System.out.println(dodge.getModel());

    System.out.println("-----END-----");
  }


  public static class Car{

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
      String validModel = model.toLowerCase();
      if(validModel.equals("challenger")) {
        this.model = model;
      } else {
        this.model = "unknown";
      }
    }

    public String getModel() {
      return this.model;
    }
  }
}
