/*
// Create a program that implements a simple mobile phone with the following capabilities.
  // Able to store, modify, remove and query contact names.
  // You will want to create a separate class for Contacts (name and phone number).
  // Create a master class (MobilePhone) that holds the ArrayList of Contacts
  // The MobilePhone class has the functionality listed above.
  // Add a menu of options that are available.
  // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
  // and search/find contact.
  // When adding or updating be sure to check if the contact already exists (use name)
  // Be sure not to expose the inner workings of the Arraylist to MobilePhone
  // e.g. no ints, no .get(i) etc
  // MobilePhone should do everything with Contact objects only.
*/

import java.util.ArrayList;

public class arraylistChallenge {
  public static void main(String[] args) {
    System.out.println("-----arraylistChallenge-----");

    MobilePhone mp4_12c = new MobilePhone("01234");
    Contacts me = new Contacts("Mohammed","12345");
    Contacts me2 = new Contacts("Kamran","23456");
    mp4_12c.storeContact(me);
    mp4_12c.storeContact(me2);
    System.out.println(mp4_12c.toString());
    System.out.println(mp4_12c.findContact(me));
    System.out.println();
    mp4_12c.removeContact(me);
    System.out.println(mp4_12c.toString());


    System.out.println("-----END-----");
  }



  public static class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> phoneContacts;

    public MobilePhone(String myNumber) {
      this.myNumber = myNumber;
      this.phoneContacts = new ArrayList<Contacts>();
    }
    public boolean storeContact(Contacts user) {
      if (findContact(user.getContactName()) >= 0) {
        System.out.println("Contact exists");
        return false;
      }
      phoneContacts.add(user);
      return true;
    }
    public boolean modifyContact(Contacts current, Contacts addUser) {
      int foundposition = findContact(current);
      if(foundposition < 0) {
        System.out.println(current.toString()+ " - Contact does not exist");
        return false;
      }

      phoneContacts.set(foundposition,addUser);
      System.out.println(current.toString()+", replaced with, "+addUser.toString());
      return true;
    }
    public void removeContact(Contacts user) {
      phoneContacts.remove(user);
    }
    private int findContact(Contacts user) {
      return this.phoneContacts.indexOf(user);
    }
    private int findContact(String userName) {
      for(int i = 0; i < phoneContacts.size(); i++) {
        Contacts contact = phoneContacts.get(i);
        if (contact.getContactName().equals(userName)) {
          return i;
        }
      }
      return -1;
    }
    public String queryContact(Contacts user) {
      if(findContact(user) >= 0) {
        return user.getContactName();
      }
      return null;
    }
    public String toString() {
      String temp = "";
      for(int i = 0; i < phoneContacts.size(); i++) {
        temp += i+". "+phoneContacts.get(i)+"\n";
      }
      return temp;
    }
  }



  public static class Contacts {
    private String contactName;
    private String contactNumber;

    public Contacts(String contactName, String contactNumber) {
      this.contactName = contactName;
      this.contactNumber = contactNumber;
    }
    public String getContactName() {
      return contactName;
    }
    public String getContactNumber() {
      return contactNumber;
    }
    public void setContactName(String contactName) {
      this.contactName = contactName;
    }
    public void setContactNumber(String contactNumber) {
      this.contactNumber = contactNumber;
    }

    public static Contacts newContact(String name, String number) {
      return new Contacts(name,number);
    }

    public String toString() {
      return this.contactName + ", " + this.contactNumber;
    }
  }
}
