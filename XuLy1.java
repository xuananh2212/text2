package lesson_4;

import java.util.Scanner;

public class XuLy1 {
    enum Zodiac1 {
        ARIES("BẠCH DƯƠNG"), TAURUS("KIM NGƯU"), GEMINI("SONG TỬ"), CANCER("CỰ GIẢI"), LEO("HẢI SỰ"), VIRGO("XỬ NỮ"),
        LIBRA("THIÊN BÌNH"), SCORPIUS("BỌ CÁP"), SAGITTARIUS("NHÂN MÃ"), CAPRICORN("MA KẾT"), LION("SƯ TỬ"),
        AQUARIUS("BẢO BÌNH"), PISCES("SONG NGƯ");

        Zodiac1(String name) {

            zodiac1Name = name;


        }

        private String zodiac1Name;

        private String getZodiac1Name() {

            return zodiac1Name;

        }


    }

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("nhập ngày sinh: ");
            var n = Integer.parseInt(scan.nextLine());
            System.out.print("nhập tháng Sinh: ");
            var m = Integer.parseInt(scan.nextLine());
            Zodiac1 z;

            switch (m) {


                case 1:
                    if (n < 20) {

                        z = Zodiac1.CAPRICORN;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 31) {
                        z = Zodiac1.AQUARIUS;
                        System.out.println(z.getZodiac1Name());

                    } else {
                        System.out.println("nhập lại");
                    }

                    break;
                case 2:
                    if (n <= 18) {

                        z = Zodiac1.AQUARIUS;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 29) {
                        z = Zodiac1.PISCES;
                        System.out.println(z.getZodiac1Name());

                    } else {
                        System.out.println("nhập lại");
                    }

                    break;
                case 3:
                    if (n < 21) {

                        z = Zodiac1.PISCES;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 29) {
                        z = Zodiac1.PISCES;
                        System.out.println(z.getZodiac1Name());

                    } else {
                        System.out.println("nhập lại");
                    }


                    break;
                case 4:
                    if (n <= 20) {

                        z = Zodiac1.ARIES;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 30) {
                        z = Zodiac1.TAURUS;
                        System.out.println(z.getZodiac1Name());

                    }
                    break;
                case 5:
                    if (n <= 20) {

                        z = Zodiac1.TAURUS;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 31) {
                        z = Zodiac1.GEMINI;
                        System.out.println(z.getZodiac1Name());

                    }
                    break;
                case 6:
                    if (n <= 21) {

                        z = Zodiac1.PISCES;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 30) {
                        z = Zodiac1.CANCER;
                        System.out.println(z.getZodiac1Name());

                    }
                    break;
                case 7:
                    if (n <= 22) {

                        z = Zodiac1.CANCER;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 31) {
                        z = Zodiac1.LION;
                        System.out.println(z.getZodiac1Name());

                    }
                    break;
                case 8:
                    if (n <= 22) {

                        z = Zodiac1.LION;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 31) {
                        z = Zodiac1.VIRGO;
                        System.out.println(z.getZodiac1Name());

                    }

                    break;
                case 9:
                    if (n <= 22) {

                        z = Zodiac1.VIRGO;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 30) {
                        z = Zodiac1.LIBRA;
                        System.out.println(z.getZodiac1Name());

                    }
                    break;
                case 10:
                    if (n <= 23) {

                        z = Zodiac1.LIBRA;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 31) {
                        z = Zodiac1.SCORPIUS;
                        System.out.println(z.getZodiac1Name());

                    }
                    break;
                case 11:
                    if (n <= 22) {

                        z = Zodiac1.SCORPIUS;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 30) {
                        z = Zodiac1.SAGITTARIUS;
                        System.out.println(z.getZodiac1Name());

                    }
                    break;
                case 12:
                    if (n <= 21) {

                        z = Zodiac1.SAGITTARIUS;
                        System.out.println(z.getZodiac1Name());

                    } else if (n <= 31) {
                        z = Zodiac1.CAPRICORN;
                        System.out.println(z.getZodiac1Name());

                    }
                    break;


            }
        }while(flag);

    }
    }



