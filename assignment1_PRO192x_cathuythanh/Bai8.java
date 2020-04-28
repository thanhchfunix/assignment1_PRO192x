package assignment1_PRO192x_cathuythanh;

import java.util.*;

public class Bai8 {
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
    Scanner input = new Scanner(System.in);
    float i, sum = 0;
    System.out.println("Nhập các số (thực) cho đến khi số nhập vào bằng 0:");
    do {
      i = inputFloat();
      sum += i;
    } while (i != 0);
    input.close();
    System.out.println("Tổng các số đã nhập:" + sum);
  }
}
