import java.util.Scanner;

/**
 * Author: Rangel
 */

public class LeituraMultipla {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int A, B, C, D;

    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();

    System.out.println("DIFERENCA = " + (A * B - C * D));

    sc.close();
  }
}