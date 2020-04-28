package assignment1_PRO192x_cathuythanh;

import java.util.Scanner;

public class Bai2 {
  static Scanner input = new Scanner(System.in);

  /* type and check input */
  static float inputFloat() {
    do {
      try {
        return input.nextFloat();
      } catch (Exception e) {
        System.out.println("Nhập sai, hãy nhập lại:");
        input.next();
      }
    } while (true);
  }

  public static void main(String[] args) {
    float a, b, c;
    System.out.println("Nhập 3 cạnh a,b,c của tam giác:");
    System.out.print("a = ");
    a = inputFloat();
    System.out.print("b = ");
    b = inputFloat();
    System.out.print("c = ");
    c = inputFloat();
    input.close();
    if (a <= 0 || b <= 0 || c <= 0) {
      System.out.println("Nhập sai");
    } else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
      System.out.println("Đây không phải 3 cạnh của tam giác");
    } else {
      if ((a == b) && (b == c)) {
        System.out.println("Tam giác đều");
      }
      if (((a == b) && (b != c)) || ((a != c) && (b == c)) || ((a == c) && (c != b))) {
        System.out.println("Tam giác cân");
      }
      if ((a != c) && (b != c) && (a != b)) {
        System.out.println("Tam giác thường");
      }
    }
  }
}
