package assignment1_PRO192x_cathuythanh;

import java.util.Scanner;

public class Bai10 {
  static Scanner input = new Scanner(System.in);

  /* type and check input float number */
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

  /* type and check input integer number */
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

  /* ex1 - find maximum and minimum value in 3 float number */
  static void maxMin(float a, float b, float c) {
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

  /* ex2 - show type of triangle */
  static void triAngle(float a, float b, float c) {
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

  /* ex3 - find max element in an array */
  static int maxArr(int[] myArray) {
    int max = 0;
    for (int i = 0; i <= myArray.length - 1; i++) {
      if (i == 0) {
        max = myArray[0];
        continue;
      }
      if (max < myArray[i]) {
        max = myArray[i];
      }
    }
    return max;
  }

  /* ex4 - reverse an array consist of 10 integer number */
  static int[] revArr(int[] myArr) {
    int[] revArr = new int[myArr.length];
    for (int i = myArr.length - 1; i >= 0; i--) {
      revArr[i] = myArr[myArr.length - i - 1];
    }
    return revArr;
  }

  /* ex5 - check type of string input */
  static void checkStr(String str) {
    int length = str.length();
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

  /* ex6 - show the length of a string */
  static void strLength(String str) {
    System.out.println("Độ dài chuỗi là:" + str.length());
  }

  /* ex7 - compare 2 arrays and show different element */
  static void compareArr(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
      System.out.println("Hai mảng khác nhau");
    } else {
      int check = 0;
      for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] == arr2[i]) {
          check++;
        } else {
          System.out.println("Vị trí thứ " + (i + 1));
          System.out.printf("%-6d", arr1[i]);
          System.out.printf("%6d%n", arr2[i]);
        }
      }
      if (check == arr1.length) {
        System.out.println("Hai mảng giống nhau");
      } else {
        System.out.println("Hai mảng khác nhau");
      }
    }
  }

  /* ex8 - sum to zero */
  static void sumToZero() {
    float i, sum = 0;
    System.out.println("Nhập các số cho đến khi số nhập vào bằng 0:");
    do {
      i = inputFloat();
      sum += i;
    } while (i != 0);
    input.close();
    System.out.println("Tổng các số đã nhập:" + sum);
  }

  /* ex9 - return name city or province correspond with input number */
  static String maTinhTp(int i) {
    String[] TP = {"Cao Bằng", "Lạng Sơn", "Bắc Giang", "Quảng Ninh", "Hải Phòng", "Hải Phòng",
        "Thái Bình", "Nam Định", "Phú Thọ", "Thái Nguyên", "Yên Bái", "Tuyên Quang", "Hà Giang",
        "Lào Cai", "Lai Châu", "Sơn La", "Điện Biên", "Hòa Bình", "Hà Nội", "Hà Tây", "Hải Dương",
        "Ninh Bình", "Thanh Hóa", "Nghệ An", "Hà Tĩnh", "Đà Nẵng", "Đak Lak", "Đak Nông",
        "Lâm Đồng", "Hồ Chí Minh", "Đồng Nai", "Bình Dương", "Long An", "Tiền Giang", "Vĩnh Long",
        "Cần Thơ", "Đồng Tháp", "An Giang", "Kiên Giang", "Cà Mau", "Tây Ninh", "Bến Tre",
        "Bà Rịa - Vũng Tàu", "Quảng Bình", "Quảng Trị", "Huế", "Quảng Ngãi", "Bình Định", "Phú Yên",
        "Khánh Hòa", "Gia Lai", "Kon Tum", "Sóc Trăng", "Trà Vinh", "Ninh Thuận", "Bình Thuận",
        "Vĩnh Phúc", "Hưng Yên", "Hà Nam", "Quảng Nam", "Bình Phước", "Bạc Liêu", "Hậu Giang",
        "Bắc Kạn", "Bắc Ninh"};
    if (i >= 11 && i <= 28) {
      return TP[i - 11];
    } else if (i >= 29 && i <= 32) {
      return TP[18];
    } else if (i >= 33 && i <= 38) {
      return TP[i - 14];
    } else if (i >= 50 && i <= 59) {
      return TP[29];
    } else if (i >= 60 && i <= 79) {
      return TP[i - 30];
    } else if (i >= 81 && i <= 86) {
      return TP[i - 31];
    } else if (i >= 88 && i <= 90) {
      return TP[i - 32];
    } else if (i >= 92 && i <= 95) {
      return TP[i - 33];
    } else {
      switch (i) {
        case 43:
          return TP[25];
        case 47:
          return TP[26];
        case 48:
          return TP[27];
        case 49:
          return TP[28];
        case 97:
          return TP[63];
        case 98:
          return TP[2];
        case 99:
          return TP[64];
        default:
          return "không hợp lệ";
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("Nhập bài cần kiểm tra");
    System.out.print("Bài:");
    int k = inputInt();
    while (k < 0 || k > 11) {
      System.out.print("Nhập sai số bài, nhập lại bài:");
      k = inputInt();
    }
    switch (k) {
      case 1: {
        System.out.println("Nhập 3 số a, b, c");
        System.out.print("a = ");
        float a = inputFloat();
        System.out.print("b = ");
        float b = inputFloat();
        System.out.print("c = ");
        float c = inputFloat();
        maxMin(a, b, c);
      }
        break;
      case 2: {
        float a, b, c;
        System.out.println("Nhập 3 cạnh a,b,c của tam giác:");
        System.out.print("a = ");
        a = inputFloat();
        System.out.print("b = ");
        b = inputFloat();
        System.out.print("c = ");
        c = inputFloat();
        triAngle(a, b, c);
      }
        break;
      case 3: {
        int[] myArray = new int[10];
        System.out.println("Nhập mảng đầu vào");
        for (int i = 0; i <= myArray.length - 1; i++) {
          myArray[i] = inputInt();
        }
        System.out.println("Số lớn nhất trong mảng là: " + maxArr(myArray));
      }
        break;
      case 4: {
        int[] myArray = new int[10];
        System.out.println("Nhập mảng 10 phần tử");
        for (int i = 0; i <= myArray.length - 1; i++) {
          myArray[i] = inputInt();
        }
        int[] arr2 = revArr(myArray);
        System.out.println("Dãy số đảo ngược của mảng vừa nhập:");
        for (int i = 0; i <= 9; i++) {
          System.out.println(arr2[i]);
        }
      }
        break;
      case 5: {
        input.nextLine();
        System.out.println("Nhập xâu kí tự");
        String str = input.nextLine();
        checkStr(str);
      }
        break;
      case 6: {
        input.nextLine();
        System.out.println("Nhập chuỗi:");
        String str = input.nextLine();
        strLength(str);
      }
        break;
      case 7: {
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
        compareArr(arr1, arr2);
      }
        break;
      case 8: {
        sumToZero();
      }
        break;
      case 9: {
        System.out.println("Nhập mã tỉnh-TP:");
        int i = inputInt();
        System.out.println(+i + " là mã tỉnh - TP " + maTinhTp(i));
      }
        break;
      case 10: {
        System.out.println("Đây là bài 10");
      }
        break;
    }
    input.close();
  }
}
