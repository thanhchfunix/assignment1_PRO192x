package assignment1_PRO192x_cathuythanh;

import java.util.*;

public class Bai9 {
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
    System.out.println("Nhập mã tỉnh-TP:");
    int i = inputInt();
    String tp;
    input.close();
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
      tp = TP[i - 11];
    } else if (i >= 29 && i <= 32) {
      tp = TP[18];
    } else if (i >= 33 && i <= 38) {
      tp = TP[i - 14];
    } else if (i >= 50 && i <= 59) {
      tp = TP[29];
    } else if (i >= 60 && i <= 79) {
      tp = TP[i - 30];
    } else if (i >= 81 && i <= 86) {
      tp = TP[i - 31];
    } else if (i >= 88 && i <= 90) {
      tp = TP[i - 32];
    } else if (i >= 92 && i <= 95) {
      tp = TP[i - 33];
    } else {
      switch (i) {
        case 43:
          tp = TP[25];
          break;
        case 47:
          tp = TP[26];
          break;
        case 48:
          tp = TP[27];
          break;
        case 49:
          tp = TP[28];
          break;
        case 97:
          tp = TP[63];
          break;
        case 98:
          tp = TP[2];
          break;
        case 99:
          tp = TP[64];
          break;
        default:
          tp = "không hợp lệ";
      }
    }
    System.out.println(+i + " là mã tỉnh - TP " + tp);
  }
}
