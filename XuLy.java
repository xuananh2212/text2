package lesson_4;

import java.util.Scanner;

public class XuLy {
    enum Zodiac {

        // Mouse, Buffalo, Tiger, Cat, Dragon, Snake, Horse, Pig, Body, Rooster, Dog, Pig
        MOUSE("TÍ"), BUFFALO("SỬU"), TIGER("DẦN"), CAT("MÃO"), DRAGON("THÌN"), SNAKE("TỴ"), HORSE("NGỌ"), PIG("MÙI"),
        BODY("THÂN"), ROOSTER("DẬU"), DOG("TUẤT"), PIGS("HỢI");

        Zodiac(String name) {

            zodiacName = name;

        }

        private String zodiacName;

        public String getZodeacName() {

            return zodiacName;
        }


    }

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("nhâp giá trị từ 1 -> 12. nhập 0 để thoát: ");
            var n = Integer.parseInt(scan.nextLine());
            Zodiac z;
            switch (n) {

                case 1:
                    z = Zodiac.MOUSE;
                    System.out.println(z);
                    break;
                case 2:
                    z = Zodiac.BUFFALO;
                    System.out.println(z.getZodeacName());
                    break;
                case 3:
                    z = Zodiac.TIGER;
                    System.out.println(z.getZodeacName());
                    break;
                case 4:
                    z = Zodiac.CAT;
                    System.out.println(z.getZodeacName());
                    break;
                case 5:
                    z = Zodiac.DRAGON;
                    System.out.println(z.getZodeacName());
                    break;
                case 6:
                    z = Zodiac.SNAKE;
                    System.out.println(z.getZodeacName());
                    break;
                case 7:
                    z = Zodiac.HORSE;
                    System.out.println(z.getZodeacName());
                    break;
                case 8:
                    z = Zodiac.PIG;
                    System.out.println(z.getZodeacName());
                    break;
                case 9:
                    z = Zodiac.BODY;
                    System.out.println(z.getZodeacName());
                    break;
                case 10:
                    z = Zodiac.ROOSTER;
                    System.out.println(z.getZodeacName());
                    break;
                case 11:
                    z = Zodiac.DOG;
                    System.out.println(z.getZodeacName());
                    break;
                case 12:
                    z = Zodiac.PIGS;
                    System.out.println(z.getZodeacName());
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("vui lòng nhập loại ");
                    break;


            }


        } while (flag);

    }
}
