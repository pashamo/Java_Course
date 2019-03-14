public class interfaces {
  public static void main(String[] args) {
    System.out.println("-----interfaces-----");

    ITelephone myPhone = new DeskPhone(12345);
    myPhone.powerOn();
    myPhone.answer();
    myPhone.callPhone(12345);

    myPhone = new MobilePhone(23456);
    myPhone.powerOn();
    myPhone.answer();
    myPhone.callPhone(23456);


    System.out.println("-----END-----");
  }


  public static class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;
    public MobilePhone(int phoneNumber) {
      this.myNumber = phoneNumber;
    }
    @Override
    public void powerOn() {
      isOn = true;
      System.out.println("MobilePhone powered ON");
    }
    @Override
    public void dial(int phoneNumber) {
      if (isOn) {
        System.out.println("Dialing "+phoneNumber+" from MobilePhone");
      } else {
        System.out.println("MobilePhone switched off");
      }
    }
    @Override
    public void answer() {
      if (isRinging) {
        System.out.println("Answering MobilePhone");
        isRinging = false;
      } else {
        System.out.println("MobilePhone not ringing...");
      }
    }
    @Override
    public boolean callPhone(int phoneNumber) {
      if (phoneNumber == myNumber && isOn) {
        isRinging = true;
        System.out.println("Ring Ring");
      } else {
        isRinging = false;
      }

      return isRinging;
    }
    @Override
    public boolean isRinging() {
      return isRinging;
    }
  }


  public static class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    public DeskPhone(int phoneNumber) {
      this.myNumber = phoneNumber;
    }
    @Override
    public void powerOn() {
      System.out.println("DeskPhone always ON");
    }
    @Override
    public void dial(int phoneNumber) {
      System.out.println("Dialing "+phoneNumber+" from DeskPhone.");
    }
    @Override
    public void answer() {
      if (isRinging) {
        System.out.println("Answering DeskPhone");
        isRinging = false;
      } else {
        System.out.println("Phone not ringing...");
      }
    }
    @Override
    public boolean callPhone(int phoneNumber) {
      if (phoneNumber == myNumber) {
        isRinging = true;
        System.out.println("Ring Ring");
      } else {
        isRinging = false;
      }

      return isRinging;
    }
    @Override
    public boolean isRinging() {
      return isRinging;
    }
  }

  public static interface ITelephone {
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
  }
}
