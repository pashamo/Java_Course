public class operators {
  public static void main(String[] args) {
    // + used for addition and concatenation
    // - used for subtaction
    // ++ -- used for increment or decrement by 1
    // * used for multiplication
    // / used for division
    // % used for modulo
    // < used for less than
    // > used for greater than
    // = used for assigning
    // ! used for inverse
    // == used for evaluation of values, datatypes, objects...
    // != used for inequality
    // <= used for less than and equal to clause
    // >= used for greater than and equal to clause
    // += used for adding or concatenating to current variable
    // -= used for subracting from current variable
    // *= used for multiplying with current variable
    // /= used from dividing from current variable
    // && used for combining comparision/evaluation clauses, AND operator
    // || used for an OR operator
    // testCondition ? val1 : val2 ... This is a teranary operator

    System.out.println("OPERATORS:\n+ used for addition and concatenation\n- used for subtaction\n++ -- used for increment or decrement by 1\n* used for multiplication\n/ used for division\n% used for modulo\n< used for less than\n> used for greater than\n= used for assigning\n! used for inverse\n== used for evaluation of values, datatypes, objects...\n!= used for inequality\n<= used for less than and equal to clause\n>= used for greater than and equal to clause\n+= used for adding or concatenating to current variable\n-= used for subracting from current variable\n*= used for multiplying with current variable\n/= used from dividing from current variable\n&& used for combining comparision/evaluation clauses, AND operator\n|| used for an OR operator\ntestCondition ? val1 : val2 ... This is a teranary operator\n\nEXERCISE 1:\t");

    //EXERCISE 1
    double d1 = 20d;
    double d2 = 80d;
    double d3 = 25d * (d1+d2);
    double mod = d3%40;
    if (mod <= 20) {
      System.out.print("Total is over the limit, " + mod + "\n");
    }
    else {
      System.out.print("Total is within the limit, " + mod + "\n");
    }
  }
}
