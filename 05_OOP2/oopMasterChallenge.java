/*

  The purpose of the application is to help a fictitious company called Bills Burgers to manage their process of selling hamburgers.

  Our application will help Bill to select types of burgers, some of the additional items (additions) to be added to the burgers and pricing.

  We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.

  = = = = =
  The basic hamburger should have the following items that the customer can select to be added to the burger:
  -Bread roll type
  -meat
  -and up to 4 additional additions (things like lettuce, tomato, carrot, etc)

  Each one of these items gets charged an additional price so you need some way to track how many items got added and to calculate the final price (base burger with all the additions).

  This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
  = = = = =Create a Hamburger class to deal with all the above.

    // The constructor should only include the roll type, meat and price, can also include name of burger or you can use a setter.

  Also create two extra varieties of Hamburgers (subclasses) to cater for
  a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
    //  The healthy burger can have 6 items (Additions) in total.
    // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
    // not the base class (Hamburger), since the two additions are only appropriate for this new class
    // (in other words new burger type).

  b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger object is created, and then prevent other additions being made.

  All 3 classes should have a method that can be called anytime to show the base price of the hamburger plus all additionals, each showing the addition name, and addition price, and a grand/final total for the burger (base price + all additions)

  For the two additional classes this may require you to be looking at the base class for pricing and then adding totals to final price.

*/

public class oopMasterChallenge {
  public static void main(String[] args){
    System.out.println("-----oopMasterChallenge-----");
///*
    Burger myb = new Burger("Burger","White, Cheese and Garlic", "9oz Beef", 9.99);
    myb.setCondimentPrice(0.25);
    System.out.println(myb.getTotalPrice());
    System.out.println(myb.getCondimentCount()+" "+myb.getMaxCondimentCount());
    myb.addCondiment("Chocolate Sauce");
    System.out.println(myb.getTotalPrice());
    System.out.println(myb.getCondimentCount()+" "+myb.getMaxCondimentCount());
    myb.addCondiment("Maple Sauce");
    System.out.println(myb.getTotalPrice());
    System.out.println(myb.getCondimentCount()+" "+myb.getMaxCondimentCount());
    myb.addCondiment("Walnut Sauce");
    System.out.println(myb.getTotalPrice());
    System.out.println(myb.getCondimentCount()+" "+myb.getMaxCondimentCount());
    myb.addCondiment("Engine Sauce");
    System.out.println(myb.getTotalPrice());
    System.out.println(myb.getCondimentCount()+" "+myb.getMaxCondimentCount());
    myb.addCondiment("Uni Sauce");
    System.out.println(myb.getTotalPrice());
    System.out.println(myb.getCondimentCount()+" "+myb.getMaxCondimentCount());
    myb.showOrder();


    System.out.println(myb.isAdditions());
//*/
  System.out.println("-----");
///*
    DeluxeBurger mydb = new DeluxeBurger();
    mydb.setCondimentPrice(0.25);
    System.out.println(mydb.getTotalPrice());
    System.out.println(mydb.getCondimentCount()+" "+mydb.getMaxCondimentCount());
    mydb.addCondiment("Chocolate Sauce");
    System.out.println(mydb.getTotalPrice());
    System.out.println(mydb.getCondiment1());
    System.out.println(mydb.getCondiment2());
    System.out.println(mydb.getCondiment3());
    System.out.println(mydb.isAdditions());
    mydb.showOrder();
//*/
    System.out.println("-----");

    HealthyBurger myhb = new HealthyBurger();
    myhb.setCondimentPrice(0.25);
    System.out.println(myhb.getTotalPrice());
    System.out.println(myhb.getCondimentCount()+" "+myhb.getMaxCondimentCount());
    myhb.addCondiment("Chocolate Sauce");
    System.out.println(myhb.getTotalPrice());
    System.out.println(myhb.getCondimentCount()+" "+myhb.getMaxCondimentCount());
    myhb.addCondiment("Maple Sauce");
    System.out.println(myhb.getTotalPrice());
    System.out.println(myhb.getCondimentCount()+" "+myhb.getMaxCondimentCount());
    myhb.addCondiment("Walnut Sauce");
    System.out.println(myhb.getTotalPrice());
    System.out.println(myhb.getCondimentCount()+" "+myhb.getMaxCondimentCount());
    myhb.addCondiment("Engine Sauce");
    System.out.println(myhb.getTotalPrice());
    System.out.println(myhb.getCondimentCount()+" "+myhb.getMaxCondimentCount());
    myhb.addCondiment("Uni Sauce");
    System.out.println(myhb.getTotalPrice());
    System.out.println(myhb.getCondimentCount()+" "+myhb.getMaxCondimentCount());
    myhb.addCondiment("Apple Sauce");
    System.out.println(myhb.getTotalPrice());
    System.out.println(myhb.getCondimentCount()+" "+myhb.getMaxCondimentCount());
    myhb.addCondiment("KitKat Sauce");
    System.out.println(myhb.getTotalPrice());
    System.out.println(myhb.getCondimentCount()+" "+myhb.getMaxCondimentCount());
    System.out.println("C1: "+myhb.getCondiment1());
    System.out.println("C2: "+myhb.getCondiment2());
    System.out.println("C3: "+myhb.getCondiment3());
    System.out.println("C4: "+myhb.getCondiment4());
    System.out.println("C5: "+myhb.getCondiment5());
    System.out.println("C6: "+myhb.getCondiment6());
    System.out.println(myhb.isAdditions());
    myhb.showOrder();

    System.out.println("-----END-----");
  }


