package lesson_4;

import java.util.Scanner;

public class XuLy3 {
    enum Rank {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, INVALID_DAY_OF_WEEK;

    }

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        boolean flag = true;
        Rank r;
        do {
            System.out.print("nhập vào thứ trong tuần: ");
            var thu = scan.nextLine();
          if(thu.equalsIgnoreCase("Thứ hai")){
              r = Rank.MONDAY;
              System.out.println(r);



          }else if(thu.equalsIgnoreCase("Thứ Ba")){
              r = Rank.TUESDAY;
              System.out.println(r);


          }else if(thu.equalsIgnoreCase("Thứ Tư")){

              r = Rank.WEDNESDAY;
              System.out.println(r);

          }else if(thu.equalsIgnoreCase("Thứ Năm")){
              r = Rank.THURSDAY;
              System.out.println(r);


          }else if(thu.equalsIgnoreCase("Thứ Sáu")){
              r = Rank.FRIDAY;
              System.out.println(r);

          }else if(thu.equalsIgnoreCase("Thứ Bảy")){
              r = Rank.SATURDAY;
              System.out.println(r);
          }else if(thu.equalsIgnoreCase("Chủ Nhật")){
              r = Rank.SUNDAY;
              System.out.println(r);


          }else{
              r = Rank.INVALID_DAY_OF_WEEK;
              System.out.println(r);
              flag = false;

          }
        } while (flag);

    }
}
