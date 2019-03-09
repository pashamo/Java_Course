public class oopConst {
  public static void main(String[] args) {
    System.out.println("-----oopConst-----");

    BankAccount myAcc = new BankAccount();
    System.out.println(myAcc.getAccountNumber()+" "+myAcc.getBalance()+" "+myAcc.getName()+" "+myAcc.getEmail()+" "+myAcc.getPhone());
    myAcc.withdrawal(100.0);
    myAcc.deposit(50.0);
    myAcc.withdrawal(100.0);
    myAcc.deposit(51.0);
    myAcc.withdrawal(100.0);
    BankAccount hisAcc = new BankAccount(123123,110,"Mohammed Pasha","pashamo@github.com","1234567890");
    System.out.println(hisAcc.getAccountNumber()+" "+hisAcc.getBalance()+" "+hisAcc.getName()+" "+hisAcc.getEmail()+" "+hisAcc.getPhone());


    VipCustomer vc1 = new VipCustomer();
    System.out.println(vc1.getName()+" "+vc1.getCreditLimit()+" "+vc1.getEmail());
    VipCustomer vc2 = new VipCustomer("Pashamo", "pashamo@pashamo.com");
    System.out.println(vc2.getName()+" "+vc2.getCreditLimit()+" "+vc2.getEmail());
    VipCustomer vc3 = new VipCustomer("EM Pasha", 1000, "em_pasha@aol.com");
    System.out.println(vc3.getName()+" "+vc3.getCreditLimit()+" "+vc3.getEmail());


    System.out.println("-----END-----");
  }


  public static class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount() {
      this(10001, 10, "NoName", "NoName@email.e", "1111111111");
      System.out.println("Empty object");
    }

    public BankAccount(int accountNumber, double balance, String name, String email, String phone) {
      System.out.println("Loaded object");
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.name = name;
      this.email = email;
      this.phone = phone;
    }

    public int getAccountNumber() {
      return this.accountNumber;
    }
    public double getBalance() {
      return this.balance;
    }
    public String getName() {
      return this.name;
    }
    public String getEmail() {
      return this.email;
    }
    public String getPhone() {
      return this.phone;
    }
    public void setAccountNumber(int accountNumber) {
      this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
      this.balance = balance;
    }
    public void setName(String name) {
      this.name = name;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public void setPhone(String phone) {
      this.phone = phone;
    }
    public void deposit(double depositAmount) {
      this.balance += depositAmount;
      System.out.println("$"+depositAmount+" deposited to account. Current balance is $"+this.balance);
    }
    public void withdrawal(double withdrawalAmount) {
      if (this.balance-withdrawalAmount < 0) {
        System.out.println("Cannot withdraw $"+withdrawalAmount+", only $"+this.balance+" available.");
      } else {
        this.balance -= withdrawalAmount;
        System.out.println("$"+withdrawalAmount+" withdrawn from account. Current balance is $"+this.balance);
      }
    }

  }


  public static class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
      this("nil",10,"nil@nil.nil");
      System.out.println("CONST1");
    }
    public VipCustomer(String name, String email) {
      this(name, 10, email);
      System.out.println("CONST2");
    }
    public VipCustomer(String name, double creditLimit, String email) {
      this.name = name;
      this.creditLimit = creditLimit;
      this.email = email;
      System.out.println("CONST3");
    }
    public String getName() {
      return this.name;
    }
    public double getCreditLimit() {
      return this.creditLimit;
    }
    public String getEmail() {
      return this.email;
    }
  }

}
