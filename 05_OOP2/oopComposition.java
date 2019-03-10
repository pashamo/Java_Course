public class oopComposition {
  public static void main(String[] args){
    System.out.println("-----oopComposition-----");

    Dimensions myDimension = new Dimensions(20,20,5);
    Case myCase = new Case("S340","NZXT","650W GOLD", myDimension);
    Monitor myMonitor = new Monitor("24 pleasure","Acer",24, new Resolution(1920,1080));
    Motherboard myMotherboard = new Motherboard("PRIME Z270-A","ASUS",4,3,"v13ß");
    PC myPC = new PC(myCase, myMonitor, myMotherboard);

    //myPC.getTheMonitor().drawPixelAt(1,1,"yellow");
    myPC.powerUp();
    myPC.getTheMotherboard().loadProgram("Atom.io");
    myPC.getTheCase().pressPowerButton();

    System.out.println("-----END-----");
  }


  public static class PC {

    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase ,Monitor theMonitor ,Motherboard theMotherboard) {
      this.theCase = theCase;
      this.theMonitor = theMonitor;
      this.theMotherboard = theMotherboard;
    }
    public void powerUp() {
      theCase.pressPowerButton();
      drawLogo();
    }
    public void drawLogo() {
      //fancy graphics
      theMonitor.drawPixelAt(1,1,"yellow");
    }
    private Case getTheCase() {
      return theCase;
    }
    private Monitor getTheMonitor() {
      return theMonitor;
    }
    private Motherboard getTheMotherboard() {
      return theMotherboard;
    }
  }


  public static class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
      this.model = model;
      this.manufacturer = manufacturer;
      this.ramSlots = ramSlots;
      this.cardSlots = cardSlots;
      this.bios = bios;
    }

    public String getModel() {
      return model;
    }
    public String getManufacturer() {
      return manufacturer;
    }
    public int getRamSlots() {
      return ramSlots;
    }
    public int getCardSlots() {
      return cardSlots;
    }
    public String getBios() {
      return bios;
    }
    public void setModel(String model) {
      this.model = model;
    }
    public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
    }
    public void setRamSlots(int ramSlots) {
      this.ramSlots = ramSlots;
    }
    public void setCardSlots(int cardSlots) {
      this.cardSlots = cardSlots;
    }
    public void setBios(String bios) {
      this.bios = bios;
    }

    public void loadProgram(String programName) {
      System.out.println("Program " + programName + " is now Loading...");
    }
  }


  public static class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model ,String manufacturer ,int size ,Resolution nativeResolution) {
      this.model = model;
      this.manufacturer = manufacturer;
      this.size = size;
      this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
      System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }
    public String getModel() {
      return model;
    }
    public String getManufacturer() {
      return manufacturer;
    }
    public int getSize() {
      return size;
    }
    public Resolution getNativeResolution() {
      return nativeResolution;
    }

  }


  public static class Resolution {

    private int width;
    private int height;

    public Resolution(int width, int height) {
      this.width = width;
      this.height = height;
    }
    public int getWidth() {
      return width;
    }
    public int getHeight() {
      return height;
    }
  }


  public static class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model ,String manufacturer ,String powerSupply ,Dimensions dimensions) {
      this.model = model;
      this.manufacturer = manufacturer;
      this.powerSupply = powerSupply;
      this.dimensions = dimensions;
    }
    public void pressPowerButton() {
      System.out.println("Power button pressed");
    }
    public String getModel() {
      return model;
    }
    public String getManufacturer() {
      return manufacturer;
    }
    public String getPowerSupply() {
      return powerSupply;
    }
    public Dimensions getDimensions() {
      return dimensions;
    }
  }


  public static class Dimensions{
    private int width;
    private int height;
    private int depth;

    public Dimensions(int width ,int height ,int depth) {
      this.width = width;
      this.height = height;
      this.depth = depth;
    }
    public int getWidth() {
      return width;
    }
    public int getHeight() {
      return height;
    }
    public int getDepth() {
      return depth;
    }
  }
}
