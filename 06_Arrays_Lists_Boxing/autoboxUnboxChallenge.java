/*
// You job is to create a simple banking application.
  // There should be a Bank class
  // It should have an arraylist of Branches
  // Each Branch should have an arraylist of Customers
  // The Customer class should have an arraylist of Doubles (transactions)
  // Customer:
  // Name, and the ArrayList of doubles.
  // Branch:
  // Need to be able to add a new customer and initial transaction amount.
  // Also needs to add additional transactions for that customer/branch
  // Bank:
  // Add a new branch
  // Add a customer to that branch with initial transaction
  // Add a transaction for an existing customer for that branch
  // Show a list of customers for a particular branch and optionally a list
  // of their transactions
  // Demonstration autoboxing and unboxing in your code
  // Hint: Transactions
  // Add data validation.
  // e.g. check if exists, or does not exist, etc.
  // Think about where you are adding the code to perform certain actions
*/
import java.util.ArrayList;

public class autoboxUnboxChallenge {

  public static void main(String[] args) {
    System.out.println("-----autoboxUnboxChallenge-----");

    Customer customer1 = new Customer("Mohammed", 1000.00);
    customer1.addTransaction(-11.99);
    Customer customer2 = new Customer("Abdullah", 2000.00);
    customer2.addTransaction(-149.99);
    System.out.println(customer1.toString());
    System.out.println(customer2.toString());
    Customer customer3 = new Customer("Minhaz", 5000.00);


    Branch branch = new Branch(12345);
    branch.addCustomer(customer1);
    branch.addCustomer(customer2);
    System.out.println(branch.toString());
    branch.addCustomerTransaction(customer1.getCustName(), -349.99);
    System.out.println(branch.toString());


    Bank bank = new Bank("Bank of Montreal");
    bank.addBranch(branch);
    System.out.println(bank.toString());
    bank.addCustomerToBranch(12345,customer3);
    System.out.println(bank.toString());
    bank.addCustomerTransactionFromBank(12345, "Mohammed", -200.00);
    System.out.println(bank.toString());

    System.out.println("-----END-----");
  }


  public static class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
      this.bankName = bankName;
      branches = new ArrayList<Branch>();
    }
    public String getBankName() {
      return this.bankName;
    }
    public void setBankName(String bankName) {
      this.bankName = bankName;
    }
    public ArrayList<Branch> getBranches() {
      return branches;
    }
    public void setBranches(ArrayList<Branch> branches) {
      this.branches = branches;
    }
    public void addBranch(Branch br) {
      this.branches.add(br);
    }
    public void addCustomerToBranch(int brNumber, Customer customer) {
      for(int i = 0; i < branches.size(); i++) {
        if(this.branches.get(i).getBrNumber() == brNumber) {
          Branch br = this.branches.get(i);
          br.addCustomer(customer);
          this.branches.set(i, br);
          System.out.println("Customer for Branch added");
          break;
        } else {
          System.out.println("Customer not added");
        }
      }
    }
    public void addCustomerTransactionFromBank(int brNumber, String custName, double trns) {
      for (int i = 0; i<branches.size(); i++) {
        if(this.branches.get(i).getBrNumber() == brNumber) {
          Branch br = this.branches.get(i);
          br.addCustomerTransaction(custName, trns);
          this.branches.set(i, br);
          System.out.println("Customer record at branch appended");
          break;
        } else {
          System.out.println("Customer record not updated");
        }
      }
    }
    public String toString() {
      String temp = bankName + "\n";
      for(int i = 0; i<branches.size(); i++) {
        temp += branches.get(i).toString();
      }
      return temp;
    }

  }


  public static class Branch {
    private int brNumber;
    private ArrayList<Customer> customers;

    public Branch(int brNumber) {
      this.brNumber = brNumber;
      customers = new ArrayList<Customer>();
    }
    public int getBrNumber() {
      return this.brNumber;
    }
    public void setBrNumber(int brNumber) {
      this.brNumber = brNumber;
    }
    public ArrayList<Customer> getCustomers() {
      return customers;
    }
    public void setCustomers(ArrayList<Customer> customers) {
      this.customers = customers;
    }
    public void addCustomer(Customer customer) {
      this.customers.add(customer);
    }
    public void addCustomerTransaction(String name, double trns) {
      for(int i = 0; i < customers.size(); i++) {
        if (this.customers.get(i).getCustName().equals(name)) {
          Customer temp = this.customers.get(i);
          temp.addTransaction(Double.valueOf(trns));
          this.customers.set(i, temp);
          System.out.println("Transaction for customer added");
          break;
        } else {
          System.out.println("Transaction not added");
        }
      }
    }
    public boolean isCustomer(String name) {
      return true;
    }
    public String toString() {
      String temp = "Branch#"+brNumber+"\n";
      for(int i = 0; i<customers.size(); i++) {
        temp += i+".\t" + customers.get(i).toString() + "\n";
      }
      return temp;
    }
  }


  public static class Customer {
    private String custName;
    private ArrayList<Double> transactions;

    public Customer(String custName, double initTransaction) {
      this.custName = custName;
      transactions = new ArrayList<Double>();
      transactions.add(Double.valueOf(initTransaction));
    }
    public String getCustName() {
      return this.custName;
    }
    public void setCustname(String custName) {
      this.custName = custName;
    }
    public ArrayList<Double> getTransactions() {
      return transactions;
    }
    public void setTransactions(ArrayList<Double> transactions) {
      this.transactions = transactions;
    }
    public void addTransaction(double trns) {
      this.transactions.add(Double.valueOf(trns));
    }
    public String toString() {
      String temp = custName + "\n";
      for(int i = 0; i<transactions.size(); i++) {
        temp += "\t" + transactions.get(i).doubleValue() + "\n";
      }
      return temp;
    }
  }

}
