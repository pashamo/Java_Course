import java.util.ArrayList;

public class arraylists {
  public static void main(String[] args) {
    System.out.println("-----arrayLists-----");

    GroceryList gL = new GroceryList();
    gL.addToList("Milk");
    gL.addToList("Eggs");
    gL.addToList("Bread");
    gL.addToList("Cheese");
    gL.addToList("Fruit");
    gL.printList();
    gL.removeListItem(4);
    gL.printList();

    System.out.println("-----END-----");
  }


  public static class GroceryList {
    private int[] myNumbers;
    private ArrayList<String> gList = new ArrayList<String>();

    public void addToList(String item) {
      gList.add(item);
    }

    public void printList() {
      System.out.println("Total items: "+gList.size());
      for(int i = 0; i<gList.size(); i++) {
        System.out.println("#"+(i+1)+". "+gList.get(i));
      }
    }

    public void modifyListItem(int position, String item) {
      gList.set(position, item);
    }

    public void removeListItem(int position) {
      String temp = gList.get(position-1);
      gList.remove(position-1);
      System.out.println(temp+" has been removed");
    }

    public String searchItem(String item) {
      //boolean exists = gList.contains(item);
      int position = gList.indexOf(item);
      if (position >= 0) {
        return gList.get(position);
      } else {
        return null;
      }
    }
  }
}
