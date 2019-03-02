public class parsingString {
  public static void main(String[] args) {
    System.out.println("-----parsingString-----");

    String numAsString = "2019";
    System.out.println(numAsString);

    int stringAsNum = Integer.parseInt(numAsString);

    numAsString += 1;
    stringAsNum += 1;

    System.out.println(numAsString + " " + stringAsNum);

    double stringAsDbl = Double.parseDouble(numAsString);

    System.out.println(numAsString + " " + stringAsNum + " " + stringAsDbl);

    System.out.println("-----END-----");
  }
}
