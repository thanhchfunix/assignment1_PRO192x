package assignment1_PRO192x_cathuythanh;

import java.util.Scanner;

public class Bai5 {

  public static void main(String[] args) {
    String str;
    Scanner in = new Scanner(System.in);
    System.out.println("Nhập xâu kí tự");
    str = in.nextLine();
    in.close();
    int length;
    length = str.length();
    char[] myArr = new char[length];
    for (int i = 0; i < length; i++) {
      myArr[i] = str.charAt(i);
    }
    int check = 0;
    for (int i = 0; i < length; i++) {
      if (myArr[i] == myArr[length - 1 - i]) {
        check++;
      }
    }
    if (check >= length - 1) {
      System.out.println("Đây là xâu đối xứng");
    } else {
      System.out.println("Không phải xâu đối xứng");
    }
  }
}
