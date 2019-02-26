public class methodOverloading {

  public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

  public static void main (String[] args) {
    System.out.println("-----methodOverloading-----");
    System.out.println(calcFeetAndInchesToCentimeters(2));
    System.out.println(calcFeetAndInchesToCentimeters(-20));
    System.out.println(calcFeetAndInchesToCentimeters(8,4));
    System.out.println(calcFeetAndInchesToCentimeters(-1,13));
    System.out.println("-----Challenge-----");
    System.out.println(getDurationString(3945));
    System.out.println(getDurationString(65,45));
    System.out.println(getDurationString(367,1));
    System.out.println("---------------END---------------");
  }

  public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
    if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
      return calcFeetAndInchesToCentimeters(feet*12+inches);
    }
    return -1;
  }

  public static double calcFeetAndInchesToCentimeters (double inches) {
    if (inches >= 0) {
      return 2.54*inches;
    }
    return -1;
  }

  public static String getDurationString(int minutes, int seconds) {
    if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
      return getDurationString(minutes*60+seconds);
    }
    return INVALID_VALUE_MESSAGE;
  }

  public static String getDurationString(int seconds) {
    if (seconds >= 0) {
      String hrs = ""+(int)Math.floor(seconds/3600);
      String min = ""+(int)Math.floor((seconds/60)%60);
      String sec = ""+seconds%60;
      if (hrs.length()==1) {
        hrs="0"+hrs;
      }
      if (min.length()==1) {
        min="0"+min;
      }
      if (sec.length()==1) {
        sec="0"+sec;
      }
      return hrs+"h "+min+"m "+sec+"s";
      //return (int)Math.floor(seconds/3600) + "h " + (int)Math.floor((seconds/60)%60) + "m " + (seconds%60) + "s ";
    }
    return INVALID_VALUE_MESSAGE;
  }
}

/*
1 hour = 60 minutes = 3600 seconds
1 minute = 60 seconds

*/