  public static class Burger {
    private String name;
    private String breadType;
    private String meat;
    private double basePrice;
    private String condiment1;
    private String condiment2;
    private String condiment3;
    private String condiment4;
    private double condimentPrice;
    private int condimentCount = 0;
    private int maxCondimentCount = 4;
    private boolean additions = true;

    public Burger(String name, String breadType, String meat, double basePrice) {
      this.name = name;
      this.breadType = breadType;
      this.meat = meat;
      this.basePrice = basePrice;

    }

    public String getName() {
      return name;
    }
    public String getBreadType() {
      return breadType;
    }
    public String getMeat() {
      return meat;
    }
    public double getBasePrice() {
      return basePrice;
    }
    public String getCondiment1() {
      return condiment1;
    }
    public String getCondiment2() {
      return condiment2;
    }
    public String getCondiment3() {
      return condiment3;
    }
    public String getCondiment4() {
      return condiment4;
    }
    public double getCondimentPrice() {
      return condimentPrice;
    }
    public int getCondimentCount() {
      return condimentCount;
    }
    public int getMaxCondimentCount() {
      return maxCondimentCount;
    }
    public boolean isAdditions() {
      return additions;
    }
    public double getTotalCondimentPrice() {
      return getCondimentCount()*getCondimentPrice();
    }
    public double getTotalPrice() {
      return getTotalCondimentPrice()+getBasePrice();
    }


    public void setName(String name) {
      this.name = name;
    }
    public void setBreadType(String breadType) {
      this.breadType = breadType;
    }
    public void setMeat(String meat) {
      this.meat = meat;
    }
    public void setBasePrice(double basePrice) {
      this.basePrice = basePrice;
    }
    public void setCondiment1(String condiment1) {
      this.condiment1 = condiment1;
    }
    public void setCondiment2(String condiment2) {
      this.condiment2 = condiment2;
    }
    public void setCondiment3(String condiment3) {
      this.condiment3 = condiment3;
    }
    public void setCondiment4(String condiment4) {
      this.condiment4 = condiment4;
    }
    public void setCondimentPrice(double condimentPrice) {
      this.condimentPrice = condimentPrice;
    }
    public void setCondimentCount(int condimentCount) {
      this.condimentCount = condimentCount;
    }
    public void setMaxCondimentCount(int maxCondimentCount) {
      this.maxCondimentCount = maxCondimentCount;
    }
    public void setAdditions(boolean additions) {
      this.additions = additions;
    }


    public void addCondimentCount() {
      condimentCount++;
    }
    public void subtractCondimentCount() {
      condimentCount--;
    }
    public void addCondiment(String tempCond) {
      addCondimentCount();
      int tempcount = getCondimentCount();
      int tempmaxcount = getMaxCondimentCount();

      if (!isAdditions() && tempcount==3) {
        subtractCondimentCount();
        System.out.println("You cannot add condiments to this burger");
      } else if (tempcount > tempmaxcount) {
        subtractCondimentCount();
        System.out.println("Max Condiment count of "+(tempcount-1)+" reached, Cannot add anymore.");
      } else {
        switch(tempcount) {
          case 1:
            setCondiment1(tempCond);
            System.out.println(tempCond+" Added. Condiment count: "+tempcount+"/"+tempmaxcount);
            break;
          case 2:
            setCondiment2(tempCond);
            System.out.println(tempCond+" Added. Condiment count: "+tempcount+"/"+tempmaxcount);
            break;
          case 3:
            setCondiment3(tempCond);
            System.out.println(tempCond+" Added. Condiment count: "+tempcount+"/"+tempmaxcount);
            break;
          case 4:
            setCondiment4(tempCond);
            System.out.println(tempCond+" Added. Condiment count: "+tempcount+"/"+tempmaxcount);
            break;
          default:
            System.out.println("DEFAULT - Burger.addCondiment()");
            break;
        }
      }
    }

