import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;

        Scanner mec = new Scanner(System.in);
        System.out.print("What month were you born: ");
        month = mec.nextInt();

        if ((month <= 12) && (month >= 1)) {

            System.out.print("What day were you born: ");
            day = mec.nextInt();

            //JANUARY
            if ((day <= 31) && (day >= 1)) {
                if (month == 1) {
                    if (day <= 21) {
                        System.out.println("Your Horoscope, CAPRICORN");
                    } else {
                        System.out.println("Your Horoscope, AQUARIUS");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }
            //FEBRUARY
            if ((day <= 29) && (day >= 1)) {
                if (month == 2) {
                    if (day <= 19) {
                        System.out.println("Your Horoscope, AQUARIUS");
                    } else {
                        System.out.println("Your Horoscope, PISCES");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }
            //MARCH
            if ((day <= 31) && (day >= 1)) {
                if (month == 3) {
                    if (day <= 20) {
                        System.out.println("Your Horoscope, PISCES");
                    } else {
                        System.out.println("Your Horoscope, ARIES");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }
            //APRIL
            if ((day <= 30) && (day >= 1)) {
                if (month == 4) {
                    if (day <= 20) {
                        System.out.println("Your Horoscope, ARIES");
                    } else {
                        System.out.println("Your Horoscope, TAURUS");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }
            //MAY
            if ((day <= 31) && (day >= 1)) {
                if (month == 5) {
                    if (day <= 21) {
                        System.out.println("Your Horoscope, TAURUS");
                    } else {
                        System.out.println("Your Horoscope, GEMINI");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }
            //JUNE
            if ((day <= 30) && (day >= 1)) {
                if (month == 6) {
                    if (day <= 22) {
                        System.out.println("Your Horoscope, GEMINI");
                    } else {
                        System.out.println("Your Horoscope, CANCER");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }
            //JULY
            if ((day <= 31) && (day >= 1)) {
                if (month == 7) {
                    if (day <= 22) {
                        System.out.println("Your Horoscope, CANCER");
                    } else {
                        System.out.println("Your Horoscope, LEO");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }
            //AUGUST
            if ((day <= 31) && (day >= 1)) {
                if (month == 8) {
                    if (day <= 22) {
                        System.out.println("Your Horoscope, LEO");
                    } else {
                        System.out.println("Your Horoscope, VIRGO");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }
            //SEPTEMBER
            if ((day <= 30) && (day >= 1)) {
                if (month == 9) {
                    if (day <= 22) {
                        System.out.println("Your Horoscope, VIRGO");
                    } else {
                        System.out.println("Your Horoscope, LIBRA");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }
            //OCTOBER
            if ((day <= 31) && (day >= 1)) {
                if (month == 10) {
                    if (day <= 22) {
                        System.out.println("Your Horoscope, LIBRA");
                    } else {
                        System.out.println("Your Horoscope, SCORPIO");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }
            //NOVEMBER
            if ((day <= 30) && (day >= 1)) {
                if (month == 11) {
                    if (day <= 21) {
                        System.out.println("Your Horoscope, SCORPIO");
                    } else {
                        System.out.println("Your Horoscope, SAGITTARIUS");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }
            //DECEMBER
            if ((day <= 31) && (day >= 1)) {
                if (month == 12) {
                    if (day <= 21) {
                        System.out.println("Your Horoscope, SAGITTARIUS");
                    } else {
                        System.out.println("Your Horoscope, CAPRICORN");
                    }
                }
            } else {
                System.out.println("You entered the wrong day !");
            }

        } else {
            System.out.println("You entered the wrong month !");
        }


    }
}