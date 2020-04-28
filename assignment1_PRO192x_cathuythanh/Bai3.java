package assignment1_PRO192x_cathuythanh;

import java.util.Scanner;

public class Bai3 {
  static Scanner input = new Scanner(System.in);
  
  /*type and check input*/
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
    int[] myArray = new int[10];
    System.out.println("Nhập mảng đầu vào");
    int max = 0;
    for (int i = 0; i <= myArray.length - 1; i++) {
      myArray[i] = inputInt();
      if (i == 0) {
        max = myArray[0];
        continue;
      }
      if (max < myArray[i]) {
        max = myArray[i];
      }
    }
    System.out.println("Số lớn nhất trong mảng là: " + max);
    input.close();
  }
}