    public void showOrder() {
      System.out.println("= = = = =\nYour Order:\n= = = = =\n");
      System.out.println("Burger: "+getName()+"- with "+getBreadType()+" and "+getMeat()+"\n\t$"+getBasePrice());
      for (int i = 1; i < getCondimentCount()+1; i++) {
        switch(i) {
          case 1:
            System.out.println("Condiment: "+getCondiment1()+"\n\t$"+getCondimentPrice());
            break;
          case 2:
            System.out.println("Condiment: "+getCondiment2()+"\n\t$"+getCondimentPrice());
            break;
          case 3:
            System.out.println("Condiment: "+getCondiment3()+"\n\t$"+getCondimentPrice());
            break;
          case 4:
            System.out.println("Condiment: "+getCondiment4()+"\n\t$"+getCondimentPrice());
            break;
          default:
            System.out.println("Condiment: None added\n\t$0.00");
            break;
        }
      }
      System.out.println("TOTAL:\n\t$"+getTotalPrice()+"\n= = = = =");
    }

  }

  public static class HealthyBurger extends Burger {
    private String condiment5;
    private String condiment6;

    public HealthyBurger() {
      super("Healthy Burger", "Brown Rye Bread", "9oz. Tofu", 11.99);
      setMaxCondimentCount(6);
    }

    public String getCondiment5() {
      return condiment5;
    }
    public String getCondiment6() {
      return condiment6;
    }
    public void setCondiment5(String condiment5) {
      this.condiment5 = condiment5;
    }
    public void setCondiment6(String condiment6) {
      this.condiment6 = condiment6;
    }
    @Override
    public void addCondiment(String tempCond) {
      if (getCondimentCount() >= 4) {
        addCondimentCount();
        int tempcount = getCondimentCount();
        int tempmaxcount = getMaxCondimentCount();

        if (tempcount > tempmaxcount) {
          subtractCondimentCount();
          System.out.println("Max Condiment count of "+(tempcount-1)+" reached, Cannot add anymore.");
        } else {
          switch(tempcount) {
            case 5:
              setCondiment5(tempCond);
              System.out.println(tempCond+" Added. Condiment count: "+tempcount+"/"+tempmaxcount);
              break;
            case 6:
              setCondiment6(tempCond);
              System.out.println(tempCond+" Added. Condiment count: "+tempcount+"/"+tempmaxcount);
              break;
            default:
              System.out.println("DEFAULT - HealthyBurger.addCondiment()");
              break;
          }
        }
      } else {
        super.addCondiment(tempCond);
      }
    }

    @Override
    public void showOrder() {
      System.out.println("= = = = =\nYour Order:\n= = = = =\n");
      System.out.println("Burger: "+getName()+"- with "+getBreadType()+" and "+getMeat()+"\n\t$"+getBasePrice());
      for (int i = 1; i < getCondimentCount()+1; i++) {
        switch(i) {
          case 1:
            System.out.println("Condiment: "+getCondiment1()+"\n\t$"+getCondimentPrice());
            break;
          case 2:
            System.out.println("Condiment: "+getCondiment2()+"\n\t$"+getCondimentPrice());
            break;
          case 3:
            System.out.println("Condiment: "+getCondiment3()+"\n\t$"+getCondimentPrice());
            break;
          case 4:
            System.out.println("Condiment: "+getCondiment4()+"\n\t$"+getCondimentPrice());
            break;
          case 5:
            System.out.println("Condiment: "+getCondiment5()+"\n\t$"+getCondimentPrice());
            break;
          case 6:
            System.out.println("Condiment: "+getCondiment6()+"\n\t$"+getCondimentPrice());
            break;
          default:
            System.out.println("Condiment: None added\n\t$0.00");
            break;
        }
      }
      System.out.println("TOTAL:\n\t$"+getTotalPrice()+"\n= = = = =");
    }

  }

  public static class DeluxeBurger extends Burger {

    public DeluxeBurger() {
      super("Delux Burger", "White bread", "9oz. Beef", 10.99);
      setAdditions(false);
      setCondimentPrice(0.00);
      setMaxCondimentCount(2);
      addCondiment("Chips");
      addCondiment("Drink");
    }

  }
}
