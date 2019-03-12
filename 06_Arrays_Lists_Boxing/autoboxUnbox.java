import java.util.ArrayList;

public class autoboxUnbox {
  public static void main(String[] args) {
    System.out.println("-----autoboxUnbox-----");

    String[] strArr = new String[2];
    int[] intArr = new int[2];

    ArrayList<String> strArrlist = new ArrayList<String>();
    strArrlist.add("Mohammed");

    //This wont work since int is not a class
    //ArrayList<int> intArrlist = new ArrayList<int>();

    //We can do this instead, create a wrapper class and use that for int types
    ArrayList<IntClass> intArrlist = new ArrayList<IntClass>();
    intArrlist.add(new IntClass(24));

    ArrayList<Integer> integerArrlist = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      integerArrlist.add(Integer.valueOf(i)); //This is the autoboxing portion.
    }

    for (int i = 0; i < integerArrlist.size(); i++) {
      System.out.println(i + " --> " + integerArrlist.get(i).intValue());
    }

    Integer newVal = 56; // = Integer.valueOf(56); These are the same
    int nVal = newVal.intValue();

    System.out.println(newVal+ " Integer --> int "+nVal);

    ArrayList<Double> dblArrlist = new ArrayList<Double>();
    for(double i = 0.0; i < 10.0; i+=0.5) {
      dblArrlist.add(Double.valueOf(i));
    }

    for (int i = 0; i < dblArrlist.size(); i++) {
      System.out.println(i + " --> " + dblArrlist.get(i).doubleValue());
    }

    System.out.println("-----END-----");
  }


  public static class IntClass {
    private int myValue;

    public IntClass(int myValue) {
      this.myValue = myValue;
    }
    public void setMyValue(int myValue) {
      this.myValue = myValue;
    }
    public int getMyValue() {
      return this.myValue;
    }
  }

}
