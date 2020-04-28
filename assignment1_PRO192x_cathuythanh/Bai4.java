package assignment1_PRO192x_cathuythanh;

import java.util.Scanner;

public class Bai4 {
  static Scanner input = new Scanner(System.in);

  /* type and check input */
  static int inputInt() {
    do {
      try {
        return input.nextInt();
      } catch (Exception e) {
        System.out.println("Nhập sai, hãy nhập lại:");
        input.next();
      }
    } while (true);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] myArray = new int[10];
    System.out.println("Nhập mảng 10 phần tử");
    for (int i = 0; i <= myArray.length - 1; i++) {
      myArray[i] = inputInt();
    }
    input.close();
    System.out.println("Dãy số đảo ngược của mảng vừa nhập:");
    for (int j = 9; j >= 0; j--) {
      System.out.println(myArray[j]);
    }
  }
}
