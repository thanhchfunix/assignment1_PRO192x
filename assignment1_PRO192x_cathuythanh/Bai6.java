package assignment1_PRO192x_cathuythanh;

import java.util.Scanner;

public class Bai6 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str;
    System.out.println("Nhập chuỗi:");
    str = input.nextLine();
    input.close();
    System.out.println("Độ dài chuỗi vừa nhập:" + str.length());
  }
}
