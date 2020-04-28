package assignment1_PRO192x_cathuythanh;

import java.util.Scanner;

public class Bai7 {
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
    int[] arr1 = new int[5];
    int[] arr2 = new int[5];
    System.out.println("Nhập mảng 1 gồm 5 phần tử là số nguyên");
    for (int i = 0; i < 5; i++) {
      arr1[i] = inputInt();
    }
    System.out.println("Nhập mảng 2 gồm 5 phần tử là số nguyên");
    for (int i = 0; i < 5; i++) {
      arr2[i] = inputInt();
    }
    int check = 0;
    for (int i = 0; i < 5; i++) {
      if (arr1[i] == arr2[i]) {
        check++;
      } else {
        System.out.println("Vị trí thứ " + (i + 1));
        System.out.printf("%-6d", arr1[i]);
        System.out.printf("%6d%n", arr2[i]);
      }
    }
    if (check == 5) {
      System.out.println("Hai mảng giống nhau");
    } else {
      System.out.println("Hai mảng khác nhau");
    }
    input.close();
  }
}
