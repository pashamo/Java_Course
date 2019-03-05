import java.util.Scanner; 

public class test{
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int temp = scanner.nextInt();
  scanner.close();
  for(int i=0; i<temp; i++) {
   System.out.println(i);
  }
 }
}