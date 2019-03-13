import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class linkedLists {
  public static void main(String[] args) {
    System.out.println("-----linkedLists-----");

    LinkedList<String> cities = new LinkedList<String>();
    cities.add("Abu Dhabi");
    cities.add("Dubai");
    cities.add("Sharjah");
    cities.add("Ajman");
    cities.add("Umm Al Quain");
    cities.add("Ras Al Khaima");
    cities.add("Fujaira");
    cities.add(1,"Ghantoot");
    printList(cities);
    //cities.remove(cities.size()-1);
    //printList(cities);

    System.out.println("+++++++++++++++++++");

    LinkedList<String> cities2 = new LinkedList<String>();
    addInOrder(cities2,"Abu Dhabi");
    printList(cities2);
    addInOrder(cities2,"Dubai");
    printList(cities2);
    addInOrder(cities2,"Sharjah");
    printList(cities2);
    addInOrder(cities2,"Ajman");
    printList(cities2);
    addInOrder(cities2,"Umm Al Quain");
    printList(cities2);
    addInOrder(cities2,"Ras Al Khaima");
    printList(cities2);
    addInOrder(cities2,"Fujaira");
    printList(cities2);
    addInOrder(cities2,"Ghantoot");
    printList(cities2);


    visit(cities2);

    System.out.println("-----END-----");
  }


  private static void printList(LinkedList<String> llist) {
    Iterator<String> i = llist.iterator();
    while(i.hasNext()) {
      System.out.println("OMW to --> "+i.next());
    }
    System.out.println("=====");
  }

  private static boolean addInOrder(LinkedList<String> llist, String newCity) {
    ListIterator<String> j = llist.listIterator();
    while(j.hasNext()) {
      int comparison = j.next().compareTo(newCity);
      if(comparison == 0) {//0 means equal
        System.out.println(newCity+" is already in the list.");
        return false;
      } else if(comparison > 0) {
        j.previous();
        j.add(newCity);
        return true;
      }
    }

    j.add(newCity);
    return true;
  }

  private static void visit(LinkedList<String> llist) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean forward = true;
    String temp = "The trip has not begun";
    ListIterator<String> j = llist.listIterator();

    if(llist.isEmpty()) {
      System.out.println("No cities");
    } else {
      System.out.println("O ^ "+j.next());
      printMenu();
    }

    while(!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();

      switch(action) {
        case 0:
          System.out.println("###EndOfTrip###");
          quit=true;
          break;
        case 1:
          if(!forward) {
            if(j.hasNext()) {
              j.next();
              forward = true;
            }
          }
          if(j.hasNext()) {
            temp = j.next();
            System.out.println("O --> "+temp);
          } else {
            System.out.println(temp);
            forward = false;
          }
          break;
        case 2:
          if(forward) {
            if(j.hasPrevious()) {
              j.previous();
              forward = false;
            }
          }
          if(j.hasPrevious()) {
            temp = j.previous();
            System.out.println(temp+" <-- O");
          } else {
            System.out.println(temp);
            forward = true;
          }
          break;
        case 3:
          printMenu();
          break;
        default:
          System.out.println("DEFAULT");
      }
    }
  }

  private static void printMenu() {
    System.out.println("Available Actions:");
    System.out.println("0\tto quit\n1\tgo to next city\n2\tgo too previous city\n3\tprint menu");
  }


  public static class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
      this.name = name;
      this.balance= balance;
    }
    public void setName(String name) {
      this.name = name;
    }
    public void setBalance(double balance) {
      this.balance = balance;
    }
    public String getName() {
      return this.name;
    }
    public double getBalance() {
      return this.balance;
    }
  }
}
