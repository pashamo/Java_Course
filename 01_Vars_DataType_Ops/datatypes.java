//import java.text.DecimalFormat;

public class datatypes {

  //public static DecimalFormat df2 = new DecimalFormat(".##");

  public static void main(String[] args) {

    //LONG has a width of 64
    long l = 1000L;
    long l1 = l/2;
    //INTEGERS have a width of 32
    int i = 7;
    int i1 = i/3;
    //SHORT has a width of 16
    short s = 1000;
    short s1 = (short) (s/2);
    //BYTE has a width of 8
    byte b = 127;
    byte b1 = (byte) (b/2);
    //FLOAT width of 32 and 7 decimal precision
    float f = 7f;
    float f1 = f/3f;
    //DOUBLE width of 64 and 16 decimal precision
    double d = 7d;
    double d1 = d/3d;
    //CHAR
    char c = '\u00A9';
    char c1 = '\u03A9';
    //BOOLEAN
    boolean bool = true;
    //STRING
    String str = "Mohammed Pasha";

    System.out.println("LONG:\t" + l1 + "\nINT: \t" + i1 + "\nSHORT:\t" + s1 + "\nBYTE:\t" + b1 + "\nFLOAT:\t" + f1 + "\nDOUBLE:\t" + d1 + "\nCHAR:\t" + c+c1 + "\nBOOLEAN:\t" + bool + "\nSTRING:\t" + str);

    //EXERCISE 1
    byte b0= 8;
    short s0 = 260;
    int i0 = 2000;
    long e1 = 50000L + 10L * (b0+s0+i0);

    System.out.println("\n\nEXERCISE 1:\t" + e1);

    //EXERCISE 2
    double lbs = 185d;
    double e2 = lbs*0.45359237d;
    System.out.println("EXERCISE 2:\t" + lbs + "lbs = " + String.format("%.2f", e2) + "kg");

    //EXERCISE 3
    char e3 = '\u00AE';
    System.out.println("EXERCISE 3:\t" + e3 + "\n");
  }
}
