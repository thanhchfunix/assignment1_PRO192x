package assignment1_PRO192x_cathuythanh;

import java.util.Scanner;

public class Bai1 {
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
    System.out.println("Nhập 3 số a, b, c");
    System.out.print("a = ");
    a = inputFloat();
    System.out.print("b = ");
    b = inputFloat();
    System.out.print("c = ");
    c = inputFloat();
    input.close();
    float max, min;
    max = a;
    max = max < b ? b : a;
    max = max < c ? c : max;
    min = a;
    min = min > b ? b : a;
    min = min > c ? c : min;
    System.out.println("Số lớn nhất trong ba số là:" + max);
    System.out.println("Số nhỏ nhất trong ba số là:" + min);
  }
}
